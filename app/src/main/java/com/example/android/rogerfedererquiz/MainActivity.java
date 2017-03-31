package com.example.android.rogerfedererquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    /**
     * Declare the Views.
     */
    EditText nameEditText;

    // Question 1 Views
    RadioButton question1RadioButton1;
    RadioButton question1RadioButton2;
    RadioButton question1RadioButton3;
    RadioButton question1RadioButton4;

    // Question 2 Views
    CheckBox question2CheckBox1;
    CheckBox question2CheckBox2;
    CheckBox question2CheckBox3;
    CheckBox question2CheckBox4;

    // Question 3 Views
    RadioButton question3RadioButton1;
    RadioButton question3RadioButton2;
    RadioButton question3RadioButton3;
    RadioButton question3RadioButton4;

    // Question 4 Views
    RadioButton question4RadioButton1;
    RadioButton question4RadioButton2;
    RadioButton question4RadioButton3;
    RadioButton question4RadioButton4;

    // Question 5 Views
    CheckBox question5CheckBox1;
    CheckBox question5CheckBox2;
    CheckBox question5CheckBox3;
    CheckBox question5CheckBox4;

    // Question 6 Views
    RadioButton question6RadioButton1;
    RadioButton question6RadioButton2;
    RadioButton question6RadioButton3;
    RadioButton question6RadioButton4;

    // Question 7 Views
    RadioButton question7RadioButton1;
    RadioButton question7RadioButton2;
    RadioButton question7RadioButton3;
    RadioButton question7RadioButton4;

    // Question 8, 9, 10 editText Views
    EditText questionAnswer8;
    EditText questionAnswer9;
    EditText questionAnswer10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Initialize the views.
         */
        nameEditText = (EditText) findViewById(R.id.name_edit_text);

        question1RadioButton1 = (RadioButton) findViewById(R.id.question_1_radio_button_1);
        question1RadioButton2 = (RadioButton) findViewById(R.id.question_1_radio_button_2);
        question1RadioButton3 = (RadioButton) findViewById(R.id.question_1_radio_button_3);
        question1RadioButton4 = (RadioButton) findViewById(R.id.question_1_radio_button_4);

        question2CheckBox1 = (CheckBox) findViewById(R.id.question_2_check_box_1);
        question2CheckBox2 = (CheckBox) findViewById(R.id.question_2_check_box_2);
        question2CheckBox3 = (CheckBox) findViewById(R.id.question_2_check_box_3);
        question2CheckBox4 = (CheckBox) findViewById(R.id.question_2_check_box_4);

        question3RadioButton1 = (RadioButton) findViewById(R.id.question_3_radio_button_1);
        question3RadioButton2 = (RadioButton) findViewById(R.id.question_3_radio_button_2);
        question3RadioButton3 = (RadioButton) findViewById(R.id.question_3_radio_button_3);
        question3RadioButton4 = (RadioButton) findViewById(R.id.question_3_radio_button_4);

        question4RadioButton1 = (RadioButton) findViewById(R.id.question_4_radio_button_1);
        question4RadioButton2 = (RadioButton) findViewById(R.id.question_4_radio_button_2);
        question4RadioButton3 = (RadioButton) findViewById(R.id.question_4_radio_button_3);
        question4RadioButton4 = (RadioButton) findViewById(R.id.question_4_radio_button_4);

        question5CheckBox1 = (CheckBox) findViewById(R.id.question_5_check_box_1);
        question5CheckBox2 = (CheckBox) findViewById(R.id.question_5_check_box_2);
        question5CheckBox3 = (CheckBox) findViewById(R.id.question_5_check_box_3);
        question5CheckBox4 = (CheckBox) findViewById(R.id.question_5_check_box_4);

        question6RadioButton1 = (RadioButton) findViewById(R.id.question_6_radio_button_1);
        question6RadioButton2 = (RadioButton) findViewById(R.id.question_6_radio_button_2);
        question6RadioButton3 = (RadioButton) findViewById(R.id.question_6_radio_button_3);
        question6RadioButton4 = (RadioButton) findViewById(R.id.question_6_radio_button_4);

        question7RadioButton1 = (RadioButton) findViewById(R.id.question_7_radio_button_1);
        question7RadioButton2 = (RadioButton) findViewById(R.id.question_7_radio_button_2);
        question7RadioButton3 = (RadioButton) findViewById(R.id.question_7_radio_button_3);
        question7RadioButton4 = (RadioButton) findViewById(R.id.question_7_radio_button_4);

        questionAnswer8 = (EditText) findViewById(R.id.question_8_answer);
        questionAnswer9 = (EditText) findViewById(R.id.question_9_answer);
        questionAnswer10 = (EditText) findViewById(R.id.question_10_answer);
    }
}
