package Activite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.jogral.comedu.R;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
    }

    public void click_quitter(View view)
    {
        startActivity(new Intent(this, Home.class));
    }
    public void click_valider(View view)
    {
        //Connection bd
        //if
        // création d'un session
        startActivity(new Intent(this, Home_connecter_admin.class));
        //else message derreur
    }
}
