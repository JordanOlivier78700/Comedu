package Activite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.example.jogral.comedu.R;


public class Resultats_question extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultats_question_layout);
    }

    public void click_valider(View view) {
        //Création d'un objet de type questionnaire
        startActivity(new Intent(this, Home_connecter_admin.class));

    }

    public void click_quitter(View view) {
        startActivity(new Intent(this, Home_connecter_admin.class));
    }

}