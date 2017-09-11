package fi.jamk.l3329.basicui2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AutoCompleteTextView actv = (AutoCompleteTextView)findViewById(R.id.login);

        ArrayAdapter<String> aa = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,
                new String[]
                        {"Pasi","Kari","Peter","Esa"});

        actv.setAdapter(aa);

    }

    public void toastLoginPasswd(View view) {
        AutoCompleteTextView actv = (AutoCompleteTextView)findViewById(R.id.login);
        EditText et = (EditText)findViewById(R.id.passwd);

        String login = actv.getText().toString();

        String passwd = et.getText().toString();

        Toast.makeText(getApplicationContext(), login+" "+passwd,
                Toast.LENGTH_SHORT).show();

    }
}
