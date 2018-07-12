package Controleur;

public class Visiteur extends UtilisateurCo
{
    public Visiteur()
    {
        super("visiteur", "visiteur", "nom_visiteur", "prenom_visiteur", "classe_visiteur");
        this.adm=false;
    }

}