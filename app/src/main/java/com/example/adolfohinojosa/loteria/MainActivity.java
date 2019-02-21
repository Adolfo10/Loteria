package com.example.adolfohinojosa.loteria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageButton img1, img2, img3, img4, img5, img6, img7, img8, img9, img10, img11, img12, img13, img14, img15, img16, izq, der;
    int im1, im2, im3, im4, im5, im6, im7, im8, im9, im10, im11, im12, im13, im14, im15, im16;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        izq = findViewById(R.id.flechaizq1);
        izq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent (v.getContext(), Main3Activity.class);
                startActivityForResult(intent1, 0);
            }
        });
        der = findViewById(R.id.flechader1);
        der.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent (v.getContext(), Main2Activity.class);
                startActivityForResult(intent2, 0);
            }
        });


        img1 = findViewById(R.id.gallo1);
        im1=0;
        img1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(im1 == 0)
                {
                    img1.setImageResource(R.drawable.tapa);
                    im1=1;

                }
                else
                    {
                        img1.setImageResource(R.drawable.gallo);
                        im1=0;
                    }
            }
        });


        img2 = findViewById(R.id.alacran1);
        im2 = 0;
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(im2 == 0)
                {
                    img2.setImageResource(R.drawable.tapa);
                    im2 =1;
                }
                else
                {
                    /*img2.setImageResource(R.drawable.alacran);*/
                    im2=0;
                }
            }
        });


        img3 = findViewById(R.id.arana1);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img3.setImageResource(R.drawable.tapa);
            }
        });


        img4 = findViewById(R.id.arbol1);
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img4.setImageResource(R.drawable.tapa);
            }
        });


        img5 = findViewById(R.id.apache1);
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img5.setImageResource(R.drawable.tapa);
            }
        });


        img6 = findViewById(R.id.escalera1);
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img6.setImageResource(R.drawable.tapa);
            }
        });


        img7 = findViewById(R.id.pino1);
        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img7.setImageResource(R.drawable.tapa);
            }
        });


        img8 = findViewById(R.id.rana1);
        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img8.setImageResource(R.drawable.tapa);
            }
        });


        img9 = findViewById(R.id.estrella1);
        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img9.setImageResource(R.drawable.tapa);
            }
        });


        img10 = findViewById(R.id.calavera1);
        img10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img10.setImageResource(R.drawable.tapa);
            }
        });

        img11 = findViewById(R.id.rosa1);
        img11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img11.setImageResource(R.drawable.tapa);
            }
        });


        img12 = findViewById(R.id.valiente1);
        img12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img12.setImageResource(R.drawable.tapa);
            }
        });


        img13 = findViewById(R.id.dama1);
        img13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img13.setImageResource(R.drawable.tapa);
            }
        });


        img14 = findViewById(R.id.sirena1);
        img14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img14.setImageResource(R.drawable.tapa);
            }
        });


        img15 = findViewById(R.id.venado1);
        img15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img15.setImageResource(R.drawable.tapa);
            }
        });


        img16 = findViewById(R.id.diablito1);
        img16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img16.setImageResource(R.drawable.tapa);
            }
        });






    }
}