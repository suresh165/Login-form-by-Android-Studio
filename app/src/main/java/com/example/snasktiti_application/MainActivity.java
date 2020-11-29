package com.example.snasktiti_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText1,editText2;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.edt_username);
        editText2 = findViewById(R.id.edt_passsword);

        button = findViewById(R.id.btn_click);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // String str1,str2;
               String str1 = editText1.getText().toString();
               String str2 = editText2.getText().toString();

                if (str1.equals("user") && str2.equals("pass")){
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    Toast.makeText(MainActivity.this, "password match", Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }else {
                    Toast.makeText(MainActivity.this, "password is not match", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}