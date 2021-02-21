package com.dojo.mylistimage;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class SegundaTela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);

        ImageView icone = findViewById(R.id.meuIcone);
        TextView nome = findViewById(R.id.txtNome);
        TextView desc = findViewById(R.id.txtDescr);


        Bundle extras = getIntent().getExtras();

        if(extras != null){
            String txtNome = extras.getString("nome");
            String txtDescr = extras.getString("descricao");
            int iconeid = extras.getInt("icone");

            icone.setImageResource(iconeid);
            nome.setText(txtNome);
            desc.setText(txtDescr);
        }

    }
}