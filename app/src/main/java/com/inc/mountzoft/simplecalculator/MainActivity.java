package com.inc.mountzoft.simplecalculator;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getResources().getConfiguration().orientation ==
                Configuration.ORIENTATION_PORTRAIT) {
            setContentView(R.layout.activity_main);
        } else {
            setContentView(R.layout.activity_main_landscape);
        }
    }

    public void addButtonFunction(View view) {
        final EditText simpleEditTextOne = (EditText) findViewById(R.id.userInputOne);
        float userInputOne = Float.valueOf(simpleEditTextOne.getText().toString());
        final EditText simpleEditTextTwo = (EditText) findViewById(R.id.userInputTwo);
        float userInputTwo = Float.valueOf(simpleEditTextTwo.getText().toString());
        float result = userInputOne + userInputTwo ;
        Toast.makeText(this, String.valueOf(result) , Toast.LENGTH_SHORT).show();
    }
    public void subButtonFunction(View view) {
        final EditText simpleEditTextOne = (EditText) findViewById(R.id.userInputOne);
        float userInputOne = Float.valueOf(simpleEditTextOne.getText().toString());
        final EditText simpleEditTextTwo = (EditText) findViewById(R.id.userInputTwo);
        float userInputTwo = Float.valueOf(simpleEditTextTwo.getText().toString());
        float result = userInputOne - userInputTwo ;
        Toast.makeText(this, String.valueOf(result) , Toast.LENGTH_SHORT).show();
    }
    public void mulButtonFunction(View view) {
        final EditText simpleEditTextOne = (EditText) findViewById(R.id.userInputOne);
        float userInputOne = Float.valueOf(simpleEditTextOne.getText().toString());
        final EditText simpleEditTextTwo = (EditText) findViewById(R.id.userInputTwo);
        float userInputTwo = Float.valueOf(simpleEditTextTwo.getText().toString());
        float result = userInputOne * userInputTwo ;
        Toast.makeText(this, String.valueOf(result) , Toast.LENGTH_SHORT).show();
    }
    public void divButtonFunction(View view) {
        final EditText simpleEditTextOne = (EditText) findViewById(R.id.userInputOne);
        float userInputOne = Float.valueOf(simpleEditTextOne.getText().toString());
        final EditText simpleEditTextTwo = (EditText) findViewById(R.id.userInputTwo);
        float userInputTwo = Float.valueOf(simpleEditTextTwo.getText().toString());
        float result = userInputOne / userInputTwo ;
        Toast.makeText(this, String.valueOf(result) , Toast.LENGTH_SHORT).show();
    }
}
