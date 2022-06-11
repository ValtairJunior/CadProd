package br.valtair.cadpro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSair = findViewById(R.id.btnSair);
        Button btnCad = findViewById(R.id.btnCad);
        Button btnCon = findViewById(R.id.btnCon);
        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chamaLogin = new Intent(MainActivity.this, Login.class);
                startActivity(chamaLogin);
            }
        });
        btnCad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chamaCadPro = new Intent(MainActivity.this, CadProduct.class);
                startActivity(chamaCadPro);
            }
        });
        btnCon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buscaPro = new Intent(MainActivity.this, FindProduct.class);
                startActivity(buscaPro);
            }
        });

    }
}