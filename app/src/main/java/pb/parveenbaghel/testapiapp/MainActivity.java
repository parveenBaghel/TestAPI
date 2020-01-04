package pb.parveenbaghel.testapiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;


public class MainActivity extends AppCompatActivity {
    private AdView adView1;
    String CHANNEL_ID = "channel-01";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        adView1 = (AdView) findViewById(R.id.adView);

        MobileAds.initialize(this, "ca-app-pub-3940256099942544/6300978111");
        //ca-app-pub-3940256099942544/6300978111

        AdRequest adRequest = new AdRequest.Builder().build();
        adView1.loadAd(adRequest);


    }

}
