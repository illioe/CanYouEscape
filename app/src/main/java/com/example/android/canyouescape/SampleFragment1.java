package com.example.android.canyouescape;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.canyouescape.R;

/**
 * Created by Admin on 24/01/2017.
 */
public class SampleFragment1 extends Fragment {
    int hintPosition=0;
    String answerGiven;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.fragment1, container,
                false);

        //Shows or Hide the Hint
        final TextView hint = (TextView) rootView.findViewById(R.id.HintText1);
        Button hintButton = (Button) rootView.findViewById(R.id.HintButton);
        hintButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hintPosition = hintPosition + 1;
                hint.setText(getString(R.string.Hint1));

                if (hintPosition == 1) {
                    hint.setVisibility(View.VISIBLE);
                    hintPosition = -1;
                } else {
                    hint.setVisibility(View.GONE);
                }
            }


        });

        //Sets the RadioGroup
        RadioGroup radioGroup = (RadioGroup) rootView.findViewById(R.id.RadioGroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton selected
                switch(checkedId) {
                    case R.id.RadioButton1:
                        // saves the letter S for the final password
                        answerGiven="S";
                        Toast.makeText(getActivity(), answerGiven,
                                Toast.LENGTH_LONG).show();
                        break;
                    case R.id.RadioButton2:
                        // saves the letter M for the final password
                        answerGiven="M";
                        Toast.makeText(getActivity(), answerGiven,
                                Toast.LENGTH_LONG).show();
                        break;
                    case R.id.RadioButton3:
                        // saves the letter L for the final password
                        answerGiven="L";
                        Toast.makeText(getActivity(), answerGiven,
                                Toast.LENGTH_LONG).show();
                        break;
                }
            }
        });

        //Clickable link to the solution video
        TextView Link = (TextView) rootView.findViewById(R.id.Solution1);
        if (Link != null) {
            Link.setMovementMethod(LinkMovementMethod.getInstance());
        }

        return rootView;
    }


    public displayAnswer(TextView textview){
        textview.setText(answerGiven);
    }

              /*public void SubmitAnswers(View view){
        TextView t = (TextView) SampleFragment1.findViewById(R.id.Answer1);
        String Answer1 = t.getText().toString();
        displayMessage(Answer1);
        }

    private void displayMessage(String message) {
        TextView answer1 = (TextView) findViewById(R.id.answer1_lastscreen);
        answer1.setText(message);
         }*/

}