package connectme.idea1;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
    private Spinner spinner1, spinner2;
    public Button btnSubmit;
            public Button btnLogin; // btnSettings;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //addItemsOnSpinner2();
        addListenerOnButton();
        addListenerOnSpinnerItemSelection();

        Button btnLogin = (Button) findViewById(R.id.btnLogin);
        Button btnSettings= (Button) findViewById(R.id.btnSettings);


        btnLogin.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Launching Login page",
                        Toast.LENGTH_SHORT).show();
                Intent login = new Intent(MainActivity.this, login.class);
                startActivity(login);
            }
        });
        btnSettings.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Launching Settings",
                        Toast.LENGTH_SHORT).show();
                Intent settings = new Intent(MainActivity.this, settings.class);
                startActivity(settings);
            }
        });
    }


    /*public void addItemsOnSpinner2(){
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        List<String> list= new ArrayList<String>();
        list.add("list 1");
        list.add("list 2");
        list.add("list 3");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(dataAdapter);}*/

    public void addListenerOnSpinnerItemSelection() {
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner1.setOnItemSelectedListener(new CustomOnItemSelectedListener());
            }

                // get the selected dropdown list value
    public void addListenerOnButton() {
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        //spinner2 = (Spinner) findViewById(R.id.spinner2);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        //btnLogin = (Button) findViewById(R.id.btnLogin);
        //btnSettings= (Button) findViewById(R.id.btnSettings);

        btnSubmit.setOnClickListener(new OnClickListener() {

                    @Override
                    public void onClick(View v) {

                        Toast.makeText(MainActivity.this,
                                "You have selected  : " +
                                        "\nSpinner 1 : " + String.valueOf(spinner1.getSelectedItem()),
                                Toast.LENGTH_SHORT).show();
                    }

                });

            }
        }

