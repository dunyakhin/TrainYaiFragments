 package com.example.infofragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

 public class MainActivity extends AppCompatActivity {
Button personalCabinet, webFragmentButton, background;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        personalCabinet=findViewById(R.id.personalCabinetButton);
        webFragmentButton=findViewById(R.id.webFragmentButton);
        background=findViewById(R.id.webFragmentButton);

    }
    public void change(View view){
FragmentManager fm=getSupportFragmentManager();
    FragmentTransaction ft=fm.beginTransaction();
            switch (view.getId()) {
                case R.id.webFragmentButton:
                    ft.add(R.id.startFragment, new WebFragment());
                    ft.addToBackStack(null);
                    break;
                case R.id.personalCabinetButton:
                    ft.add(R.id.startFragment, new StartFragment());
                    ft.addToBackStack(null);
                    break;
                case R.id.backgroundButton:
                    ft.replace(R.id.startFragment, new BackgroundFragment());
                    break;
                case R.id.buttonStart:
                    ft.add(R.id.startFragment, new EnterFragment());
                    ft.addToBackStack(null);
                    break;
            }
            ft.commit();
        }
     }


