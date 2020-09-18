package com.example.fragments;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class TestFragment extends Fragment {

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d("state", "onAttach Fragment Called");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("state", "onCreate Fragment Called");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("state", "onActivityCreated Fragment Called");
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.fragment_layout,container,false);
         setHasOptionsMenu(true);
        Log.d("state", "onCreateView Fragment Called");
        return v;
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("state", "onStart Fragment Called");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("state", "onResume Fragment Called");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("state", "onPause Fragment Called");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("state", "onStop Fragment Called");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("state", "onDestroyView Fragment Called");
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        inflater.inflate(R.menu.menu,menu);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("state", "onDestroy Fragment Called");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("state", "onDetach Fragment Called");
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.item1:
                Toast.makeText(getContext(), "This is item "+ item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item2:
                Toast.makeText(getContext(), "This is item "+ item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item3:
                Toast.makeText(getContext(), "This is item "+ item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;
        }
        return false;
    }
    
}
