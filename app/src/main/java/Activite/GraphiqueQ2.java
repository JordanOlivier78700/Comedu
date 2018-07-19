package Activite;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.example.jogral.comedu.R;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class GraphiqueQ2 extends AppCompatActivity implements OnChartValueSelectedListener{

    /**
     * empty public constructor
     */
    public GraphiqueQ2() {

    }

    /**
     * Method to initialize activity
     * @param savedInstanceState
     * @return
     */
    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultats_question2_layout);


        PieChart pieChart = findViewById(R.id.piechart);
        pieChart.setUsePercentValues(true);
        pieChart.setDescription("");

        ArrayList<Entry> yvalues = new ArrayList<Entry>();
        yvalues.add(new Entry(20f, 0));
        yvalues.add(new Entry(5f, 1));
        yvalues.add(new Entry(5f, 2));
        yvalues.add(new Entry(15f, 3));
        yvalues.add(new Entry(25f, 4));

        PieDataSet dataSet = new PieDataSet(yvalues, "");

        ArrayList<String> xVals = new ArrayList<String>();
        xVals.add("Salon");
        xVals.add("Rencontres");
        xVals.add("Banderole");
        xVals.add("Flyers");
        xVals.add("Internet");

        PieData data = new PieData(xVals, dataSet);
        data.setValueFormatter(new PercentFormatter());

        pieChart.setData(data);
        pieChart.setDrawHoleEnabled(true);
        pieChart.setTransparentCircleRadius(25f);
        pieChart.setHoleRadius(50f);

        dataSet.setColors(ColorTemplate.COLORFUL_COLORS);

        data.setValueTextSize(13f);
    }

    @Override
    public void onValueSelected(Entry e, int dataSetIndex, Highlight h) {

        if (e == null)
            return;
        Log.i("VAL SELECTED",
                "Value: " + e.getVal() + ", xIndex: " + e.getXIndex()
                        + ", DataSet index: " + dataSetIndex);
    }

    @Override
    public void onNothingSelected() {
        Log.i("PieChart", "nothing selected");
    }

    public void click_jporesquit(View view) {
        //Retour menu Admin
        startActivity(new Intent(this, resultats.class));
    }
}
