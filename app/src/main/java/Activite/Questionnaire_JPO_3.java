package Activite;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.example.jogral.comedu.R;

import Controleur.Resultat;

public class Questionnaire_JPO_3 extends AppCompatActivity
{
    Intent intent;
    Resultat res;
    EditText et_choix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questionnaire_question3_layout);
        this.intent = getIntent();
        this.res = (Resultat) this.intent.getSerializableExtra("res");
        this.et_choix = findViewById(R.id.et_choix1);
    }
    public void click_jpo3continuer(View view)
    {
        //Accès au questionnaire JPO en tant que visiteur
        this.res.setQ2(this.et_choix.getText().toString());
        this.intent.putExtra("res", this.res);
        startActivity(this.intent);
    }
    public void click_jpo3precedent(View view)
    {
        //Retour à la question 2
        startActivity(new Intent(this, Questionnaire_JPO_2.class));
    }
}