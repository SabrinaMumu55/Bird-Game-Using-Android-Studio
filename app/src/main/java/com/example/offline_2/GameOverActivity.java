package com.example.offline_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameOverActivity extends AppCompatActivity {


    private Button startGameAgain;
    private TextView DisplayScore;
    private String score;

    private Button AboutButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        AboutButton = (Button)findViewById(R.id.about) ;
        AboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAbout();
            }
        });



        score = getIntent().getExtras().get("score").toString();

        startGameAgain = (Button)findViewById(R.id.play_again_btn);

        DisplayScore = (TextView)findViewById(R.id.display_score);


        startGameAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(GameOverActivity.this,MainActivity.class);
                startActivity(mainIntent);
            }
        });

        DisplayScore.setText("Your score is " +score);

    }

    public void openAbout(){

        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }
}
