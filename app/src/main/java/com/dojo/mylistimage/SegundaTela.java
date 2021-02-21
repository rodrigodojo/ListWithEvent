package com.dojo.mylistimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class SegundaTela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);

        Bundle extras = getIntent().getExtras();

        if(extras != null){
            String texto = extras.getString("nome");
            Toast.makeText(this,""+texto,Toast.LENGTH_SHORT).show();
        }
    }
}