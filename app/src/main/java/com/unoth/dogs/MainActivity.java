package com.unoth.dogs;

import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewModel = new ViewModelProvider(this).get(MainViewModel.class);
        viewModel.loadDogImg();
        viewModel.getDogImg().observe(this, new Observer<DogImg>() {
            @Override
            public void onChanged(DogImg dogImg) {
                Log.d(TAG, dogImg.toString());
            }
        });
    }

}