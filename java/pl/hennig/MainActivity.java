package pl.hennig;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        String helloMsg = intent.getStringExtra(HomeScreenCalc.USER_NAME);
        TextView helloMsgView = (TextView)findViewById(R.id.name);
        helloMsgView.setText(helloMsg);

    }
    public void add(View view)
    {
        TextView result = (TextView) findViewById(R.id.result);
        Spinner num1 = (Spinner) findViewById(R.id.num1);
        Spinner num2 = (Spinner) findViewById(R.id.num2);
        float x;
        float a = Float.parseFloat(String.valueOf(num1.getSelectedItem()));
        float b = Float.parseFloat(String.valueOf(num2.getSelectedItem()));
        x = b + a;
        result.setText(String.valueOf(x));

    }
    public void sub(View view)
    {
        TextView result = (TextView) findViewById(R.id.result);
        Spinner num1 = (Spinner) findViewById(R.id.num1);
        Spinner num2 = (Spinner) findViewById(R.id.num2);
        float x;
        float a = Float.parseFloat(String.valueOf(num1.getSelectedItem()));
        float b = Float.parseFloat(String.valueOf(num2.getSelectedItem()));
        x = a - b;
        result.setText(String.valueOf(x));
    }
    public void multi(View view)
    {
        TextView result = (TextView) findViewById(R.id.result);
        Spinner num1 = (Spinner) findViewById(R.id.num1);
        Spinner num2 = (Spinner) findViewById(R.id.num2);
        float x;
        float a = Float.parseFloat(String.valueOf(num1.getSelectedItem()));
        float b = Float.parseFloat(String.valueOf(num2.getSelectedItem()));
        x = a * b;
        result.setText(String.valueOf(x));
    }
    public void divide(View view)
    {
        TextView result = (TextView) findViewById(R.id.result);
        Spinner num1 = (Spinner) findViewById(R.id.num1);
        Spinner num2 = (Spinner) findViewById(R.id.num2);
        float x;
        float a = Float.parseFloat(String.valueOf(num1.getSelectedItem()));
        float b = Float.parseFloat(String.valueOf(num2.getSelectedItem()));
        x = a / b;

        result.setText(String.valueOf(x));
    }

}
