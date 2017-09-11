package fi.jamk.l3329.basicui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void selectButtonClicked(View view){

        RadioGroup rg = (RadioGroup) findViewById(R.id.myRadioG);

        int id = rg.getCheckedRadioButtonId();

        RadioButton rb = (RadioButton) findViewById(id);

        String text = (String) rb.getText();

        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }
}
