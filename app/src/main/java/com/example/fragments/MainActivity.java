package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //If Fragment is restored from a previous state, in order to avoid overlapping fragments, we do nothing, just return
        if(savedInstanceState != null)
        {
            return;
        }

        //Create an instance of the fragment
        TestFragment testFragment = new TestFragment();

        //If the activity have any instructions from an intent, pass that instructions to the fragment
        testFragment.setArguments(getIntent().getExtras());


        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container,testFragment).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container,new FragmentSecond()).commit();
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