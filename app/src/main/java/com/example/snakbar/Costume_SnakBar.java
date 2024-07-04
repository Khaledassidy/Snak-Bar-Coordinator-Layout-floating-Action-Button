package com.example.snakbar;

import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.google.android.material.snackbar.Snackbar;


//costume snak bar:
//keef 3mlna costume toast nafs l 5otwet

/*
1-mna3mel object mn snak bar bhay tare2a  Snackbar snackbar=Snackbar.make() Snakbar.make btrje3lk snakbar object
2-b2alb l make (mna3te aye view,aye text,duration) ba3den ma mn7ot .show la2
3-hala2 ba3d ma 3mlna snakbar.make() 7a traj3lk objct mn snak bar heda fe hawde l ma3lomet 7a  tet5azan b variable snakbar1 of type SnakBar
4-3ana attribute b2alb l snakbar1 esma setaction bte5od text 2awl she bel snak bar btle2e enta 3mlt delete 2a3m tel3lk snak bar fe b2labo kabse maktob feha UNDO ya3ne l 8eha w iza kabst  l undo ya3ne enta 8ayrt ra2yak ma tem7e she
fa keef bta3mela bhay l attribute 2awl she : snakbar1.setAction() 2awl parameter sho esm l kabse b string masln badak tsmaeha "UNDO"  snakbar1.setAction("UNDO",) tene parameter badak t7ot eno bas tenbasa hay l kabse sho yseer ya3ne click lisner bhay tare2a  snakbar1.setAction("UNDO",new viewonclicklistner(){
onclick(View view){
)};




*/

public class Costume_SnakBar extends AppCompatActivity {

    Button button_Costume_S;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_costume_snak_bar);
        button_Costume_S=findViewById(R.id.button_costume_snakbar);
        Snackbar snackbar1=Snackbar.make(button_Costume_S,"hello from costume snakbar",Snackbar.LENGTH_LONG);

            snackbar1.setAction("UNDO", new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(Costume_SnakBar.this, "OK UNDO", Toast.LENGTH_SHORT).show();
                }
            });
            //fene 8ayer l 2alwen costumize aktar


            View view=snackbar1.getView();

            //change background: way
            //if color 2awl she : set backgroundcolor lezm jeeb l color l R.color.purpule is id reference of color but not value purpule so la njeeb l color mna3mel heek             int bachgroundcolor= ContextCompat.getColor(this,R.color.purpule);
             int bachgroundcolor= ContextCompat.getColor(this,R.color.purpule);

             //first way to chage back ground: snackbar1.setBackgroundTint(bachgroundcolor1);
             snackbar1.setBackgroundTint(bachgroundcolor);


            //badna njeeb l text view ta3el l msg w n8ayer loun w l size la njeba mn 5elel l id heda com.google.android.material.R.id.snackbar_text lesh l2no l snak bar howe bel support library ta3et design fa heed l id
            TextView snackbarTextView = view.findViewById(com.google.android.material.R.id.snackbar_text);
            snackbarTextView.setTextSize(TypedValue.COMPLEX_UNIT_SP,20);
            snackbarTextView.setTextColor(Color.RED);

           //badna njeeb l button ta3el l text ta3et l action w n8ayer loun w l size la njeba mn 5elel l id heda com.google.android.material.R.id.snackbar_action lesh l2no l snak bar howe bel support library ta3et design fa heed l id 2aw
            //tare2a tenye: snackbar1.setActionTextColor()
            Button snackbar_button = view.findViewById(com.google.android.material.R.id.snackbar_action);
            snackbar_button.setTextSize(TypedValue.COMPLEX_UNIT_SP,25);
            snackbar_button.setTextColor(Color.BLUE);

            //iza bade e5fe lal action bar b2awt m3yan b2ede ya3ne
//            snackbar1.dismiss();




           snackbar1.show();


           /*
            bel corrdinate layout metl ma 2olna eno iza 7atyna floating action button w 7atyna Snakbar.make(floating action button) bedalo yetal3 yetla3 byes2al l parent hal howe coordinate layout la7ed ma yle2e coordinate bya3mel 3lyha display lal coordinate iza la2 ma fe coordinate layout bya3mel display 3ala l root

            l coordinate layout 3mlo 3ashen ye2dar yet3mela ma3 l child directly not nested

            coordinate layout byedar ya3mel animation ma3 l material support library bas yeje snakbar metl:floating action button,button compat
            first case :3ana coordinate layout w b2albo  fe ba floating action button fa ne7na 7atyna Snakbar.make(floating action button) fa houn b ma 2no l floating action button heye directly b2lab l coordinate layout so fe communication baynetoun 2aweye fa bas yeje l snak bar 2awl she 7a yshof l parent howe coordinate fa do8re 7a ye2dar ya3mel animation 3ala l flaoting action button w ytla3e la fo2 l2no l coordinate shefa lal floating action button 3eref ween ma7ala fa bas eja l snakbar 2eder tala3a la fo2 l2no byaref l coordinate ween ma7la lal floating action button ma howe ne7na 2olna 7a ye5od floating action button w yshof l parrent iza heye coordinta bhay l 7ale foloating action button shef directly l coordinate
            second case:3ana coordinate layout w b2albo  fe ba floating action button fa ne7na 7atyna Snakbar.make(coordinate layput) fa houn b ma 2no l floating action button heye directly b2lab l coordinate layout so fe communication baynetoun 2aweye fa bas yeje l snak bar 2awl she 7a yshof l parent howe coordinate fa do8re 7a ye2dar ya3mel animation 3ala l flaoting action button w ytla3e la fo2 l2no l coordinate shefa lal floating action button 3eref ween ma7ala fa bas eja l snakbar 2eder tala3a la fo2 l2no byaref l coordinate ween ma7la lal floating action button
            third case:3ana coordinate layout b2alba fe nested layout maslan linear b2lab linear w b2alb hal linear fe floating action button w 7atyna snakbar.make(floating action button) fa 7a yetla3 bel layout la yshof ween l coordinate w yeje ya3mel l snak bar 3al coordinate la yout bas houn howe eja la ya3mel animation lal floating action button ytlae3ea la fo2 bas shefa b2lab linear layout w l coorddinate layout ma bha3mel animation ela lal material support library so ma 7a ye2dar ya3mel anumation lal linear layout so ma 7yseer animation lmeshkle eno sa7 7a yshofa lal floating action button bas 7a yshofa ma3 linear layout ma houn l meshkle
            forth case:3ana coordinate layout b2alba fe nested layout maslan linear b2lab linear w b2alb hal linear fe floating action button w 7atyna snakbar.make(coordinate layout) fa 7oun l coordinate layout la yshof ween l coordinate w yeje ya3mel l snak bar 3al coordinate la yout bas houn howe eja la ya3mel animation lal floating action button ytlae3ea la fo2 bas shefa b2lab linear layout w l coorddinate layout ma bha3mel animation ela lal material support library so ma 7a ye2dar ya3mel anumation lal linear layout so ma 7yseer animation lmeshkle eno sa7 7a yshofa lal floating action button bas 7a yshofa ma3 linear layout ma houn l meshkle






            */

    }
}