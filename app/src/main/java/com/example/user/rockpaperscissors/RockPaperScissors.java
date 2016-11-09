package com.example.user.rockpaperscissors;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by user on 09/11/2016.
 */

public class RockPaperScissors extends AppCompatActivity {

    TextView mInstruction;
    Button mRock;
    Button mPaper;
    Button mScissors;
    TextView mResult;

    @Override
    protected void onCreate (Bundle savedInstanceState) {

        Log.d("RockPaperScissors", "onCreate called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mInstruction = (TextView)findViewById(R.id.instruction_text);
        mRock = (Button)findViewById(R.id.rock_button);
        mPaper = (Button)findViewById(R.id.paper_button);
        mScissors = (Button)findViewById(R.id.scissors_button);
        mResult = (TextView)findViewById(R.id.result_text);

        mRock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("RockPaperScissors", "Rock button clicked");

                Game game = new Game();
                String result = game.play(0);
                mResult.setText(result);

            }
        });

        mPaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("RockPaperScissors", "Paper button clicked");

                Game game = new Game();
                String result = game.play(1);
                mResult.setText(result);

            }
        });

        mScissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("RockPaperScissors", "Scissors button clicked");

                Game game = new Game();
                String result = game.play(2);

                mResult.setText(result);

            }
        });



    }

}
