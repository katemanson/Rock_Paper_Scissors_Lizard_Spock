package com.example.user.rockpaperscissors;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by user on 09/11/2016.
 */

public class RPS extends AppCompatActivity {

    TextView mInstruction;
    Button mRock;
    Button mPaper;
    Button mScissors;

    RPSGame mGame = new RPSGame();
    Intent mIntent = new Intent(RPS.this, RPSResult.class);

    @Override
    protected void onCreate (Bundle savedInstanceState) {

        Log.d("RockPaperScissors", "RPS onCreate called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mInstruction = (TextView)findViewById(R.id.instruction_text);
        mRock = (Button)findViewById(R.id.rock_button);
        mPaper = (Button)findViewById(R.id.paper_button);
        mScissors = (Button)findViewById(R.id.scissors_button);

        mRock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("RockPaperScissors", "Rock button clicked");

                String result = mGame.play(0);
                int countsText = mGame.getCountsText();
                mIntent.putExtra("result", result);
                mIntent.putExtra("countsText", countsText);
                startActivity(mIntent);

            }
        });

        mPaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("RockPaperScissors", "Paper button clicked");
                String result = mGame.play(1);
                int countsText = mGame.getCountsText();
                mIntent.putExtra("result", result);
                mIntent.putExtra("countsText", countsText);
                startActivity(mIntent);

            }
        });

        mScissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("RockPaperScissors", "Scissors button clicked");
                String result = mGame.play(2);
                int countsText = mGame.getCountsText();
                mIntent.putExtra("result", result);
                mIntent.putExtra("countsText", countsText);
                startActivity(mIntent);

            }
        });

    }

}
