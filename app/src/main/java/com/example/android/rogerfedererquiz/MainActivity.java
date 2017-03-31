package com.example.android.rogerfedererquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import static android.widget.Toast.makeText;

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

    // Global variables
    int correctAnswers = 0;

    /**
     * Initialize Toast Message.
     */
    Toast finalResultMessage;

    /**
     * When i rotate the device to landscape, the Activity is recreated again.
     * So by default the app doesn't remember the values of the variables I am using.
     * I must implement onSaveInstanceState() and add key-value pairs to the Bundle object.
     * @param savedInstanceState: Save additional state information for my activity.
     */
    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        // Save custom values into the bundle
        /*savedInstanceState.putString("scoreOfPlayerA", scoreOfPlayerA);
        savedInstanceState.putString("scoreOfPlayerB", scoreOfPlayerB);

        savedInstanceState.putInt("tieBreakScorePlayerA", tieBreakScorePlayerA);
        savedInstanceState.putInt("tieBreakScorePlayerB", tieBreakScorePlayerB);

        savedInstanceState.putInt("gamesPlayerA", gamesPlayerA);
        savedInstanceState.putInt("gamesPlayerB", gamesPlayerB);

        savedInstanceState.putInt("setsPlayerA", setsPlayerA);
        savedInstanceState.putInt("setsPlayerB", setsPlayerB);

        savedInstanceState.putBoolean("tieBreak", tieBreak);
        savedInstanceState.putBoolean("gameCompleted", gameCompleted);
        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);*/
    }

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

        /*if (savedInstanceState != null) {
            scoreOfPlayerA = savedInstanceState.getString("scoreOfPlayerA");
            scoreOfPlayerB = savedInstanceState.getString("scoreOfPlayerB");

            tieBreakScorePlayerA = savedInstanceState.getInt("tieBreakScorePlayerA");
            tieBreakScorePlayerB = savedInstanceState.getInt("tieBreakScorePlayerB");

            gamesPlayerA = savedInstanceState.getInt("gamesPlayerA");
            gamesPlayerB = savedInstanceState.getInt("gamesPlayerB");

            setsPlayerA = savedInstanceState.getInt("setsPlayerA");
            setsPlayerB = savedInstanceState.getInt("setsPlayerB");

            tieBreak = savedInstanceState.getBoolean("tieBreak");
            gameCompleted = savedInstanceState.getBoolean("gameCompleted");

            if (tieBreak == false){
                scoreViewPlayerA.setText(scoreOfPlayerA);
                scoreViewPlayerB.setText(scoreOfPlayerB);
            }
            else {
                scoreViewPlayerA.setText(String.valueOf(tieBreakScorePlayerA));
                scoreViewPlayerB.setText(String.valueOf(tieBreakScorePlayerB));
            }
            gamesViewPlayerA.setText(String.valueOf(gamesPlayerA));
            gamesViewPlayerB.setText(String.valueOf(gamesPlayerB));

            setsViewPlayerA.setText(String.valueOf(setsPlayerA));
            setsViewPlayerB.setText(String.valueOf(setsPlayerB));
        }*/
    }

    /**
     * This method is called when the submit button is clicked.
     */
    public void submitQuiz(View view) {
        // Take the answer of question 1. Check which radio button is checked.
        boolean question1RadioButton1Checked = question1RadioButton1.isChecked();
        boolean question1RadioButton2Checked = question1RadioButton2.isChecked();
        boolean question1RadioButton3Checked = question1RadioButton3.isChecked();
        boolean question1RadioButton4Checked = question1RadioButton4.isChecked();

        // Take the answer of question 2. Check if any check box is checked.
        boolean question2CheckBox1Checked = question2CheckBox1.isChecked();
        boolean question2CheckBox2Checked = question2CheckBox2.isChecked();
        boolean question2CheckBox3Checked = question2CheckBox3.isChecked();
        boolean question2CheckBox4Checked = question2CheckBox4.isChecked();

        // Take the answer of question 3. Check which radio button is checked.
        boolean question3RadioButton1Checked = question3RadioButton1.isChecked();
        boolean question3RadioButton2Checked = question3RadioButton2.isChecked();
        boolean question3RadioButton3Checked = question3RadioButton3.isChecked();
        boolean question3RadioButton4Checked = question3RadioButton4.isChecked();

        // Take the answer of question 4. Check which radio button is checked.
        boolean question4RadioButton1Checked = question4RadioButton1.isChecked();
        boolean question4RadioButton2Checked = question4RadioButton2.isChecked();
        boolean question4RadioButton3Checked = question4RadioButton3.isChecked();
        boolean question4RadioButton4Checked = question4RadioButton4.isChecked();

        // Take the answer of question 5. Check if any check box is checked.
        boolean question5CheckBox1Checked = question5CheckBox1.isChecked();
        boolean question5CheckBox2Checked = question5CheckBox2.isChecked();
        boolean question5CheckBox3Checked = question5CheckBox3.isChecked();
        boolean question5CheckBox4Checked = question5CheckBox4.isChecked();

        // Take the answer of question 6. Check which radio button is checked.
        boolean question6RadioButton1Checked = question6RadioButton1.isChecked();
        boolean question6RadioButton2Checked = question6RadioButton2.isChecked();
        boolean question6RadioButton3Checked = question6RadioButton3.isChecked();
        boolean question6RadioButton4Checked = question6RadioButton4.isChecked();

        // Take the answer of question 7. Check which radio button is checked.
        boolean question7RadioButton1Checked = question7RadioButton1.isChecked();
        boolean question7RadioButton2Checked = question7RadioButton2.isChecked();
        boolean question7RadioButton3Checked = question7RadioButton3.isChecked();
        boolean question7RadioButton4Checked = question7RadioButton4.isChecked();

        // Find the user's name.
        String answerQuestion8 = questionAnswer8.getText().toString();
        String answerQuestion9 = questionAnswer9.getText().toString();
        String answerQuestion10 = questionAnswer10.getText().toString();

        // Check Question 1 if it's correct.
        if (question1RadioButton1Checked == false && question1RadioButton2Checked == false
                && question1RadioButton3Checked == true && question1RadioButton4Checked == false){
            correctAnswers += 1;
        }

        // Check Question 2 if it's correct.
        if (question2CheckBox1Checked == true && question2CheckBox2Checked == false
                && question2CheckBox3Checked == true && question2CheckBox4Checked == true){
            correctAnswers += 1;
        }

        // Check Question 3 if it's correct.
        if (question3RadioButton1Checked == false && question3RadioButton2Checked == false
                && question3RadioButton3Checked == true && question3RadioButton4Checked == false){
            correctAnswers += 1;
        }

        // Check Question 4 if it's correct.
        if (question4RadioButton1Checked == false && question4RadioButton2Checked == false
                && question4RadioButton3Checked == false && question4RadioButton4Checked == true){
            correctAnswers += 1;
        }

        // Check Question 5 if it's correct.
        if (question5CheckBox1Checked == true && question5CheckBox2Checked == false
                && question5CheckBox3Checked == true && question5CheckBox4Checked == true){
            correctAnswers += 1;
        }

        // Check Question 6 if it's correct.
        if (question6RadioButton1Checked == true && question6RadioButton2Checked == false
                && question6RadioButton3Checked == false && question6RadioButton4Checked == false){
            correctAnswers += 1;
        }

        // Check Question 7 if it's correct.
        if (question7RadioButton1Checked == false && question7RadioButton2Checked == false
                && question7RadioButton3Checked == false && question7RadioButton4Checked == true){
            correctAnswers += 1;
        }

        // Check Question 8 if it's correct.
        if (answerQuestion8.equals("Wawrinka") || answerQuestion8.equals("WAWRINKA") || answerQuestion8.equals("wawrinka")){
            correctAnswers += 1;
        }

        // Check Question 9 if it's correct.
        if (answerQuestion9.equals("Nadal") || answerQuestion9.equals("NADAL") || answerQuestion9.equals("nadal")){
            correctAnswers += 1;
        }

        // Check Question 10 if it's correct.
        if (answerQuestion10.equals("Swiss") || answerQuestion10.equals("SWISS") || answerQuestion10.equals("swiss")){
            correctAnswers += 1;
        }

        String finalResults = correctAnswers + "/10";
        String toastMessage = getString(R.string.toast_message, finalResults);
        finalResultMessage.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_LONG).show();
        correctAnswers = 0;
    }
}
