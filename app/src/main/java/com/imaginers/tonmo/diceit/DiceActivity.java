package com.imaginers.tonmo.diceit;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class DiceActivity extends AppCompatActivity {
    ImageView diceView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);
        initResources();
    }


    public void initResources() {
        diceView = (ImageButton) findViewById(R.id.diceButton);
    }

    public void onDicePress(View view) {
        int min = 1;
        int max = 6;
        int difference = (max - min);
        int randomRoll = 0;

        Context context = getApplicationContext();
        CharSequence text = "GORBOR!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);

        Random random = new Random();
        randomRoll = random.nextInt(difference + 1);
        randomRoll += min;
        switch (randomRoll) {
            case 1:
                ((ImageButton) view).setImageResource(R.drawable.one);
                break;
            case 2:
                ((ImageButton) view).setImageResource(R.drawable.two);
                break;
            case 3:
                ((ImageButton) view).setImageResource(R.drawable.three);
                break;
            case 4:
                ((ImageButton) view).setImageResource(R.drawable.four);
                break;
            case 5:
                ((ImageButton) view).setImageResource(R.drawable.five);
                break;
            case 6:
                ((ImageButton) view).setImageResource(R.drawable.six);
                break;
            default:
                toast.show();
        }

    }
}
