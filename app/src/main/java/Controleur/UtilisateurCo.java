package Controleur;

public class UtilisateurCo
{

  private String login;
  private boolean adm;
  private String prenom;
  private String nom;
  private String classe;

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public boolean isAdm() {
    return adm;
  }

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

  public void seConnecter() {
  }

  public void seDeconnecter() {
  }

}