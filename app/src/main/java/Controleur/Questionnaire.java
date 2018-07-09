package Controleur;


import java.util.ArrayList;

public class Questionnaire
{
    private int id_questionnaire;
    private String nom_questionnaire;
    private String user_login;
    private ArrayList<Question> liste_question;

    public Questionnaire()
    {

    }


    public int getId_questionnaire() {
        return id_questionnaire;
    }

    public String getNom_questionnaire() {
        return nom_questionnaire;
    }

    public void setNom_questionnaire(String nom_questionnaire) {
        this.nom_questionnaire = nom_questionnaire;
    }

    public String getUser_login() {
        return user_login;
    }
}