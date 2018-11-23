package com.dicoding.kotlin.rakaiqbalsy.footballscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView scoreBarca, scoreMadrid;
    private Button plusBarca, minBarca, plusMadrid, minMadrid, resetScore;

    int scoreValBarca = 0;
    int scoreValMadrid =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //declaration button barca
        plusBarca = findViewById(R.id.plusBarca);
        minBarca = findViewById(R.id.minusBarca);

        //declaration for button madrid
        plusMadrid = findViewById(R.id.plusMadrid);
        minMadrid = findViewById(R.id.minusMadrid);

        //declaration for reset button
        resetScore = findViewById(R.id.resetScore);


        //action for button barca
        plusBarca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreValBarca = scoreValBarca+1;

                //set score
                scoreBarca.setText(String.valueOf(scoreValBarca));
            }
        });

        minBarca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreValBarca = scoreValBarca-1;

                //set score
                scoreBarca.setText(String.valueOf(scoreValBarca));
                if (scoreValBarca <0) {
                    scoreValBarca =0;
                    scoreBarca.setText(String.valueOf(scoreValBarca));
                }
            }
        });

        //action for button madrid
        plusMadrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreValMadrid = scoreValMadrid+1;

                //set score
                scoreMadrid.setText(String.valueOf(scoreValMadrid));
            }
        });

        minMadrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreValMadrid = scoreValMadrid-1;

                //set score
                scoreMadrid.setText(String.valueOf(scoreValMadrid));
                if (scoreValMadrid <0) {
                    scoreValMadrid =0;
                    scoreMadrid.setText(String.valueOf(scoreValMadrid));
                }
            }
        });

        //action for reset button
        resetScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreValBarca =0;
                scoreValMadrid = 0;
                //set score 0 - 0
                scoreBarca.setText(String.valueOf(scoreValBarca));
                scoreMadrid.setText(String.valueOf(scoreValMadrid));
            }
        });

        //set score for both
        scoreBarca = findViewById(R.id.scoreBarca);
        scoreMadrid = findViewById(R.id.scoreMadrid);

    }
}