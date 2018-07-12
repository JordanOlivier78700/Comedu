package Controleur;
import java.util.ArrayList;
import java.util.Vector;

public class Question
{

  private int id_question;
  private int num_questionnaire;
  private String titre_question;

    public void setId_question(int id_question) {
        this.id_question = id_question;
    }

    private ArrayList  <Reponse_Questionnaire> reponses;

    public int getId_question() {
        return id_question;
    }

    public int getNum_questionnaire() {
        return num_questionnaire;
    }

    public String getTitre_question() {
        return titre_question;
    }

    public void setTitre_question(String titre_question) {
        this.titre_question = titre_question;
    }

    public ArrayList<Reponse_Questionnaire> getReponses() {
        return reponses;
    }

    public void setReponses(ArrayList<Reponse_Questionnaire> reponses) {
        this.reponses = reponses;
    }
}