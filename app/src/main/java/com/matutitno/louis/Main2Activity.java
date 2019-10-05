package com.matutitno.louis;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
          final String prefName = "MyPrefsFile";


        SharedPreferences myPrefs = this.getSharedPreferences(prefName, Context.MODE_PRIVATE);
        boolean v1 = myPrefs.getBoolean("check1",false );
        boolean v2 = myPrefs.getBoolean("check2",false );
        boolean v3 = myPrefs.getBoolean("check3",false );
        boolean  v4 = myPrefs.getBoolean("check4",false );
        boolean  v5 = myPrefs.getBoolean("check5",false );
        boolean v6 = myPrefs.getBoolean("check6",false );
        boolean  v7 = myPrefs.getBoolean("check7",false );
        boolean  v8 = myPrefs.getBoolean("check8",false );
        String comment = myPrefs.getString("comment"," ");
        TextView t1 =  (TextView) findViewById(R.id.textView5);
        TextView t2 =  (TextView) findViewById(R.id.textView6);
        TextView t3 =  (TextView) findViewById(R.id.textView7);
        TextView t4 =  (TextView) findViewById(R.id.textView8);
        TextView t5 =  (TextView) findViewById(R.id.textView9);
        TextView t6 =  (TextView) findViewById(R.id.textView10);
        TextView t7 =  (TextView) findViewById(R.id.textView11);
        TextView t8 =  (TextView) findViewById(R.id.textView12);
        EditText e1 = (EditText) findViewById(R.id.editText);
        if(v1 == true ){

         t1.setText("Pasukhan");
        }
        if(v2 == true){

            t2.setText("Recollection at Calaruega");
        }
        if(v3 == true){

            t3.setText("Programming Competition");
        }
        if(v4 == true){

            t4.setText("Coastal Cleanup at Roxas Blvd.");
        }
        if(v5 == true){

            t5.setText("Seminar on Kotlin");
        }
        if(v6 == true){

            t6.setText("Team Building");
        }
        if(v7 == true){

            t7.setText("FieldTrip at South Luzon");
        }
        if(v8 == true){

            t8.setText("Training on Web Technologies");
        }
        String s1 =myPrefs.getString("comment"," ");
        e1.setText(s1);

    }
    public void nextScreen(View V){
        Intent intent1 = new Intent(this, MainActivity.class);
        startActivity(intent1);
    }
    public void onClick(View V){
        Toast.makeText(this, "Data Sent", Toast.LENGTH_LONG).show();

        final String prefName = "MyPrefsFile";
        SharedPreferences myPrefs;
        SharedPreferences.Editor editor;
        myPrefs= this.getSharedPreferences(prefName, MODE_PRIVATE);
        editor = myPrefs.edit();
       editor.remove("check1");
        editor.remove("check2");
        editor.remove("check3");
        editor.remove("check4");
        editor.remove("check5");
        editor.remove("check6");
        editor.remove("check7");
        editor.remove("check8");

        editor.apply();
    }
}
