package Controleur;
import android.widget.CheckBox;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Vector;
public class Resultat implements Serializable
{

    ArrayList <CheckBox> list_result_cb;

    public void add(CheckBox cb)
    {
        this.list_result_cb.add(cb);
    }

}