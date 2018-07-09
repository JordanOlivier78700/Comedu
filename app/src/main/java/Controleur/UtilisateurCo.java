package Controleur;

public class UtilisateurCo
{
  
  private String login;
  private boolean adm;
  private String prenom;
  private String nom;
  private String classe;

<<<<<<< HEAD
=======
  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public boolean isAdm() {
    return adm;
  }


>>>>>>> a1fe7db480f56d54aed4551aafb689dd96d4fc0f
  public String login;
  public String password;
  public String nom;
  public String prenom;

  public void setAdm(boolean adm) {
    this.adm = adm;
  }

  public String getPrenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getClasse() {
    return classe;
  }

  public void setClasse(String classe) {
    this.classe = classe;
  }


  public void seConnecter()
  {
    //if(utilisateurDAO.recherche("login","password"))
      //je me co
    //else
      //faux pass ou compte
  }

  public void seDeconnecter()
  {
  }

}