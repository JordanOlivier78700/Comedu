package Activite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.example.jogral.comedu.R;
import com.github.mikephil.charting.charts.PieChart;


public class Resultats_question extends AppCompatActivity {
    PieChart pieChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultats_question_layout);

        pieChart = (PieChart) findViewById(R.id.piechart);
    }

    public void click_jporesquit(View view) {
        //Retour menu Admin
        startActivity(new Intent(this, Home.class));
    }

}