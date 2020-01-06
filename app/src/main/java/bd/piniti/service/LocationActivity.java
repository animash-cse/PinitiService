package bd.piniti.service;

import android.Manifest;
import android.app.Dialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;

import bd.piniti.service.location.GetLocation;
import bd.piniti.service.location.utils.Utility;

public class LocationActivity extends AppCompatActivity {


    private CardView cardview;
    private TextView location, home, work, chooseOnMap;
    private EditText addr;
    private LatLng mLatLng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        addr = findViewById(R.id.address);
        location = findViewById(R.id.detect_my_location);
        home = findViewById(R.id.home_location);
        work = findViewById(R.id.work_location);
        chooseOnMap = findViewById(R.id.choose_on_map);
        cardview = findViewById(R.id.cardview);
        cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LocationActivity.this, SearchingActivity.class);
                startActivity(intent);
            }
        });
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LocationActivity.this, GetLocation.class);
                startActivity(intent);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMapsDialog();
            }
        });
        work.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LocationActivity.this, GetLocation.class);
                startActivity(intent);
            }
        });
        chooseOnMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LocationActivity.this, GetLocation.class);
                startActivity(intent);
            }
        });
    }

    private void showMapsDialog() {
        Dialog dialog = new Dialog(LocationActivity.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND); //make map clear
        dialog.setContentView(R.layout.dialog_maps);

        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
        lp.copyFrom(dialog.getWindow().getAttributes());
        lp.width = WindowManager.LayoutParams.MATCH_PARENT;
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
        //lp.gravity = Gravity.CENTER;
        dialog.getWindow().setAttributes(lp);

        dialog.setCancelable(true); //dismiss by clicking outside
        dialog.show();

        MapView mMapView = (MapView) dialog.findViewById(R.id.mapView);
        MapsInitializer.initialize(LocationActivity.this);
        mMapView.onCreate(dialog.onSaveInstanceState());
        mMapView.onResume();

        mMapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(final GoogleMap googleMap) {
                if (ActivityCompat.checkSelfPermission(LocationActivity.this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                    googleMap.setMyLocationEnabled(true);
                } else {
                    googleMap.setMyLocationEnabled(true);
                }
                googleMap.getUiSettings().setZoomControlsEnabled(true);
                googleMap.getUiSettings().setAllGesturesEnabled(true);
                googleMap.getUiSettings().setZoomGesturesEnabled(true);

                if (mLatLng != null) {
                    Utility.moveToLocation(googleMap, mLatLng);
                }

                googleMap.setOnCameraIdleListener(new GoogleMap.OnCameraIdleListener() {
                    @Override
                    public void onCameraIdle() {
                        LatLng latLng = googleMap.getCameraPosition().target; //float mZoom = mMap.getCameraPosition().zoom; //double lat =  mMap.getCameraPosition().target.latitude; //double lng =  mMap.getCameraPosition().target.longitude;
                        String address = Utility.getAddress(LocationActivity.this, latLng);
                        //addr.setText(address);
                    }
                });

                ((Button) dialog.findViewById(R.id.pick_point_ok)).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //addr.setVisibility(View.VISIBLE);
                        dialog.dismiss();
                    }
                });

                /*if (mLatLng != null) {
                    Utility.moveToLocation(googleMap, mLatLng);
                    googleMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() {
                        @Override
                        public void onMapClick(LatLng latLng) {
                            String address = Utility.getAddress(PostAdActivity.this, mLatLng);
                            Log.d(TAG, "Address: "+address);
                            Log.d(TAG, "LatLng: "+mLatLng);
                            googleMap.addMarker(new MarkerOptions().position(new LatLng(latLng.latitude, latLng.longitude)).title(address)).setIcon(BitmapDescriptorFactory.fromResource(R.drawable.ic_house2));//position:(lat,lng).title(address).setIcon(drawable)

                            addr.setVisibility(View.VISIBLE);
                            addr.setText(address);
                            dialog.dismiss();
                        }
                    });
                }*/
            }
        });
    }
}
