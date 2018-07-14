package Activite;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.jogral.comedu.R;

public class Questionnaire_JPO_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questionnaire_question4_layout);
    }
    public void click_jpo4continuer(View view)
    {
        //Accès au questionnaire JPO en tant que visiteur
        startActivity(new Intent(this, Questionnaire_JPO_4.class));
    }

}