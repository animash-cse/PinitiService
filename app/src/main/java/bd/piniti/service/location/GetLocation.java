package bd.piniti.service.location;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Criteria;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;
import android.widget.Toast;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.io.IOException;
import java.util.List;

import bd.piniti.service.R;
import bd.piniti.service.location.utils.Utility;

public class GetLocation extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener {

    GoogleMap map, userLocation;
    SupportMapFragment mapFragment;
    SearchView searchView;
    private DatabaseReference databaseUser;
    private String message,locText, latLong;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.get_location);


        Bundle bundle = getIntent().getExtras();
        message = bundle.getString("message");
        locText = bundle.getString("locationText");
        latLong = bundle.getString("locationLatlang");

        // Here get user id in currentFirebaseUser
        //  Declare firebase user for get user id
        FirebaseUser currentFirebaseUser = FirebaseAuth.getInstance().getCurrentUser();

        // Set database location
        databaseUser = FirebaseDatabase.getInstance().getReference().child("Users").child(currentFirebaseUser.getUid()).child("Locations");

        Button saveLocation = findViewById(R.id.update_location);
        this.searchView = findViewById(R.id.sv_location);
        this.mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.google_map);
        this.searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            public boolean onQueryTextSubmit(String query) {
                String location = GetLocation.this.searchView.getQuery().toString();
                List list = null;
                if (location != null || !location.equals("")) {
                    try {
                        list = new Geocoder(GetLocation.this).getFromLocationName(location, 1);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    Address address = (Address) list.get(0);
                    LatLng latLng = new LatLng(address.getLatitude(), address.getLongitude());
                    GetLocation.this.map.addMarker(new MarkerOptions().position(latLng).title(location));
                    GetLocation.this.map.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, 12.0f));
                }
                return false;
            }

            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
        this.mapFragment.getMapAsync(this);

        saveLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(GetLocation.this, message, Toast.LENGTH_SHORT).show();
                onBackPressed();
            }
        });


    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        userLocation = googleMap;
        userLocation.setMyLocationEnabled(true);

        googleMap.setOnMarkerClickListener(this);
        LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        Criteria criteria = new Criteria();

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        Location location = locationManager.getLastKnownLocation(locationManager.getBestProvider(criteria, false));

        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(location.getLatitude(), location.getLongitude()), 13));


        CameraPosition cameraPosition = new CameraPosition.Builder()
                .target(new LatLng(location.getLatitude(), location.getLongitude()))      // Sets the center of the map to location user
                .zoom(14)                   // Sets the zoom
                .bearing(90)                // Sets the orientation of the camera to east
                //.tilt(40)                   // Sets the tilt of the camera to 30 degrees
                .build();                   // Creates a CameraPosition from the builder
        googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));

        googleMap.setOnCameraIdleListener(new GoogleMap.OnCameraIdleListener() {
            @Override
            public void onCameraIdle() {
                LatLng latLng = googleMap.getCameraPosition().target;
                String addr = Utility.getAddress(GetLocation.this, latLng);
                searchView.setQuery(addr, false);

                final double lat = latLng.latitude;
                final double log = latLng.longitude;
                String setLocation = lat+","+log;
                databaseUser.child(latLong).setValue(setLocation);
                databaseUser.child(locText).setValue(addr);
            }
        });
        this.map = googleMap;
    }

    @Override
    public boolean onMarkerClick(Marker marker) {
        return false;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

}
