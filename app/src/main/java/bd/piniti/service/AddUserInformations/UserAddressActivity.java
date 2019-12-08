package bd.piniti.service.AddUserInformations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import bd.piniti.service.R;

public class UserAddressActivity extends AppCompatActivity {

    private Spinner division, districts, subDistricts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_address);

        division = findViewById(R.id.divisions);
        districts = findViewById(R.id.districts);
        subDistricts = findViewById(R.id.sub_districts);

        spinnerDivisionData();

    }

    public void onClick(View view) {
    }

    public void spinnerDivisionData() {

        final String[] divisions = {"Rangpur Division", "Barisal Division", "Chittagong Division",
                "Dhaka Division", "Khulna Division", "Mymensingh Division", "Rajshahi Division", "Sylhet Division"};

        //     Chittagong and Chittagong Subdistricts
        final String[] ChittagongSubdivision = {"Bandarban", "Brahmanbaria", "Chandpur", "Chattogram", "Cumilla",
                "Cox's Bazar", "Feni", "Khagrachhari", "Lakshmipur", "Noakhali", "Rangamati"};
        final String[] BandarbanSubdistricts = {};
        final String[] BrahmanbariaSubdistricts = {};
        final String[] ChandpurSubdistricts = {};
        final String[] ChattogramSubdistricts = {};
        final String[] CumillaSubdistricts = {};
        final String[] CoxBazarSubdistricts = {};
        final String[] FeniSubdistricts = {};
        final String[] KhagrachhariSubdistricts = {};
        final String[] LakshmipurSubdistricts = {};
        final String[] NoakhaliSubdistricts = {};
        final String[] RangamatiSubdistricts = {};

        //     Dhaka and Dhaka Subdistricts
        final String[] DhakaSubdivision = {"Dhaka", "Faridpur", "Gazipur", "Gopalganj", "Kishoreganj", "Madaripur",
                "Manikganj", "Munshiganj", "Narayanganj", "Narsingdi", "Rajbari", "Shariatpur", "Tangail"};
        final String[] DhakaSubdistricts = {};
        final String[] FaridpurSubdistricts = {};
        final String[] GazipurSubdistricts = {};
        final String[] GopalganjSubdistricts = {};
        final String[] KishoreganjSubdistricts = {};
        final String[] MadaripurSubdistricts = {};
        final String[] ManikganjSubdistricts = {};
        final String[] MunshiganjSubdistricts = {};
        final String[] NarayanganjSubdistricts = {};
        final String[] NarsingdiSubdistricts = {};
        final String[] RajbariSubdistricts = {};
        final String[] ShariatpurSubdistricts = {};
        final String[] TangailSubdistricts = {};

        //     Khulna and Khulna Subdistricts
        final String[] KhulnaSubdivision = {"Bagerhat", "Chuadanga", "Jashore", "Jhenaidah", "Khulna", "Kushtia",
                "Magura", "Meherpur", "Narail", "Satkhira"};
        final String[] BagerhatSubdistricts = {};
        final String[] ChuadangaSubdistricts = {};
        final String[] JashoreSubdistricts = {};
        final String[] JhenaidahSubdistricts = {};
        final String[] KhulnaSubdistricts = {};
        final String[] KushtiaSubdistricts = {};
        final String[] MaguraSubdistricts = {};
        final String[] MeherpurSubdistricts = {};
        final String[] NarailSubdistricts = {};
        final String[] SatkhiraSubdistricts = {};

        //   Mymensingh and Mymensingh Subdistricts
        final String[] MymensinghSubdivision = {"Jamalpur", "Mymensingh", "Netrokona", "Sherpur"};
        final String[] JamalpurSubdistricts = {};
        final String[] MymensinghSubdistricts = {};
        final String[] NetrokonaSubdistricts = {};
        final String[] SherpurSubdistricts = {};

        //    Rajshahi and Rajshahi Subdistricts
        final String[] RajshahiSubdivision = {"Bogura", "Jaipurhat", "Naogaon", "Natore", "Chapai", "Nawabganj", "Pabna", "Rajshahi", "Sirajganj"};
        final String[] BoguraSubdistricts = {};
        final String[] JaipurhatSubdistricts = {};
        final String[] NaogaonSubdistricts = {};
        final String[] NatoreSubdistricts = {};
        final String[] ChapaiSubdistricts = {};
        final String[] NawabganjSubdistricts = {};
        final String[] PabnaSubdistricts = {};
        final String[] RajshahiSubdistricts = {};
        final String[] SirajganjSubdistricts = {};

        //   Sylhet and Sylhet Subdistricts
        final String[] SylhetSubdivision = {"Habiganj", "Moulvibazar", "Sunamganj", "Sylhet"};
        final String[] HabiganjSubdistricts = {};
        final String[] MoulvibazarSubdistricts = {};
        final String[] SunamganjSubdistricts = {};
        final String[] SylhetSubdistricts = {};

        //  Barisal and Barisal Subdistricts
        final String[] BarisalSubdivision = {"Barguna", "Barishal", "Bhola", "Jhalokati", "Patuakhali", "Pirojpur"};
        final String[] BargunaSubdistricts = {};
        final String[] BarishalSubdistricts = {};
        final String[] BholaSubdistricts = {};
        final String[] JhalokatiSubdistricts = {};
        final String[] PatuakhaliSubdistricts = {};
        final String[] PirojpurSubdistricts = {};



        //  Rangpur and Rangpur Subdistricts
        final String[] RangpurSubdivision = {"Dinajpur", "Gaibandha", "Kurigram", "Lalmonirhat", "Nilphamari", "Panchagarh", "Rangpur", "Thakurgaon"};

        final String[] ThakurgaonSubdistricts = {"Baliadangi", "Haripur ","Pirganj ","Ranisankail","Thakurgaon Sadar"};
        final String[] RangpurSubdistricts = {"Badarganj","Gangachhara ","Kaunia ","Rangpur Sadar ","Mithapukur ","Pirgachha ","Pirganj ","Taraganj "};
        final String[] PanchagarhSubdistricts = {"Atwari ", "Boda", "Debiganj","Panchagarh Sadar","Tetulia"};
        final String[] DinajpurSubdistricts = {"Birampur", "Birganj", "Biral", "Bochaganj", "Chirirbandar", "Phulbari", "Ghoraghat", "Hakimpur", "Kaharole", "Khansama", "Dinajpur Sadar", "Nawabganj", "Parbatipur"};
        final String[] GaibandhaSubdistricts = {"Phulchhari", " Gaibandha Sadar", "Gobindaganj", " Palashbari", "Sadullapur", " Sughatta", "Sundarganj"};
        final String[] KurigramSubdistricts = {"Bhurungamari", "Char Rajibpur", "Chilmari", " Phulbari", "Kurigram Sadar", "Nageshwari", "Rajarhat", "Raomari", "Ulipur"};
        final String[] LalmonirhatSubdistricts = {"Aditmari", "Hatibandha", "Kaliganj", " Lalmonirhat Sadar", "Patgram"};
        final String[] NilphamariSubdistricts = {"Dimla", "Domar", "Jaldhaka", "Kishoreganj", "Nilphamari Sadar", "Saidpur"};

        final ArrayAdapter<String> divison = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, divisions);
        division.setAdapter(divison);

        division.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                if(position == 0){
                    ArrayAdapter<String> distric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, RangpurSubdivision);
                    districts.setAdapter(distric);

                    districts.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            if(i==0){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, DinajpurSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==1){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, GaibandhaSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==2){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, KurigramSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==3){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, LalmonirhatSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==4){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, NilphamariSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==5){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, PanchagarhSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==6){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, RangpurSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==7){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, ThakurgaonSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }

                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }
                if(position == 1){
                    ArrayAdapter<String> distric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, BarisalSubdivision);
                    districts.setAdapter(distric);

                    districts.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            if(i==0){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, BargunaSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==1){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, BarishalSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==2){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, BholaSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==3){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, JhalokatiSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==4){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, PatuakhaliSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==5){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, PirojpurSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }

                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }
                if(position == 2){
                    ArrayAdapter<String> distric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, ChittagongSubdivision);
                    districts.setAdapter(distric);

                    districts.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            if(i==0){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, BandarbanSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==1){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, BrahmanbariaSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==2){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, ChandpurSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==3){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, ChattogramSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==4){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, CumillaSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==5){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, CoxBazarSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==6){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, FeniSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==7){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, KhagrachhariSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==8){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, LakshmipurSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==9){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, NoakhaliSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==10){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, RangamatiSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }


                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }
                if(position == 3){
                    ArrayAdapter<String> distric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, DhakaSubdivision);
                    districts.setAdapter(distric);

                    districts.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            if(i==0){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, DhakaSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==1){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, FaridpurSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==2){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, GazipurSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==3){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, GopalganjSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==4){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, KishoreganjSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==5){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, MadaripurSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==6){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, ManikganjSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==7){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, MunshiganjSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==8){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, NarayanganjSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==9){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, NarsingdiSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==10){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, RajbariSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==11){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, ShariatpurSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==12){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, TangailSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }
                if(position == 4){
                    ArrayAdapter<String> distric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, KhulnaSubdivision);
                    districts.setAdapter(distric);

                    districts.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            if(i==0){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, BagerhatSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==1){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, ChuadangaSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==2){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, JashoreSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==3){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, JhenaidahSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==4){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, KhulnaSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==5){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, KushtiaSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==6){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, MaguraSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==7){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, MeherpurSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==8){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, NarailSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==9){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, SatkhiraSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }

                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }
                if(position == 5){
                    ArrayAdapter<String> distric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, MymensinghSubdivision);
                    districts.setAdapter(distric);

                    districts.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            if(i==0){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, JamalpurSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==1){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, MymensinghSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==2){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, NetrokonaSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==3){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, SherpurSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }

                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }
                if(position == 6){
                    ArrayAdapter<String> distric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, RajshahiSubdivision);
                    districts.setAdapter(distric);

                    districts.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            if(i==0){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, BoguraSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==1){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, JaipurhatSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==2){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, NaogaonSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==3){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, NatoreSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==4){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, ChapaiSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==5){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, NawabganjSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==6){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, PabnaSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==7){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, RajshahiSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==8){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, SirajganjSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }
                if(position == 7){
                    ArrayAdapter<String> distric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, SylhetSubdivision);
                    districts.setAdapter(distric);

                    districts.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            if(i==0){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, HabiganjSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==1){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, MoulvibazarSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==2){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, SunamganjSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                            if(i==3){
                                ArrayAdapter<String> subdistric = new ArrayAdapter<>(UserAddressActivity.this, android.R.layout.simple_spinner_dropdown_item, SylhetSubdistricts);
                                subDistricts.setAdapter(subdistric);
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}
