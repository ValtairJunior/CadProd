package br.valtair.cadpro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FindProduct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_product);

        Button btnVoltar = findViewById(R.id.btnVoltarConsu);
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chamaMain = new Intent(FindProduct.this, MainActivity.class);
                startActivity(chamaMain);
            }
        });
    }

}