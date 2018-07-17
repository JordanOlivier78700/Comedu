package com.example.jogral.comedu.test;

import android.widget.CheckBox;

import org.junit.Test;

import java.util.ArrayList;

import Controleur.Resultat;

import static org.junit.Assert.*;

/**
 * Created by Jogral on 17/07/2018.
 */
public class ResultatTest {
    @Test
    public void getList_result_cb() throws Exception
    {
        Resultat resultat = new Resultat();
        resultat.setList_result_cb(new ArrayList<String>());
        assertEquals(resultat.getList_result_cb() , null );
    }

    @Test
    public void setList_result_cb() throws Exception {
    }

    @Test
    public void getQ2() throws Exception {
    }

    @Test
    public void setQ2() throws Exception {
    }

    @Test
    public void add() throws Exception
    {
        Resultat resultat = new Resultat();
        String cb = new String("cb_coucou");
        resultat.setList_result_cb(new ArrayList<String>());
        resultat.add(cb);
        ArrayList <String> list_string  = new ArrayList<String>();
        list_string.add("coucou");
        assertEquals(resultat.getList_result_cb() , list_string);
    }

    @Test
    public void getQ3() throws Exception {
    }

    @Test
    public void setQ3() throws Exception {
    }

}