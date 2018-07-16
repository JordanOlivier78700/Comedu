package Activite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.jogral.comedu.R;

import Controleur.Graphique;

public class Home_connecter_admin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_connecter_admin_layout);
    }

    public void click_deco(View view)
    {
        //Déconnection de la session
        startActivity(new Intent(this, Home.class));
    }
    public void click_modif(View view)
    {
        //Afficher la liste des questionnaires et récuperer le nom de la classe assoscier
        startActivity(new Intent(this, Home.class));
    }
    public void click_envoyer(View view)
    {
        //Récupérer le questionnaire et le destinataire
        startActivity(new Intent(this, Home.class));
    }
    public void click_creer(View view)
    {   //Afficher la page de création de questionnaire
        startActivity(new Intent(this, Creer_accueil_questionnaire.class));
    }
    public void click_resultat(View view)
    {
        // selectionner le questionnaire
        startActivity(new Intent(this, Graphique.class));
    }

}