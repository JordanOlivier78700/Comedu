package Controleur;


public class CompteAdmin extends UtilisateurCo
{

    public CompteAdmin(String login, String pass, String nom, String prenom, String classe)
    {
        super(login, pass, nom, prenom, classe);
        this.adm = true;
    }


}