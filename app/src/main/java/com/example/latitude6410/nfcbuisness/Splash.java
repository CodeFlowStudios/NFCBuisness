package com.example.latitude6410.nfcbuisness;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Latitude6410 on 10/7/2016.
 */
public class Splash extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        Thread timer = new Thread(){
        public void run(){
            try{
                sleep(2000);
            }catch (InterruptedException e){

            }finally{
                Intent openMainActivivty = new Intent("com.example.latitude6410.nfcbuisness.LOGINACTIVITY");
                startActivity(openMainActivivty);

            }
        }


        };
        timer.start();

    }
}
