package Controleur;

public class Etudiant extends UtilisateurCo
{
    public Etudiant(String login, String pass, String nom, String prenom, String classe)
    {
      super(login, pass, nom, prenom, classe);
      this.adm = false;
    }

}