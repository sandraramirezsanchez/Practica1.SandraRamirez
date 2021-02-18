package com.example.practica1sandraramirez;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        EditText edname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click (View vista){
        edname = findViewById(R.id.et_name);
        String nombre = String.valueOf(edname.getText());
        Toast.makeText(this, "Hola "+nombre, Toast.LENGTH_SHORT).show();
    }
}