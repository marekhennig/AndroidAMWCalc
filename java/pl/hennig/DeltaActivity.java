package pl.hennig;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Math.sqrt;

public class DeltaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delta);
        Intent intent = getIntent();
        String helloMsg = intent.getStringExtra(HomeScreenCalc.USER_NAME);
        TextView helloMsgView = (TextView)findViewById(R.id.name);
        helloMsgView.setText(helloMsg);
    }
    public void calculateDelta(View view)
    {
        TextView result = (TextView) findViewById(R.id.result);
        EditText a = (EditText) findViewById(R.id.a);
        EditText b = (EditText) findViewById(R.id.b);
        EditText c = (EditText) findViewById(R.id.c);
        float x;
        float a1 = Float.parseFloat(String.valueOf(a.getText()));
        float b1 = Float.parseFloat(String.valueOf(b.getText()));
        float c1 = Float.parseFloat(String.valueOf(c.getText()));
        x = (b1*b1) - (4*a1*c1);
        System.out.println(x);
        if(x<0)result.setText("Delta ujemna, brak rozwiązań");
        else if(x==0)result.setText("x: " +String.valueOf(-b1/(2*a1)));
        else result.setText("x1: "+String.valueOf((-b1-sqrt(x))/(2*a1))+" x2: " +String.valueOf((-b1+sqrt(x))/(2*a1)));
    }
}
