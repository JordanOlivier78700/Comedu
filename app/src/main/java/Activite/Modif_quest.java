package Activite;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.jogral.comedu.R;

public class Modif_quest extends AppCompatActivity{

    /**
     * empty public constructor
     */
    public Modif_quest() {

    }

    /**
     * Method to initialize activity
     * @param savedInstanceState
     * @return
     */
    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultats_question_layout);

    }

    public void click_res_q1(View view) {
        //Retour menu Admin
        startActivity(new Intent(this, GraphiqueQ1.class));
    }

    public void click_res_q2(View view) {
        //Retour menu Admin
        startActivity(new Intent(this, GraphiqueQ2.class));
    }

    public void click_jporesquit(View view) {
        //Retour menu Admin
        startActivity(new Intent(this, Home_connecter_admin.class));
    }
}
