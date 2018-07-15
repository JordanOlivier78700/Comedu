package Controleur;
import android.widget.CheckBox;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

@XmlRootElement
public class Resultat implements Serializable
{

    ArrayList <String> list_result_cb;
    String Q2;
    String Q3;


    public ArrayList<String> getList_result_cb() {
        return list_result_cb;
    }

    @XmlElement
    public void setList_result_cb(ArrayList<String> list_result_cb) {
        this.list_result_cb = list_result_cb;
    }

    public String getQ2() {
        return Q2;
    }

    @XmlElement
    public void setQ2(String q2) {
        this.Q2 = q2;
    }

    public void add(String cb)
    {
        this.list_result_cb.add(cb);
    }

    public String getQ3() {
        return Q3;
    }

    @XmlElement
    public void setQ3(String q3) {
        Q3 = q3;
    }

    public void ecrir_xml()
    {

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

    @Override
    public String toString() {
        return "Resultat{" +
                "list_result_cb=" + list_result_cb +
                ", Q2='" + Q2 + '\'' +
                ", Q3='" + Q3 + '\'' +
                '}';
    }
}