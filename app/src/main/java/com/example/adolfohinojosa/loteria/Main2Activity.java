package com.example.adolfohinojosa.loteria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    ImageButton img1, img2, img3, img4, img5, img6, img7, img8, img9, img10, img11, img12, img13, img14, img15, img16, izq, der;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        izq = findViewById(R.id.flechaizq2);
        izq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent (v.getContext(), MainActivity.class);
                startActivityForResult(intent3, 0);
            }
        });
        der = findViewById(R.id.flechader2);
        der.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent (v.getContext(), Main3Activity.class);
                startActivityForResult(intent4, 0);
            }
        });

        img1 = findViewById(R.id.gorrito2);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img1.setImageResource(R.drawable.tapa);
            }
        });


        img2 = findViewById(R.id.sol2);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img2.setImageResource(R.drawable.tapa);
            }
        });


        img3 = findViewById(R.id.soldado2);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img3.setImageResource(R.drawable.tapa);
            }
        });


        img4 = findViewById(R.id.apache2);
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img4.setImageResource(R.drawable.tapa);
            }
        });


        img5 = findViewById(R.id.arpa2);
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img5.setImageResource(R.drawable.tapa);
            }
        });


        img6 = findViewById(R.id.escalera2);
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img6.setImageResource(R.drawable.tapa);
            }
        });


        img7 = findViewById(R.id.pino2);
        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img7.setImageResource(R.drawable.tapa);
            }
        });


        img8 = findViewById(R.id.rana2);
        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img8.setImageResource(R.drawable.tapa);
            }
        });


        img9 = findViewById(R.id.bandera2);
        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img9.setImageResource(R.drawable.tapa);
            }
        });


        img10 = findViewById(R.id.calavera2);
        img10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img10.setImageResource(R.drawable.tapa);
            }
        });

        img11 = findViewById(R.id.bota2);
        img11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img11.setImageResource(R.drawable.tapa);
            }
        });


        img12 = findViewById(R.id.borracho2);
        img12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img12.setImageResource(R.drawable.tapa);
            }
        });


        img13 = findViewById(R.id.sandolon2);
        img13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img13.setImageResource(R.drawable.tapa);
            }
        });


        img14 = findViewById(R.id.barril2);
        img14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img14.setImageResource(R.drawable.tapa);
            }
        });


        img15 = findViewById(R.id.mano2);
        img15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img15.setImageResource(R.drawable.tapa);
            }
        });


        img16 = findViewById(R.id.maceta2);
        img16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img16.setImageResource(R.drawable.tapa);
            }
        });






    }
}
