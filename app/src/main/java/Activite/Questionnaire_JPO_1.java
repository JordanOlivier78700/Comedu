package Activite;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;

import com.example.jogral.comedu.R;

public class Questionnaire_JPO_1 extends AppCompatActivity
{
    CheckBox btssio;
    CheckBox licencepro;
    CheckBox m2i;
    CheckBox codeurinfo;
    CheckBox licencegene;
    CheckBox formationcontinue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questionnaire_question1_layout);
        this.btssio = findViewById(R.id.cb_bts_sio);
        this.m2i = findViewById(R.id.cb_m2i);
        this.licencepro = findViewById(R.id.cb_licence_pro);
        this.codeurinfo = findViewById(R.id.cb_codeur_info);
        this.formationcontinue = findViewById(R.id.cb_formation_continue);
        this.licencegene = findViewById(R.id.cb_licence_gene);

    }
    public void click_jpo1continuer(View view)
    {
        //Accès au questionnaire JPO en tant que visiteur
        startActivity(new Intent(this, Questionnaire_JPO_2.class));
    }
    public void click_jpo1Quitter(View view)
    {
        //Retour à l'accueil
        startActivity(new Intent(this, Home.class));
    }
}