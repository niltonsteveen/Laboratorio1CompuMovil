package com.example.jesus.ejemplo_ventanas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;

public class Main2Activity extends AppCompatActivity {
    LinearLayout rating;
    LinearLayout rating1;
    LinearLayout rating2;
    LinearLayout rating3;

    CheckBox star;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        rating=(LinearLayout)findViewById(R.id.ratings);
        for(int i= 1; i<=5;i++){
            star=(CheckBox)rating.findViewWithTag(String.valueOf(i));
            star.setOnClickListener(starsListener);
        }

        rating1=(LinearLayout)findViewById(R.id.ratings1);
        for(int i= 1; i<=5;i++){
            star=(CheckBox)rating1.findViewWithTag(String.valueOf(i));
            star.setOnClickListener(starsListener1);
        }

        rating2=(LinearLayout)findViewById(R.id.ratings2);
        for(int i= 1; i<=5;i++){
            star=(CheckBox)rating2.findViewWithTag(String.valueOf(i));
            star.setOnClickListener(starsListener2);
        }

        rating3=(LinearLayout)findViewById(R.id.ratings3);
        for(int i= 1; i<=5;i++){
            star=(CheckBox)rating3.findViewWithTag(String.valueOf(i));
            star.setOnClickListener(starsListener3);
        }
    }

    private View.OnClickListener starsListener= new View.OnClickListener(){
        public void onClick(View view){
            int tag= Integer.valueOf((String)view.getTag());

            for (int i=1; i<= tag; i++){
                star =(CheckBox) rating.findViewWithTag(String.valueOf(i));
                star.setChecked(true);
            }

            for(int i=tag+1 ; i<=5; i++){
                star=(CheckBox)rating.findViewWithTag(String.valueOf(i));
                star.setChecked(false);
            }
        }
    };

    private View.OnClickListener starsListener1= new View.OnClickListener(){
        public void onClick(View view){
            int tag= Integer.valueOf((String)view.getTag());

            for (int i=1; i<= tag; i++){
                star =(CheckBox) rating1.findViewWithTag(String.valueOf(i));
                star.setChecked(true);
            }

            for(int i=tag+1 ; i<=5; i++){
                star=(CheckBox)rating1.findViewWithTag(String.valueOf(i));
                star.setChecked(false);
            }
        }
    };

    private View.OnClickListener starsListener2= new View.OnClickListener(){
        public void onClick(View view){
            int tag= Integer.valueOf((String)view.getTag());

            for (int i=1; i<= tag; i++){
                star =(CheckBox) rating2.findViewWithTag(String.valueOf(i));
                star.setChecked(true);
            }

            for(int i=tag+1 ; i<=5; i++){
                star=(CheckBox)rating2.findViewWithTag(String.valueOf(i));
                star.setChecked(false);
            }
        }
    };

    private View.OnClickListener starsListener3= new View.OnClickListener(){
        public void onClick(View view){
            int tag= Integer.valueOf((String)view.getTag());

            for (int i=1; i<= tag; i++){
                star =(CheckBox) rating3.findViewWithTag(String.valueOf(i));
                star.setChecked(true);
            }

            for(int i=tag+1 ; i<=5; i++){
                star=(CheckBox)rating3.findViewWithTag(String.valueOf(i));
                star.setChecked(false);
            }
        }
    };
}