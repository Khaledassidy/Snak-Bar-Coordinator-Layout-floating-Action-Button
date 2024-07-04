package com.example.snakbar;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;


/*
ne7na kona no3oroud message b toast
hala2 3ana tare2a la no3rod message metl tost bteshbah toast esma snak bar
snakbar:heye msg mt3ml slide up mn ta7t sheshe w bte5tfee ba3d ftra m3ayne mokadra bftret l toast messgae ya3ne senyeten 2aw 3 sawene hyde l 3amlye btetsma b snakbar

la nesta5dem l snakbar keef kona na3ml bel toast Toast.maktext....
Toast keen momekn yezhar iza shshe msakra bas l snak bar la2 mamoken yezhar ela iza shshe mafto7a

snakbar nafs she ta2rebn mna3mle snakbar.make() l make bye5od 3 eshya:
1-2awl sha8le view ma bye5od context mtl l toast l2no howe mertebet b view toast mtl ma 2olna momken yezhar iza shshe msakra w sbaba be3oud l2no howe bye5od context 2ama l snak bar mesh momken yezhar iza shshe msakra lesh l2no ma bye5od context fa mesh momken ezher snakbar bel hawa metl l toast lezm ykoun m3ala2 b tasmem m3yan
2-parameter tene howe text le badak to3rdo l msg
3-diration adesh wa2t badak ten3ered l snakbar metl lengthlong,lengthshort
 w 2e5er she bet7ot method show() 3ashen tezhar


 2awl she badna nshof sho howe l view le badna nrakbo 3al snak bar:
 eje 7akelak tasmem l mawjoud 3andak bel main activity la n2ool root 7atyna b2albo button eja 7akelak sho l view le badak t7ota enta bel make 2alak aye view mawjoude bel shshe le badak to3roud feha l snakbar
 sho ya3ne ya3ne la n2ool shshe l mainactivity feha 100 view w badak to3roud snak bar bel mainactivity alak 7ot aye view mawjoud bel main activity bel method l make w ana bo3rdlak l snakbar b 2e5er shshe

 tyeb lesh howe ma sabat l mawdo3 w 5alene a3te shshe nafsa w sam7le e5od aye view?

 enta bta3te la method l make view mawjoud 3andak la nofroud l button la te5od l button w dala ta3mel search bel ab ta3el heeda l button dala tetela3 tela3 la tshof sho l parent ta3el heeda l button la7ed ma tosal 3end ab esmo coordinator layout

 coordinator layout:howe nou3 mn anwa3 l layout w howe aseso frame layout w le frame layout  howe l layout le bye5od 3onsour wa7ad
 ases l coordiantor layput howe frame layout bas b costoumization m3ayane w btafselete zyede 3an l frame layout

 ya3ne le bseet bye5od l make() method l button w byetla3 3end l ab ta3elo beshof hal howe coordinator layout:
 -if yes:bye3rdo 3ala l coordinator layout
 -if no:iza keen l ab ta3el l button mano coordinator layout byetla3 3al ab le faw2o beshofo hal howe coordinator layout iza la2 kamen rou7 3end abo le ba3do beshofo kamen hal howe coordinator layout bedalo 3am yetlaa33 tlo33 3am yfatesh 3ala coordinator layout yetala3 yetal3333 la7ed ma yosal 3end root iza mala2a wala coordinator layout byo3roda 3ala l root le howe masln costarint 7ayokoun 2aw linear layout realtiveee..etc
 fa fey3layn enta 3atyto view b2alb shshe w tasmem kolo ta3elak ma fe coordinator layout 7a yo3rdo 3al root ta3el l activity
 byo3rdo 3al root l2no bedalo yetla3 w ya3mel search bel ab ta3elooo la7ed ma yosal la coordinator layout w be ma 2no ma 3ana coordinator layout la7 yozhro 3al root le howe constaint,linear,relative..etc


- tyeb hala2 2awl she 7a rou7 3al activity ta3ete l main 2a3ml button esma ok erja3 2a3mla findview by id bel java file






*/
public class Diffult_SnakBar extends AppCompatActivity {

    Button button_for_snakbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diffult_snakbar);
        button_for_snakbar=findViewById(R.id.button_snak_bar);

        //mna3ml snak bar .make bta3te hay view w enta houn ka2nak 3am t2olo zhrle yeh 3ala heed l button bas howe mesh heek la7 ydal yetla3 la yle2e coordinator layout w yezher 3lee w iza ma fee la7 yezhra 3ala root w b7aletna hay ma fe so 3al conmstaint layout la7 yezhera
        Snackbar.make(button_for_snakbar,"Hello From My SnakBar",Snackbar.LENGTH_LONG).show();
         //bhay tare2a heye diffult btare2a diffult ta3et l snak bar metl fe tare2a diffult la toast fe tare2a diffult lal snak bar

    }
}