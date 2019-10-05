package com.matutitno.louis;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static final String prefName = "MyPrefsFile";
 //   private Button btnDisplay;
 /*   public void addListenerOnButton() {

        final CheckBox cb1 = (CheckBox) findViewById(R.id.checkBox);
        final   CheckBox cb2 = (CheckBox) findViewById(R.id.checkBox2);
        final   CheckBox cb3 = (CheckBox) findViewById(R.id.checkBox3);
        final    CheckBox cb4 = (CheckBox) findViewById(R.id.checkBox4);
        final    CheckBox cb5 = (CheckBox) findViewById(R.id.checkBox5);
        final    CheckBox cb6 = (CheckBox) findViewById(R.id.checkBox6);
        final    CheckBox cb7 = (CheckBox) findViewById(R.id.checkBox7);
        final   CheckBox cb8 = (CheckBox) findViewById(R.id.checkBox8);
        btnDisplay = (Button) findViewById(R.id.button2);
        btnDisplay.setOnClickListener(new View.OnClickListener() {




            //Run when button is clicked
            @Override
            public void onClick(View v) {


            }
        });

    }
 */


    public String c1, c2, c3, c4, c5, c6, c7, c8;
    public void itemClicked(View v) {
        //code to check if this checkbox is checked!

        final  CheckBox cb1 = (CheckBox) findViewById(R.id.checkBox);
        final   CheckBox cb2 = (CheckBox) findViewById(R.id.checkBox2);
        final   CheckBox cb3 = (CheckBox) findViewById(R.id.checkBox3);
        final    CheckBox cb4 = (CheckBox) findViewById(R.id.checkBox4);
        final    CheckBox cb5 = (CheckBox) findViewById(R.id.checkBox5);
        final    CheckBox cb6 = (CheckBox) findViewById(R.id.checkBox6);
        final    CheckBox cb7 = (CheckBox) findViewById(R.id.checkBox8);
        final   CheckBox cb8 = (CheckBox) findViewById(R.id.checkBox7);
        final EditText t1 = (EditText) findViewById(R.id.editText);
        String text1 = t1.getText().toString();
       SharedPreferences myPrefs;
        SharedPreferences.Editor editor;
        myPrefs= this.getSharedPreferences(prefName, MODE_PRIVATE);
        editor = myPrefs.edit();
    //    if(cb1.isChecked()){
            editor.putBoolean("check1", cb1.isChecked());
  //      }
   //     if(cb2.isChecked()){
            editor.putBoolean("check2",cb2.isChecked());
  //    }
  //      if(cb3.isChecked()){
            editor.putBoolean("check3",cb3.isChecked());
  //      }
   //     if(cb4.isChecked()){
            editor.putBoolean("check4",cb4.isChecked());
  //      }
     //   if(cb5.isChecked()){
            editor.putBoolean("check5",cb5.isChecked());
   //     }
   //     if(cb6.isChecked()){
            editor.putBoolean("check6",cb6.isChecked());
   //     }
    //    if(cb7.isChecked()){
            editor.putBoolean("check7",cb7.isChecked());
    //    }
     //   if(cb8.isChecked()){
            editor.putBoolean("check8",cb8.isChecked());
      //  }
            editor.putString("comment", t1.getText().toString());

    editor.apply();
        editor.commit();
        Toast.makeText(this, "Data Saved", Toast.LENGTH_LONG).show();

    }

    public void nextScreen(View V){
        Intent intent1 = new Intent(this, Main2Activity.class);
        startActivity(intent1);
    }
}
