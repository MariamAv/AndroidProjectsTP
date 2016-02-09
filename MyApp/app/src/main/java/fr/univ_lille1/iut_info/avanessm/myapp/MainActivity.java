package fr.univ_lille1.iut_info.avanessm.myapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

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
        tvNom = (TextView) findViewById(R.id.editText);
        tvMessage = (TextView) findViewById(R.id.textView2);
        msg = "Bienvenu " + tvNom.getText() + " !";
        tvMessage.setText(msg);
        changeTextColor(tvMessage);

    }

    public void changeTextColor(TextView view){
        view.setTextColor(getResources().getColor(R.color.color_changed, null));
    }



}
