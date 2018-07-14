package Activite;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.jogral.comedu.R;

public class Questionnaire_JPO_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questionnaire_question3_layout);
    }
    public void click_jpo3continuer(View view)
    {
        //Accès au questionnaire JPO en tant que visiteur
        startActivity(new Intent(this, Questionnaire_JPO_4.class));
    }
    public void click_jpo3precedent(View view)
    {
        //Retour à la question 2
        startActivity(new Intent(this, Questionnaire_JPO_2.class));
    }
}