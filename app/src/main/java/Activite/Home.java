package Activite;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.jogral.comedu.R;

public class Home extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_layout);
    }

    public void click_co(View view)
    {
        startActivity(new Intent(this, Login.class));
    }

    public void click_visiteur(View view)
    {
        startActivity(new Intent(this, Login.class));
    }
}
