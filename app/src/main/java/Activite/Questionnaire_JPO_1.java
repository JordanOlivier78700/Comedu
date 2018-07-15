package Activite;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;

import com.example.jogral.comedu.R;

import Controleur.Resultat;

public class Questionnaire_JPO_1 extends AppCompatActivity
{
    CheckBox bts;
    CheckBox licence;
    CheckBox master;
    CheckBox info;
    CheckBox management;
    CheckBox gestion;
    Intent intent;
    Resultat res = new Resultat();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questionnaire_question1_layout);
        this.bts = findViewById(R.id.cb_bts);
        this.master = findViewById(R.id.cb_master);
        this.licence = findViewById(R.id.cb_licence);
        this.info = findViewById(R.id.cb_info);
        this.management = findViewById(R.id.cb_management);
        this.gestion = findViewById(R.id.cb_gestion);
        this.intent = new Intent(this, Questionnaire_JPO_2.class);

    }
    public void click_jpo1continuer(View view)
    {

        //Récupérer l'état des CheckBox
        if (this.bts.isSelected())
        {
            res.add(this.bts.getText().toString());
        }
        if (this.master.isSelected())
        {
            res.add(this.master.getText().toString());
        }
        if (this.licence.isSelected())
        {
            res.add(this.licence.getText().toString());
        }
        if (this.management.isSelected())
        {
            res.add(this.management.getText().toString());
        }
        if (this.gestion.isSelected())
        {
            res.add(this.gestion.getText().toString());
        }
        if (this.info.isSelected())
        {
            res.add(this.info.getText().toString());
        }
        this.intent.putExtra("res",this.res) ;

        //Accès au questionnaire JPO en tant que visiteur
        startActivity(this.intent);
    }
    public void click_jpo1Quitter(View view)
    {
        //Retour à l'accueil
        startActivity(new Intent(this, Home.class));
    }
}