package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class secoundpage extends AppCompatActivity {

//    view
    Button submit,next;
    TextView questionNo,question;
    RadioGroup radioGroup;
    RadioButton radioButton;
    RadioButton option1,option2,option3,option4;

//    checkCondition
    int questionCount=0;
    int rightAnswers=0;
    int WrongAnswer=0;


//    class
    QuestionGenraterClass questionGenraterClass;
    ArrayList<String> mcq=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secoundpage);

        submit=findViewById(R.id.submit);
        next=findViewById(R.id.next);
        questionNo=findViewById(R.id.questionNo);
        question=findViewById(R.id.qestion);
        radioGroup=findViewById(R.id.RadioGroup);

        option1=findViewById(R.id.option1);
        option2=findViewById(R.id.option2);
        option3=findViewById(R.id.option3);
        option4=findViewById(R.id.option4);

        Intent intent=getIntent();
        int postion=intent.getIntExtra("postion",0);
        questionGenraterClass=new QuestionGenraterClass(postion);


//        get question
        questionGenraterClass.addAnswerKeyInArrayList();
        questionGenraterClass.addQuestionInArrayList();
        question.setText(questionGenraterClass.arrayList.get(questionCount));

        mcq=questionGenraterClass.addQuestionMcqInArrayList(questionCount);
        option1.setText(mcq.get(0));
        option2.setText(mcq.get(1));
        option3.setText(mcq.get(2));
        option4.setText(mcq.get(3));





//        for next button
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(radioGroup.getCheckedRadioButtonId()==-1)
                {

                    Toast.makeText(secoundpage.this, "Please select The Option", Toast.LENGTH_SHORT).show();
                }
                else {
                    int check=radioGroup.getCheckedRadioButtonId();
                    radioButton=findViewById(check);
                    CheckAnswerRightOrNot(radioButton.getText().toString());
                    questionCount++;
                    checkQuestionStatus();
                }

            }
        });



//       for  submit button
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(radioGroup.getCheckedRadioButtonId()==-1)
                {

                    Toast.makeText(secoundpage.this, "Please select The Option", Toast.LENGTH_SHORT).show();
                }
                else {
                    int check=radioGroup.getCheckedRadioButtonId();
                    radioButton=findViewById(check);
                    CheckAnswerRightOrNot(radioButton.getText().toString());
                    Intent intent=new Intent(secoundpage.this,theredPage.class);
                    intent.putExtra("correct",rightAnswers);
                    intent.putExtra("wrong",WrongAnswer);
                    startActivity(intent);
                    questionCount=0;
                }
            }
        });

    }


    public void checkQuestionStatus()
    {


            radioGroup.clearCheck();
            mcq.clear();
//            update question no

            checkQuestionNoStatus();

//            check how many question are complete

            int qes=questionCount+1;
            questionNo.setText("Question "+qes +" Of 10 ");

//            update question
            question.setText("");
            question.setText(questionGenraterClass.arrayList.get(questionCount));


//            update question mcq
            mcq=questionGenraterClass.addQuestionMcqInArrayList(questionCount);
            option1.setText(mcq.get(0));
            option2.setText(mcq.get(1));
            option3.setText(mcq.get(2));
            option4.setText(mcq.get(3));



    }

    public void checkQuestionNoStatus()
    {

        if(questionCount==9)
        {
            submit.setVisibility(View.VISIBLE);
            next.setVisibility(View.GONE);
        }
    }

    public void CheckAnswerRightOrNot(String check)
    {

        if(check==questionGenraterClass.AnswerKey.get(questionCount))
        {
            rightAnswers++;
        }
        else
        {
            WrongAnswer++;
        }
    }


}