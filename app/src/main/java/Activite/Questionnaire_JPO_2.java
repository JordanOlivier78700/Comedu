package Activite;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.jogral.comedu.R;

public class Questionnaire_JPO_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questionnaire_question2_layout);
    }
    public void click_jpo2continuer(View view)
    {
        //Accès à la question 3 en tant que visiteur
        startActivity(new Intent(this, Questionnaire_JPO_3.class));
    }
    public void click_jpo2precedent(View view)
    {
        //Retour à la question 1
        startActivity(new Intent(this, Questionnaire_JPO_1.class));
    }
}