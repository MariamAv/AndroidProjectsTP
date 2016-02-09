package com.example.mariam.exo;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Integer.parseInt;


public class MainActivity extends ActionBarActivity {

    int calc = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void doOk(View view){
        TextView tvNom;
        TextView tvMessage;
        String msg;
        tvNom = (TextView) findViewById(R.id.nom);
        tvMessage = (TextView) findViewById(R.id.message);
        msg = "Bienvenue " + tvNom.getText() + " !";
        tvMessage.setText(msg);
        changeColor(tvMessage);
    }

    public void changeColor(TextView tv){
        tv.setTextColor(getResources().getColor(R.color.bleu));
    }

    public void doRefresh(View view){
        finish();
        startActivity(getIntent());
    }

    public void doOki(View view){
        EditText tvNum;
        TextView tvLarge;
        String msg;
        tvNum = (EditText) findViewById(R.id.num);
        tvLarge = (TextView) findViewById(R.id.textView2);
        calc += Integer.parseInt(""+tvNum.getText());
        msg = "" + Integer.toString(calc);
        tvLarge.setText(msg);
    }
}
