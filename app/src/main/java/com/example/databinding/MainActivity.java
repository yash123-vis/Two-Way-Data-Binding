package com.example.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;
    private MyClickHandler myClickHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Data Binding with TextView
        Person p1 = new Person("Jack", "jack@gmail.com");

        activityMainBinding = DataBindingUtil.setContentView(
                this, R.layout.activity_main);

        activityMainBinding.setPerson(p1);

        myClickHandler = new MyClickHandler(MainActivity.this);

        activityMainBinding.setClickHandler(myClickHandler);
    }
}
