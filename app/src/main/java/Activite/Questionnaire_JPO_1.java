package Activite;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;

import com.example.jogral.comedu.R;

public class Questionnaire_JPO_1 extends AppCompatActivity
{
    CheckBox bts;
    CheckBox licence;
    CheckBox master;
    CheckBox info;
    CheckBox management;
    CheckBox gestion;

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

    }
    public void click_jpo1continuer(View view)
    {

        //Récupérer l'état des CheckBox
        if (!checkBox1.isselected()){
            this.checkBox1.setSelected(true);
            Controleur.Resultat.tabReponses.add(checkBox1);
            R.layout.questionnaire_question1_layout.checkBox
        }
        
        //Accès au questionnaire JPO en tant que visiteur
        startActivity(new Intent(this, Questionnaire_JPO_2.class));
    }
    public void click_jpo1Quitter(View view)
    {
        //Retour à l'accueil
        startActivity(new Intent(this, Home.class));
    }
}