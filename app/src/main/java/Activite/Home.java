package Activite;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.jogral.comedu.R;

import java.io.File;

import javax.xml.bind.*;


import Controleur.Resultat;

public class Home extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_layout);

        try {

            File file = new File("D:\\Github\\Comedu\\file.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Resultat.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(this, file);
            jaxbMarshaller.marshal(this, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
    //Affichage de la page de connexion Admin/Utilisateurs
    public void click_co(View view)
    {
        startActivity(new Intent(this, Login.class));
    }


    public void click_visiteur(View view)
    {
        //Accès au questionnaire JPO en tant que visiteur
        startActivity(new Intent(this, Visiteur.class));
    }
}
