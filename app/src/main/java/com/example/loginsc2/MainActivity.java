package com.example.loginsc2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btn;
    CheckBox  checkBox;
    TextView forp;
    TextView signup;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btnl);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "أدخل بايدك اليمين\n شرفتنا", Toast.LENGTH_LONG).show();
            }
        });
        checkBox = findViewById(R.id.chkbx);
                checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (b) {
                            Toast.makeText(MainActivity.this, "سرك في بير", Toast.LENGTH_LONG).show();
                        }else {
                            Toast.makeText(MainActivity.this, "احسن", Toast.LENGTH_LONG).show();
                        }
                    }
                });
     forp = findViewById(R.id.forp);
     forp.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Toast.makeText(MainActivity.this, "نسيته !!! \n خلي السنيورة تنفعك", Toast.LENGTH_LONG).show();
         }
     });
        signup = findViewById(R.id.signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "الوسايط مبتنفعش", Toast.LENGTH_LONG).show();
            }
        });
    }


    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(MainActivity.this, "أهلا بيك يا أخويا", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(MainActivity.this, "متجيش هنا تاني", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(MainActivity.this, "يلا في داهية", Toast.LENGTH_LONG).show();
    }
}