package com.example.espressodemo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button1).setOnClickListener(v -> {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivityForResult(intent, 10);
        });

        getSupportFragmentManager().beginTransaction()
                .setReorderingAllowed(true)
                .add(R.id.frag_container, FragmentOne.class, null)
                .commit();

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 10 && resultCode == RESULT_OK) {
            Toast.makeText(this, data.getStringExtra("name"), Toast.LENGTH_SHORT).show();
        }
    }
}