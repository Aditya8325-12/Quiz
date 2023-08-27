package com.example.quiz;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class theredPage extends AppCompatActivity {


    TextView correctAnswers,wrongAnswers;
    Button playAgain;

    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thered_page);

        playAgain=findViewById(R.id.playAgin);
        correctAnswers=findViewById(R.id.correct);
        wrongAnswers=findViewById(R.id.Incorrect);


        Intent intent=getIntent();
        int c=intent.getIntExtra("correct",0);
        int w=intent.getIntExtra("wrong",0);

        linearLayout=findViewById(R.id.linear1);


        if(c<5)
        {
            ImageView imageView=new ImageView(this);
            imageView.setLayoutParams(new LinearLayout.LayoutParams(100,100));
            imageView.setImageResource(R.drawable.star__2_);
            linearLayout.addView(imageView);
        }
        else
            if (c==5 || c==6 || c==7)
            {
                for(int i=0;i<2;i++)
                {

                    ImageView imageView=new ImageView(this);
                    imageView.setLayoutParams(new LinearLayout.LayoutParams(100,100));
                    imageView.setImageResource(R.drawable.star__2_);
                    int id=10;
                    imageView.setId(id+1);
                    linearLayout.addView(imageView);
                }
            }

            else if (c==8 || c==9 || c==10)
            {
                for(int i=0;i<=2;i++)
                {

                    ImageView imageView=new ImageView(this);
                    imageView.setLayoutParams(new LinearLayout.LayoutParams(100,100));
                    imageView.setImageResource(R.drawable.star__2_);
                    int id=10;
                    imageView.setId(id+1);
                    linearLayout.addView(imageView);
                }
            }

//        set the correct value
        correctAnswers.setText(""+c);
        wrongAnswers.setText(""+w);

//        back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Home");


        playAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(theredPage.this,secoundpage.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId())
        {
            case android.R.id.home:
                Intent intent=new Intent(theredPage.this,Listpage.class);
                startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}