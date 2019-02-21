package com.example.adolfohinojosa.loteria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;


public class Main3Activity extends AppCompatActivity {

    ImageButton img1, img2, img3, img4, img5, img6, img7, img8, img9, img10, img11, img12, img13, img14, img15, img16, izq, der;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        izq = findViewById(R.id.flechaizq3);
        izq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(v.getContext(), Main2Activity.class);
                startActivityForResult(intent5, 0);
            }
        });
        der = findViewById(R.id.flechader3);
        der.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(v.getContext(), MainActivity.class);
                startActivityForResult(intent6, 0);
            }
        });


        img1 = findViewById(R.id.melon3);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img1.setImageResource(R.drawable.tapa);
            }
        });


        img2 = findViewById(R.id.muerte3);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img2.setImageResource(R.drawable.tapa);
            }
        });


        img3 = findViewById(R.id.mundo3);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img3.setImageResource(R.drawable.tapa);
            }
        });


        img4 = findViewById(R.id.musico3);
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img4.setImageResource(R.drawable.tapa);
            }
        });


        img5 = findViewById(R.id.jaras3);
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img5.setImageResource(R.drawable.tapa);
            }
        });


        img6 = findViewById(R.id.campana3);
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img6.setImageResource(R.drawable.tapa);
            }
        });


        img7 = findViewById(R.id.catrin3);
        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img7.setImageResource(R.drawable.tapa);
            }
        });


        img8 = findViewById(R.id.cantaro3);
        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img8.setImageResource(R.drawable.tapa);
            }
        });


        img9 = findViewById(R.id.cazo3);
        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img9.setImageResource(R.drawable.tapa);
            }
        });


        img10 = findViewById(R.id.calavera3);
        img10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img10.setImageResource(R.drawable.tapa);
            }
        });

        img11 = findViewById(R.id.chalupa3);
        img11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img11.setImageResource(R.drawable.tapa);
            }
        });


        img12 = findViewById(R.id.corazon3);
        img12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img12.setImageResource(R.drawable.tapa);
            }
        });


        img13 = findViewById(R.id.cotorro3);
        img13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img13.setImageResource(R.drawable.tapa);
            }
        });


        img14 = findViewById(R.id.camaron3);
        img14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img14.setImageResource(R.drawable.tapa);
            }
        });


        img15 = findViewById(R.id.dama3);
        img15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img15.setImageResource(R.drawable.tapa);
            }
        });


        img16 = findViewById(R.id.bota3);
        img16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img16.setImageResource(R.drawable.tapa);
            }
        });


    }
}

