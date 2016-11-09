package com.example.user.rockpaperscissors;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by user on 09/11/2016.
 */

public class RPSLSResult extends AppCompatActivity {

    TextView mResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.d("RockPaperScissors", "RPSResult onCreate called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rps_result);

        mResult = (TextView)findViewById(R.id.rps_result_text);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        String result = extras.getString("result");
        mResult.setText(result);

    }

}
