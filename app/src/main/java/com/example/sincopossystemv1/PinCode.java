package com.example.sincopossystemv1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.pm.ActivityInfo;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class PinCode extends AppCompatActivity implements View.OnClickListener {
    View pinoval1, pinoval2, pinoval3, pinoval4;
    Button num1btn, num2btn, num3btn,num4btn, num5btn, num6btn, num7btn, num8btn, num9btn, num0btn, Clearbtn;

    ArrayList<String> numbers_list = new ArrayList<>();
    String password = "";
    String passCode;
    String num1,num2,num3,num4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin_code);
        // Set the orientation to landscape
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        savePasscode("1234");
        initializeComponents(); {

        }
    }

    private void initializeComponents() {
        pinoval1 = findViewById(R.id.pinoval1);
        pinoval2 = findViewById(R.id.pinoval2);
        pinoval3 = findViewById(R.id.pinoval3);
        pinoval4 = findViewById(R.id.pinoval4);

        num1btn = findViewById(R.id.num1btn);
        num2btn = findViewById(R.id.num2btn);
        num3btn = findViewById(R.id.num3btn);
        num4btn = findViewById(R.id.num4btn);
        num5btn = findViewById(R.id.num5btn);
        num6btn = findViewById(R.id.num6btn);
        num7btn = findViewById(R.id.num7btn);
        num8btn = findViewById(R.id.num8btn);
        num9btn = findViewById(R.id.num9btn);
        Clearbtn = findViewById(R.id.Clearbtn);
        num0btn = findViewById(R.id.num0btn);


        num1btn.setOnClickListener(this);
        num2btn.setOnClickListener(this);
        num3btn.setOnClickListener(this);
        num4btn.setOnClickListener(this);
        num5btn.setOnClickListener(this);
        num6btn.setOnClickListener(this);
        num7btn.setOnClickListener(this);
        num8btn.setOnClickListener(this);
        num9btn.setOnClickListener(this);
        Clearbtn.setOnClickListener(this);
        num0btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.num1btn) {
            numbers_list.add("1");
            Passnumber(numbers_list);
        } else if (view.getId() == R.id.num2btn) {
            numbers_list.add("2");
            Passnumber(numbers_list);
        } else if (view.getId() == R.id.num3btn) {
            numbers_list.add("3");
            Passnumber(numbers_list);
        } else if (view.getId() == R.id.num4btn) {
            numbers_list.add("4");
            Passnumber(numbers_list);
        } else if (view.getId() == R.id.num5btn) {
            numbers_list.add("5");
            Passnumber(numbers_list);
        } else if (view.getId() == R.id.num6btn) {
            numbers_list.add("6");
            Passnumber(numbers_list);
        } else if (view.getId() == R.id.num7btn) {
            numbers_list.add("7");
            Passnumber(numbers_list);
        } else if (view.getId() == R.id.num8btn) {
            numbers_list.add("8");
            Passnumber(numbers_list);
        } else if (view.getId() == R.id.num9btn) {
            numbers_list.add("9");
            Passnumber(numbers_list);
        } else if (view.getId() == R.id.Clearbtn) {
            numbers_list.clear();
            Passnumber(numbers_list);
        } else if (view.getId() == R.id.num0btn) {
            numbers_list.add("0");
            Passnumber(numbers_list);
            }
        }



    private void Passnumber(ArrayList<String> numbers_list) {
        if (numbers_list.size() == 0) {
            pinoval1.setBackgroundResource(R.drawable.bg_pin_black_pin);
            pinoval2.setBackgroundResource(R.drawable.bg_pin_black_pin);
            pinoval3.setBackgroundResource(R.drawable.bg_pin_black_pin);
            pinoval4.setBackgroundResource(R.drawable.bg_pin_black_pin);
        } else {
            switch (numbers_list.size()){
                case 1:
                    num1 = numbers_list.get(0);
                    pinoval1.setBackgroundResource(R.drawable.bg_pin_rgb_pin);
                    break;
                case 2:
                    num2 = numbers_list.get(1);
                    pinoval2.setBackgroundResource(R.drawable.bg_pin_rgb_pin);
                    break;
                case 3:
                    num3 = numbers_list.get(2);
                    pinoval3.setBackgroundResource(R.drawable.bg_pin_rgb_pin);
                    break;
                case 4:
                    num4 = numbers_list.get(3);
                    pinoval4.setBackgroundResource(R.drawable.bg_pin_rgb_pin);
                    passCode = num1 + num2 + num3 + num4;
                    if (getPasscode().length() == 0) {
                        savePasscode(passCode);
                    } else {
                        matchPassCode();
                    }
                    break;
            }
        }
    }

    private void matchPassCode() {
        if (getPasscode().equals(passCode)) {
            startActivity(new Intent(this,HomeActivity.class));
        } else {
            Toast.makeText(this, "Passcode doesn't match please try again.", Toast.LENGTH_SHORT).show();
        }
    }

    private SharedPreferences.Editor savePasscode(String passCode) {
        SharedPreferences preferences = getSharedPreferences("passcode_pref", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("passcode", passCode);
        editor.apply();

        return editor;
    }
    private String getPasscode(){
        SharedPreferences preferences = getSharedPreferences("passcode_pref",Context.MODE_PRIVATE);
        return preferences.getString("passcode", "");
    }
}