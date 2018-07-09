package Controleur;

/**
 * Created by Jogral on 09/07/2018.
 */

public class Reponse_Questionnaire
{
    private int id_reponse;
    private int num_question;
    private String texte;
    private String type;

    public Reponse_Questionnaire()
    {}


    public int getId_reponse() {
        return id_reponse;
    }


    public int getNum_question() {
        return num_question;
    }


    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
