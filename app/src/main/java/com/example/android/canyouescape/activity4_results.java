package com.example.android.canyouescape;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Admin on 10/02/2017.
 */
public class activity4_results extends FragmentActivity {

    /**
     * Called when the activity is first created.
     */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity4_results);

        Button previous = (Button) findViewById(R.id.AnswersButton);
        previous.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent();
                setResult(RESULT_OK, intent);
                finish();
            }

        });

        //SampleFragment1 fragment1 = (SampleFragment1)getSupportFragmentManager().findFragmentById(R.id.fragment1);
        SampleFragment1 fragment1 = new SampleFragment1();
        fragment1.displayAnswer((TextView) findViewById(R.id.answer1_lastscreen));
        String answerGiven = fragment1.toString();
        Log.v("activity4_results","Reponse"+ answerGiven);
    }

    /*public void SubmitAnswers(View view){
        TextView t = (TextView) SampleFragment1.findViewById(R.id.Answer1);
        String Answer1 = t.getText().toString();
        displayMessage(Answer1);
    }

    private void displayMessage(String message) {
        TextView answer1 = (TextView) findViewById(R.id.answer1_lastscreen);
        answer1.setText(message);
    }

     public void displayAnswer(TextView textview){
        textview.setText(answerGiven);
    }
    */
}