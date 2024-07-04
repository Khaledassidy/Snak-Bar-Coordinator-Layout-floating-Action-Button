package com.example.snakbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
 /*

    hala2 la7n ne7ke 3an l coordinator layout:
    coordinator layout howe frame layout
    frame layout howe layout bye2bal 3onsour wa7ad b2labo feek deef 3anser tenye feh bas la7 ysero jeyo l 3anaser stacked fo2 ba3d ya3ne bte8t 2awl button feh bteje la t7ot tene 2am byeje faw2o metl l stack





    */

public class SnakBar_Coordinator_layout_floating_actionbutton extends AppCompatActivity {

   FloatingActionButton floatingActionButton;
   CoordinatorLayout coordinatorLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snak_bar_coordinator_layout_floating_actionbutton);
        floatingActionButton=findViewById(R.id.floatingaction);
        coordinatorLayout=findViewById(R.id.main);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //snak bar
                Snackbar snackbar=Snackbar.make(coordinatorLayout,"hi snakbar",Snackbar.LENGTH_LONG);
                snackbar.setAction("UNDO", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(SnakBar_Coordinator_layout_floating_actionbutton.this, "clicked", Toast.LENGTH_SHORT).show();
                    }
                });
                snackbar.show();
            }
        });

        //le sar houn eno bas kabst al floating action button l snak bar 8ata 3ala l floating action button eja faw2a w heda she 8alat l mafroud l button yetla3 la fo2 w iza badak tes7abo heed la yrou7 ma byemshe l 7al
        //fa l 7al b hay sha8le ma btemshe ela beste3meel l coordinator layout
        //fa mnrou7 badel maa n7ot linear mn7ot coordinator layout
        //note deyamn google btensa7 eno bas tet3emal ma3 l coordianot layout wa2t testa5dem 3anser mawjoude bel support library metl l floatingaction button
        //bas 3mlna heed sar bas yetl3 l snak bar l button btetla3 shway btbtel t8ate 3lyha 8eer heek far feek ta3mel swipe left w right lal snak bar 2am bye5tefe


    }
}