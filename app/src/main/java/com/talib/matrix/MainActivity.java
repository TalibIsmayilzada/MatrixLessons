package com.talib.matrix;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("fsdfsdfsdfs","onPause");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("fsdfsdfsdfs","onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("fsdfsdfsdfs","onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("fsdfsdfsdfs","onDestroy");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("fsdfsdfsdfs","onResume");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("fsdfsdfsdfs","onRestart");

    }
}