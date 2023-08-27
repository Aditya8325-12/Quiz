package com.example.quiz;

import android.content.Intent;

import java.util.ArrayList;

public class QuestionGenraterClass {


    String[] questionList1={" Which is not an operating mode of shared preferences?",
            " Shared Preference is initialized using which of the following method?",
            " editor.putBoolean(\"key_name\", true);",
            " What will happen when the below code is executed?",
            " pref.getInt(\"key_name\", 0);" +
                    "\nWhat will the above code do?",
            " editor.putInteger(\"key_name\", true);" +
                    "\nExecuting the above code will _________.",
            " Which of the following method saves the changes done to the shared preference?",
            " editor.apply();" +
                    "\nWhat does the above code do?",
            " editor.commit();" +
                    "\nWhat will happen when the above code is executed?",
            " Which of the following is used to delete all the data in Shared Preference?"};
    String[][] questionMcqList1={
            {"MODE_APPEND","MODE_PRIVATE","MODE_MULTI_PROCESS","MODE_USEABLE"},
            {"getSharedPreferences()","sharedPreferences.edit()","getShared()","getMyPreference()"},
            {"give syntax error","store boolean value","store a string value","does not store anything"},
            {"give syntax error","store boolean value","store a string value","does not store anything"},
            {"give syntax error","store boolean value","retrieve a string value","retrieve an integer value"},
            {"give syntax error","store boolean value","store a string value","store an integer value"},
            {"commit()","execute()","save()",".edit()"},
            {"applies the preference","closes the editor","saves the changes","stores the values"},
            {"It will commit the preference.","It will call the commit interface.","It will save the changes.","It will store the values."},
            {"editor.clear();","editor.delete();","editor.removeAll();","editor.destroy()"}
    };
    String[] questionAnswer1={"MODE_USEABLE","getSharedPreferences()","store boolean value","store a string value","retrieve an integer value","give syntax error","commit()","saves the changes","It will save the changes.","editor.clear();"};




    String[] questionList2={"Which of the following is not a Thread state?","Long running task should be handled using _____.","Which method must be overridden for using AsyncTask?","Which keywords must be used to check for exceptions?","Which of the following is a callback method for Async Task?","Which method calls the Async Task?","Which method calls the Async Task?","What is the main purpose of the try catch block?","Which of the following is not responsible for Long Running Task?","To use async task, we must ____________."};

    String[][] questionMcqList2={
            {"New","Runnable","Sleep","Terminated"},
            {"Background Thread","UI Thread","Service","Handle by OS"},
            {"onPostExecute","onBackgroundTask","doInBackground","backgroundThreadOperation"},
            {"try","finally","catch","throw"},
            {"doInForeground","backgroundThreadOperation","onPostExecute","onBackgroundTask"},
            {".call()",".execute()",".start()",".run()"},
            {"Exception Handling","Boosting App Performance","Syntax Error Handling","Catching objects"},
            {"doInForeground","doInBackground","backgroundThreadOperation","onPostExecute"},
            {"Accessing Resources from Internet","Database Operation","Web Service Call","Addition of two numbers"},
            {"Make a separate class which extends AsyncTask","Make a separate class which implements AsyncTask","Make a separate Interface which extends AsyncTask","Make a separate XML file"},
    };

    String[] questionAnswer2={"Sleep","Background Thread","onPostExecute","try","doInForeground",".execute()","Exception Handling","doInBackground","Addition of two numbers","Make a separate class which implements AsyncTask"};



    String[] questionList3={"Theme is used to design the Status Bar, Action Bar and UI elements of activity.","Which widget supports android:text attribute?","When the below line is added to the activity tag inside a Manifest file, what will happen?","Which attribute is required to change a Button background?","_______ represent multiple screen inside one activity.","What is AppBarLayout?","Which of the following is the correct step for adding menu directory in current project?","How to create new activity in Android Studio?","In colors.xml file, which is the base color for an application?","Which of the following is not a part of android resources folder?"};
    String[][] questionMcqList3={
            {"TRUE","FALSE","Null","N" +
                    "ull"},
            {"ImageView","Button","ImageButton","View"},
            {"It will show actionbar in the bottom.","It will hide the actionbar.","Application will crash.","Nothing happens."},
            {"android:background","android:buttonBackground","android:src","android:Bg"},
            {"Themes","App Bar","Fragment","Layout"},
            {"It is a container used for custom Action Bar.","It is a layout used for custom Bottom Bar.","It is the layout which is essential for Tool Bar.","It is a layout for custom images."},
            {"Resource -> new -> Android Resource Directory -> change resource type to XML","Resource -> new -> Android Resource Directory -> change available qualifiers to Local", "Resource -> new -> Android Resource Directory -> change resource type to menu","Resource -> new -> Android Resource Directory -> change directory name to menu"},
            {"package -> new -> Activity -> Empty activity","package -> new -> google -> activity","package -> new folder -> activity","package -> new -> AIDL -> AIDL file"},
            {"colorPrimaryDark","colorPrimary","colorAccent","colorBase"},
            {"Values","Menu","Layout","Assert"}
    };
    String[] questionAnswer3={"TRUE","Button","It will hide the actionbar.","android:background","Fragment","It is a container used for custom Action Bar.","Resource -> new -> Android Resource Directory -> change directory name to menu","package -> new -> Activity -> Empty activity","colorPrimary","Assert"};



    int postion;
    String[] questionList;
    String[][] questionMcqList;
    String[] questionAnswer;


    public  QuestionGenraterClass(int id)
    {
        postion=id;
        if(postion==0)
        {
            questionList=questionList1;
            questionAnswer=questionAnswer1;
            questionMcqList=questionMcqList1;
        }
        else
            if (postion==1)
            {
                questionList=questionList2;
                questionAnswer=questionAnswer2;
                questionMcqList=questionMcqList2;
            }
        else
           if(postion==2)
             {
                 questionList=questionList3;
                 questionAnswer=questionAnswer3;
                 questionMcqList=questionMcqList3;
             }
    }



    ArrayList<String> arrayList=new ArrayList<>();
    ArrayList<String> McqOption=new ArrayList<>();
    ArrayList<String> AnswerKey=new ArrayList<>();



    public ArrayList<String> addQuestionMcqInArrayList(int questionno)
    {

        for(int i=0;i<4;i++)
        {
            McqOption.add(questionMcqList[questionno][i]);
        }
        return McqOption;

    }

    public void addAnswerKeyInArrayList() {
        for (int i = 0; i < questionAnswer.length; i++)
        {
            AnswerKey.add(questionAnswer[i]);
        }

    }


    public void addQuestionInArrayList()
    {
        for(int i=0;i<questionList.length;i++)
        {
            arrayList.add(questionList[i]);
        }
    }




}
