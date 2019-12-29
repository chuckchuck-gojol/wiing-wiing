package com.jyami.wiingwiing_black;


import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class EarphoneActivity extends AppCompatActivity {
    static int seekValue;
    BroadcastReceiver bR=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earphone);

        Button registerButton = (Button) findViewById(R.id.registerButton);
        registerButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                register(v);
            }
        });

        Button launchButton = (Button) findViewById(R.id.launchButton);
        launchButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                musicLaunch(v);
            }
        });
    }

    public void register(View view){
        bR=new EarphoneStateReceiver();
        IntentFilter intentFilter=new IntentFilter();
        intentFilter.addAction(Intent.ACTION_HEADSET_PLUG);
        registerReceiver(bR, intentFilter);
        Toast.makeText(this, "Receiver Registered", Toast.LENGTH_SHORT).show();
        SeekBar seekBar=(SeekBar)findViewById(R.id.seekBar);
        seekValue=seekBar.getProgress();
    }

    public void musicLaunch(View view){
        //To launch the specific package (for CyanogenMod Eleven Music Player)
//        try {
//            PackageManager packageManager = getPackageManager();
//            Intent intent = new Intent(Intent.ACTION_MAIN);
//            intent = packageManager.getLaunchIntentForPackage("com.cyanogenmod.eleven");
//            intent.addCategory(Intent.CATEGORY_LAUNCHER);
//            startActivity(intent);
//        }catch(Exception e){
//            Toast.makeText(this, "Error in launching music player", Toast.LENGTH_SHORT).show();
//        }

        //To launch the default music player app on any phone.

        if(Build.VERSION.SDK_INT>=15) {
            try {
                Intent intent = Intent.makeMainSelectorActivity(Intent.ACTION_MAIN, Intent.CATEGORY_APP_MUSIC);
                startActivity(intent);
            } catch (Exception e) {
                Toast.makeText(this, "Error opening music app", Toast.LENGTH_SHORT).show();
            }
        }
        else{
            try{
                Intent intent=new Intent("android.intent.action.MUSIC_PLAYER");
            } catch (Exception e){
                Toast.makeText(this, "Error opening music app", Toast.LENGTH_SHORT).show();
            }
        }
    }
}