package pl.hennig;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;



public class HomeScreenCalc extends AppCompatActivity {
    public static final String USER_NAME = "name";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen_calc);
    }

    public void openSimpleCalc(View view)
    {
        Intent intent = new Intent(this, MainActivity.class);

        EditText editText = (EditText)findViewById(R.id.editText);
        String name = String.valueOf(editText.getText());
        intent.putExtra(USER_NAME, "Witaj " +name);

        startActivity(intent);
    }
    public void openDeltaCalc(View view)
    {
        Intent intent = new Intent(this, DeltaActivity.class);

        EditText editText = (EditText)findViewById(R.id.editText);
        String name = String.valueOf(editText.getText());
        intent.putExtra(USER_NAME, "Witaj " +name);

        startActivity(intent);
    }

}
