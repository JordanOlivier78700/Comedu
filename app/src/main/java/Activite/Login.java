package Activite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.jogral.comedu.R;

public class Login extends AppCompatActivity {






    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout); /*
        this.login = (EditText) findViewById(R.id.et_login);
        this.password = (EditText) findViewById(R.id.et_password);*/
    }


    public void click_quitter(View view)
    {
        //Retour a la page Home
        startActivity(new Intent(this, Home.class));
    }
    public void click_connecter(View view)
    {
        EditText elogin = (EditText)findViewById(R.id.et_login);
        String login = elogin.getText().toString();
        EditText epassword = (EditText)findViewById(R.id.et_password);
        String password = epassword.getText().toString();
        if (login == "admin");
            if (password == "admin");
            startActivity(new Intent(this, Home_connecter_admin.class));

    }
}
