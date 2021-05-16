package com.example.quizz_swann3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Question1 extends AppCompatActivity {

    Button reponse1, reponse2, reponse3, reponse4;
    TextView score, question;
    private Questions mQuestions = new Questions();

    private String mReponse;
    private int mScore = 0;
    private int mQuestionsLenght = mQuestions.mQuestions.length;

    Random r;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);

        r = new Random();

        reponse1 = (Button) findViewById(R.id.reponse1);
        reponse2 = (Button) findViewById(R.id.reponse2);
        reponse3 = (Button) findViewById(R.id.reponse3);
        reponse4 = (Button) findViewById(R.id.reponse4);

        score = (TextView) findViewById(R.id.score);
        question = (TextView) findViewById(R.id.question);

        score.setText("Score:" + mScore);

        updateQuestion(r.nextInt(mQuestionsLenght));

        reponse1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (reponse1.getText() == mReponse){
                    mScore++;
                    score.setText("Score:" + mScore);
                    updateQuestion(r.nextInt(mQuestionsLenght));
                } else {
                    gameOver();
                }

            }
        });

        reponse2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (reponse2.getText() == mReponse){
                    mScore++;
                    score.setText("Score:" + mScore);
                    updateQuestion(r.nextInt(mQuestionsLenght));
                } else {
                    gameOver();
                }

            }
        });

        reponse3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (reponse3.getText() == mReponse){
                    mScore++;
                    score.setText("Score:" + mScore);
                    updateQuestion(r.nextInt(mQuestionsLenght));
                } else {
                    gameOver();
                }

            }
        });

        reponse4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (reponse4.getText() == mReponse){
                    mScore++;
                    score.setText("Score:" + mScore);
                    updateQuestion(r.nextInt(mQuestionsLenght));
                } else {
                    gameOver();
                }

            }
        });

    }

    private void updateQuestion (int num) {
        question.setText(mQuestions.getQuestion(num));
        reponse1.setText(mQuestions.getChoix1(num));
        reponse2.setText(mQuestions.getChoix2(num));
        reponse3.setText(mQuestions.getChoix3(num));
        reponse4.setText(mQuestions.getChoix4(num));

        mReponse = mQuestions.getReponseCorrecte(num);
    }

    private void gameOver() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Question1.this);
        alertDialogBuilder
                .setMessage("Game Over ! Ton score est de " +mScore + " points !")
                .setCancelable(false)
                .setPositiveButton("Nouvelle partie",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                startActivity(new Intent(getApplicationContext(), Question1.class));
                                finish();
                            }
                        })
                .setNegativeButton("EXIT",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int which) {
                                finish();

                            }
                        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}





