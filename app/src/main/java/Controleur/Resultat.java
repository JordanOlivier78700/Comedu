package Controleur;
import android.widget.CheckBox;

import java.io.Serializable;
import java.util.ArrayList;

public class Resultat implements Serializable
{

    ArrayList <CheckBox> list_result_cb;
    String Q2;
    String Q3;


    public ArrayList<CheckBox> getList_result_cb() {
        return list_result_cb;
    }

    public void setList_result_cb(ArrayList<CheckBox> list_result_cb) {
        this.list_result_cb = list_result_cb;
    }

    public String getQ2() {
        return Q2;
    }

    public void setQ2(String q2) {
        this.Q2 = q2;
    }

    public void add(CheckBox cb)
    {
        this.list_result_cb.add(cb);
    }


    public String getQ3() {
        return Q3;
    }

    public void setQ3(String q3) {
        Q3 = q3;
    }

}