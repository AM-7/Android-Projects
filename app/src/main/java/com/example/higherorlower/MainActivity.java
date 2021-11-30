package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends AppCompatActivity {
    int randomNum;

    public void generateRandomNum(){

        Random rand=new Random();
        randomNum=rand.nextInt(20)+1;
    }

    public void guessed(View view){

            EditText userGuess=(EditText)findViewById(R.id.userGuess);
            String guess=userGuess.getText().toString();
            int n=new Integer(guess).intValue();

            if (n==randomNum) {
                    Toast.makeText(this, "Correct! Try Again", Toast.LENGTH_SHORT).show();
                    generateRandomNum();

                }else if (n>randomNum){
                    Toast.makeText(this, "Lower", Toast.LENGTH_SHORT).show();


                }else if (n<randomNum){
                    Toast.makeText(this, "Higher", Toast.LENGTH_SHORT).show();

                }
            }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generateRandomNum();


    }
}