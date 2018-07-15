package Activite;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.example.jogral.comedu.R;

import Controleur.Resultat;

public class Questionnaire_JPO_2 extends AppCompatActivity
{
    Intent intent;
    Resultat res;
    EditText et_choix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questionnaire_question2_layout);
        this.intent = getIntent();
        this.res = (Resultat) this.intent.getSerializableExtra("res");
        this.intent = new Intent(this, Questionnaire_JPO_3.class);
        this.et_choix = findViewById(R.id.et_choix1);
    }
    public void click_jpo2continuer(View view)
    {
        //Accès à la question 3 en tant que visiteur
        this.res.setQ3(this.et_choix.getText().toString());
        this.intent.putExtra("res", this.res);
        startActivity(this.intent);
    }
    public void click_jpo2precedent(View view)
    {
        //Retour à la question 1
        startActivity(new Intent(this, Questionnaire_JPO_1.class));
    }
}