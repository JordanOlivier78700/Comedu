package Controleur;

public class UtilisateurCo
{
  
  protected String login;
  protected String password;
  protected boolean adm;
  protected String prenom;
  protected String nom;
  protected String classe;


  public UtilisateurCo(String login, String pass, String nom, String prenom, String classe)
  {
    this.login = login;
    this.password = pass;

    this.nom = nom;
    this.prenom = prenom;
    this.classe = classe;
  }

  public String getLogin() {
    return login;
  }

  public boolean isAdm() {
    return adm;
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

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public boolean seConnecter(String log, String pass)
  {
    return this.login.compareTo(log)==0 && this.password.compareTo(pass)==0;
  }
}