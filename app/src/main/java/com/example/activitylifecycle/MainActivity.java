package com.example.activitylifecycle;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Vivz", "onCreate: ");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE)
        {
            Log.d("sam", "welcome to Landscape");
        }
         else if (newConfig.orientation==Configuration.ORIENTATION_PORTRAIT)

    {
        Log.d("sam", "welcome to Portrait");
    }

}

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Vivz","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Vivz","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("vivz", "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Vivz","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Vivz","onDestroy");
    }
}
