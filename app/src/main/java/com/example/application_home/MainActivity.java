package com.example.application_home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText password;
    private EditText text;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        setContentView(R.layout.activity_main);
        password= findViewById(R.id.password);
    text = findViewById(R.id.vvedite_pochtu);
    button = findViewById(R.id.voiti);
    password.addTextChangedListener(loginTextWatcher);
    text.addTextChangedListener(loginTextWatcher);

    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (!text.getText().toString().isEmpty() && !password.getText().toString().isEmpty()){
                Toast.makeText(MainActivity.this, "Добро пожалывать:)", Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(MainActivity.this, "Не правильный пароль или логин!!!", Toast.LENGTH_SHORT).show();
            }
        }
    });
    }
    private TextWatcher loginTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence s, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable s) {
        if (text.getText().toString().isEmpty()){
            button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.gray));
        }else {
            button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.yellow));
        }
        }
    };

            }



