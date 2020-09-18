package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new TestFragment()).commit();
        Log.d("state", "onCreate Activity Called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("state", "onStart Activity Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("state", "onResume Activity Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("state", "onPause Activity Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("state", "onPause Activity Called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("state", "onRestart Activity Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("state", "onDestroy Activity Called");
    }

}