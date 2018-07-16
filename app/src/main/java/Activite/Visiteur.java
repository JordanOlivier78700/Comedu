package Activite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.jogral.comedu.R;

public class Visiteur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_visiteur);
    }
    public void click_continuer(View view)
    {
        //Accès au questionnaire JPO en tant que visiteur
        startActivity(new Intent(this, Questionnaire_JPO_1.class));
    }
}