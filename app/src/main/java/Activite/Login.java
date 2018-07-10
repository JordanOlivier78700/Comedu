package Activite;

import Controleur.DAO_Utilisateurs;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.jogral.comedu.R;

public class Login extends AppCompatActivity {
    EditText login;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        login = (EditText) findViewById (R.id.et_login);
        password = (EditText) findViewById (R.id.et_password);
    }

    public void click_quitter(View view)
    {
        startActivity(new Intent(this, Home.class));
    }
    public void click_valider(View view) { startActivity(new Intent(this, Home_connecter_admin.class));}
    {

        String str_Login = login.getText().toString();
        String str_Password = password.getText().toString();
        if (!str_Login.isEmpty())
        {
            DAO_Utilisateurs dao_login = new DAO_Utilisateurs();
            boolean bool = dao_login.recherche(str_Login, str_Password);
            if (bool) {
                startActivity(new Intent(this, Home_connecter_admin.class));
            } else {
                //msg erreur
            }
        }
    }
}
