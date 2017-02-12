package com.example.android.canyouescape;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Admin on 10/02/2017.
 */
public class activity2_intro extends Activity {

    /**
     * Called when the activity is first created.
     */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2_intro);

        Button next = (Button) findViewById(R.id.NextButton2);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), activity3_questions_fragment.class);
                startActivityForResult(myIntent, 0);
            }

        });
    }
}