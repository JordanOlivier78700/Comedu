package Activite;

import Controleur.DAO_Utilisateurs;
import Controleur.UtilisateurCo;


import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AlertDialog;
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
        this.login = (EditText) findViewById(R.id.et_login);
        this.password = (EditText) findViewById(R.id.et_password);
    }

    public void click_quitter(View view) {
        startActivity(new Intent(this, Home.class));
    }

    public void click_valider(View view) {

        String str_Login = this.login.getText().toString();
        String str_Password = this.password.getText().toString();
        if (!str_Login.isEmpty()) {
            DAO_Utilisateurs dao_login = new DAO_Utilisateurs();
            UtilisateurCo user_co = dao_login.recherche(str_Login);

            if (user_co.seConnecter(str_Login, str_Password)) {
                startActivity(new Intent(this, Home_connecter_admin.class));
            } else {
                AlertDialog ad = new AlertDialog.Builder(this)
                        .setPositiveButton("Ok", null).setTitle("Erreur de connection").setMessage("Veuillez verifier vos identifiants !")
                        .create();
                ad.show();
            }
        }
    }
}
