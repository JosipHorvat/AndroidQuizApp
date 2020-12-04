package com.horvat.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnTrue, btnWrong;
    private TextView txtQuestion;
    private int questionIndex;
    private int quizQuestion;

    private QuizModel[] questionCollection = new QuizModel[]{

            new QuizModel(R.string.q1, true),
            new QuizModel(R.string.q2, false),
            new QuizModel(R.string.q3, true),
            new QuizModel(R.string.q4, false),
            new QuizModel(R.string.q5, true),
            new QuizModel(R.string.q6, false),
            new QuizModel(R.string.q7, true),
            new QuizModel(R.string.q8, false),
            new QuizModel(R.string.q9, true),
            new QuizModel(R.string.q10, false)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

        QuizModel q1 = questionCollection[questionIndex];
        quizQuestion = q1.getmQuestion();
        txtQuestion.setText(quizQuestion);



    }

    private void initViews() {
        btnTrue = findViewById(R.id.btnTrue);
        btnWrong = findViewById(R.id.btnWrong);
        txtQuestion = findViewById(R.id.txtQuestion);

    }


    public void onClickBtnTrue(View view){
        changeQuestionOnButtonTapped();
    }

   public void onClickBtnWrong(View view){
       changeQuestionOnButtonTapped();
   }

   private void changeQuestionOnButtonTapped(){

        //0 = 1 % 10 = 1
       //1 = 2 % 10 = 2
       //9 = 10 % 10 = 0  i index ce ponovno biti 0 te ce nas vratiti na prvo pitanje
       questionIndex = (questionIndex+ 1) % 10;


       quizQuestion = questionCollection[questionIndex].getmQuestion();
        txtQuestion.setText(quizQuestion);
   }

}