package Activite;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.jogral.comedu.R;

public class Questionnaire_JPO_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questionnaire_question1_layout);
    }
    public void click_jpo1continuer(View view)
    {
        //Accès au questionnaire JPO en tant que visiteur
        startActivity(new Intent(this, Questionnaire_JPO_2.class));
    }
}