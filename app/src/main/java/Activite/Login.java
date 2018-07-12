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
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        final EditText login = (EditText) findViewById (R.id.et_login);
        final EditText password = (EditText) findViewById (R.id.et_password);
    }
    //Retour a la page Home
    public void click_quitter(View view)
    {
        startActivity(new Intent(this, Home.class));
    }

    //Authentification de l'utilisateur
    public void click_valider(View view)
    {

        String str_Login = login.getText().toString();
        String str_Password = password.getText().toString();
        if (!str_Login.isEmpty())
        {
            DAO_Utilisateurs dao_login = new DAO_Utilisateurs();
            UtilisateurCo user_co =dao_login.recherche(str_Login);

            if ( user_co.seConnecter(str_Login, str_Password))
            {
                //Affichage de la page d'administration des questionnaires
                startActivity(new Intent(this, Home_connecter_admin.class));
            }
            else
            {
                createDialog("Erreur de connection","Veuillez verifier vos identifiants !");
            }
        }
    }
    private void createDialog(String title, String text) {
        // Création d'une popup affichant un message
        AlertDialog ad = new AlertDialog.Builder(this)
                .setPositiveButton("Ok", null).setTitle(title).setMessage(text)
                .create();
        ad.show();
    }

}
