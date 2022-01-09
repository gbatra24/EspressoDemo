package com.example.espressodemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        EditText etName = findViewById(R.id.etName);
        findViewById(R.id.button2).setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.putExtra("name", etName.getText().toString());
            setResult(RESULT_OK, intent);
            finish();
        });
    }
}