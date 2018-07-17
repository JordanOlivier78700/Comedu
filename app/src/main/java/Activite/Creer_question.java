package Activite;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.jogral.comedu.R;

public class Creer_question extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.creer_question_layout);
    }
    public void click_question_terminer(View view)
    {
        //Création d'un objet de type questionnaire
        startActivity(new Intent(this, Home_connecter_admin.class));

    }
    public void click_question_retour(View view)
    {
        //Retour a la page Home
        startActivity(new Intent(this, Creer_accueil_questionnaire.class));
    }
}