package com.horvat.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnTrue, btnWrong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

       QuizModel model = new QuizModel(R.string.q1,true);

    }

    private void initViews() {
        btnTrue = findViewById(R.id.btnTrue);
        btnWrong = findViewById(R.id.btnWrong);

    }


    public void onClickBtnTrue(View view){
        Log.i("TAG", "Button true is tapped");
    }

   public void onClickBtnWrong(View view){
        // context moze biti: this ili MainActivity.this.
       Toast.makeText(getApplicationContext(), "Button wrong is clicked", Toast.LENGTH_SHORT).show();
   }

}