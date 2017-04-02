package com.example.android.rogerfedererquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import static android.widget.Toast.makeText;

public class MainActivity extends AppCompatActivity {

    /**
     * Declare the Views.
     */
    EditText nameEditText;
    // Take the name of the player.
    String nameOfPlayer;

    // Question 1 Views
    RadioGroup question1RadioGroup;
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
    RadioGroup question3RadioGroup;
    RadioButton question3RadioButton1;
    RadioButton question3RadioButton2;
    RadioButton question3RadioButton3;
    RadioButton question3RadioButton4;

    // Question 4 Views
    RadioGroup question4RadioGroup;
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
    RadioGroup question6RadioGroup;
    RadioButton question6RadioButton1;
    RadioButton question6RadioButton2;
    RadioButton question6RadioButton3;
    RadioButton question6RadioButton4;

    // Question 7 Views
    RadioGroup question7RadioGroup;
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

    int question1RadioButtonSelectedId;

    boolean question2CheckBox1Checked;
    boolean question2CheckBox2Checked;
    boolean question2CheckBox3Checked;
    boolean question2CheckBox4Checked;

    int question3RadioButtonSelectedId;

    int question4RadioButtonSelectedId;

    boolean question5CheckBox1Checked;
    boolean question5CheckBox2Checked;
    boolean question5CheckBox3Checked;
    boolean question5CheckBox4Checked;

    int question6RadioButtonSelectedId;

    int question7RadioButtonSelectedId;

    String answerQuestion8;
    String answerQuestion9;
    String answerQuestion10;

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
        // Save custom values into the bundle.
        savedInstanceState.putString("name", nameOfPlayer);

        savedInstanceState.putInt("question1RadioButtonSelectedId", question1RadioButtonSelectedId);

        savedInstanceState.putBoolean("isQuestion2CheckBox1Checked", question2CheckBox1Checked);
        savedInstanceState.putBoolean("isQuestion2CheckBox2Checked", question2CheckBox2Checked);
        savedInstanceState.putBoolean("isQuestion2CheckBox3Checked", question2CheckBox3Checked);
        savedInstanceState.putBoolean("isQuestion2CheckBox4Checked", question2CheckBox4Checked);

        savedInstanceState.putInt("question3RadioButtonSelectedId", question3RadioButtonSelectedId);

        savedInstanceState.putInt("question4RadioButtonSelectedId", question4RadioButtonSelectedId);

        savedInstanceState.putBoolean("isQuestion5CheckBox1Checked", question5CheckBox1Checked);
        savedInstanceState.putBoolean("isQuestion5CheckBox2Checked", question5CheckBox2Checked);
        savedInstanceState.putBoolean("isQuestion5CheckBox3Checked", question5CheckBox3Checked);
        savedInstanceState.putBoolean("isQuestion5CheckBox4Checked", question5CheckBox4Checked);

        savedInstanceState.putInt("question6RadioButtonSelectedId", question6RadioButtonSelectedId);

        savedInstanceState.putInt("question7RadioButtonSelectedId", question7RadioButtonSelectedId);

        savedInstanceState.putString("answerQuestion8", answerQuestion8);
        savedInstanceState.putString("answerQuestion9", answerQuestion9);
        savedInstanceState.putString("answerQuestion10", answerQuestion10);

        savedInstanceState.putInt("correctAnswers", correctAnswers);

        // Always call the superclass so it can save the view hierarchy state.
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Initialize the views.
         */
        nameEditText = (EditText) findViewById(R.id.name_edit_text);

        question1RadioGroup = (RadioGroup) findViewById(R.id.question_1_radio_group);
        question1RadioButton1 = (RadioButton) findViewById(R.id.question_1_radio_button_1);
        question1RadioButton2 = (RadioButton) findViewById(R.id.question_1_radio_button_2);
        question1RadioButton3 = (RadioButton) findViewById(R.id.question_1_radio_button_3);
        question1RadioButton4 = (RadioButton) findViewById(R.id.question_1_radio_button_4);

        question2CheckBox1 = (CheckBox) findViewById(R.id.question_2_check_box_1);
        question2CheckBox2 = (CheckBox) findViewById(R.id.question_2_check_box_2);
        question2CheckBox3 = (CheckBox) findViewById(R.id.question_2_check_box_3);
        question2CheckBox4 = (CheckBox) findViewById(R.id.question_2_check_box_4);

        question3RadioGroup = (RadioGroup) findViewById(R.id.question_3_radio_group);
        question3RadioButton1 = (RadioButton) findViewById(R.id.question_3_radio_button_1);
        question3RadioButton2 = (RadioButton) findViewById(R.id.question_3_radio_button_2);
        question3RadioButton3 = (RadioButton) findViewById(R.id.question_3_radio_button_3);
        question3RadioButton4 = (RadioButton) findViewById(R.id.question_3_radio_button_4);

        question4RadioGroup = (RadioGroup) findViewById(R.id.question_4_radio_group);
        question4RadioButton1 = (RadioButton) findViewById(R.id.question_4_radio_button_1);
        question4RadioButton2 = (RadioButton) findViewById(R.id.question_4_radio_button_2);
        question4RadioButton3 = (RadioButton) findViewById(R.id.question_4_radio_button_3);
        question4RadioButton4 = (RadioButton) findViewById(R.id.question_4_radio_button_4);

        question5CheckBox1 = (CheckBox) findViewById(R.id.question_5_check_box_1);
        question5CheckBox2 = (CheckBox) findViewById(R.id.question_5_check_box_2);
        question5CheckBox3 = (CheckBox) findViewById(R.id.question_5_check_box_3);
        question5CheckBox4 = (CheckBox) findViewById(R.id.question_5_check_box_4);

        question6RadioGroup = (RadioGroup) findViewById(R.id.question_6_radio_group);
        question6RadioButton1 = (RadioButton) findViewById(R.id.question_6_radio_button_1);
        question6RadioButton2 = (RadioButton) findViewById(R.id.question_6_radio_button_2);
        question6RadioButton3 = (RadioButton) findViewById(R.id.question_6_radio_button_3);
        question6RadioButton4 = (RadioButton) findViewById(R.id.question_6_radio_button_4);

        question7RadioGroup = (RadioGroup) findViewById(R.id.question_7_radio_group);
        question7RadioButton1 = (RadioButton) findViewById(R.id.question_7_radio_button_1);
        question7RadioButton2 = (RadioButton) findViewById(R.id.question_7_radio_button_2);
        question7RadioButton3 = (RadioButton) findViewById(R.id.question_7_radio_button_3);
        question7RadioButton4 = (RadioButton) findViewById(R.id.question_7_radio_button_4);

        questionAnswer8 = (EditText) findViewById(R.id.question_8_answer);
        questionAnswer9 = (EditText) findViewById(R.id.question_9_answer);
        questionAnswer10 = (EditText) findViewById(R.id.question_10_answer);

        if (savedInstanceState != null) {
            nameOfPlayer = savedInstanceState.getString("name");

            question1RadioButtonSelectedId = savedInstanceState.getInt("question1RadioButtonSelectedId");

            question2CheckBox1Checked = savedInstanceState.getBoolean("isQuestion2CheckBox1Checked");
            question2CheckBox2Checked = savedInstanceState.getBoolean("isQuestion2CheckBox2Checked");
            question2CheckBox3Checked = savedInstanceState.getBoolean("isQuestion2CheckBox3Checked");
            question2CheckBox4Checked = savedInstanceState.getBoolean("isQuestion2CheckBox4Checked");

            question3RadioButtonSelectedId = savedInstanceState.getInt("question3RadioButtonSelectedId");

            question4RadioButtonSelectedId = savedInstanceState.getInt("question4RadioButtonSelectedId");

            question5CheckBox1Checked = savedInstanceState.getBoolean("isQuestion5CheckBox1Checked");
            question5CheckBox2Checked = savedInstanceState.getBoolean("isQuestion5CheckBox2Checked");
            question5CheckBox3Checked = savedInstanceState.getBoolean("isQuestion5CheckBox3Checked");
            question5CheckBox4Checked = savedInstanceState.getBoolean("isQuestion5CheckBox4Checked");

            question6RadioButtonSelectedId = savedInstanceState.getInt("question6RadioButtonSelectedId");

            question7RadioButtonSelectedId = savedInstanceState.getInt("question7RadioButtonSelectedId");

            answerQuestion8 = savedInstanceState.getString("answerQuestion8");
            answerQuestion9 = savedInstanceState.getString("answerQuestion9");
            answerQuestion10 = savedInstanceState.getString("answerQuestion10");

            correctAnswers = savedInstanceState.getInt("correctAnswers");
        }
    }

    /**
     * This method is called when the submit button is clicked.
     * @correctAnswers: global variable
     */
    public void submitQuiz(View view) {
        nameOfPlayer = nameEditText.getText().toString();
        String finalResults = calculateQuizResult();

        // Create toast message to display.
        String toastMessage;
        if (correctAnswers == 10){
            toastMessage = getString(R.string.toast_message_2, finalResults);
            if (nameOfPlayer.length() != 0) {
                toastMessage += "\n" + getString(R.string.toast_message_3, nameOfPlayer);
            }
            toastMessage += "\n" + getString(R.string.toast_message_4);
        }
        else {
            toastMessage = getString(R.string.toast_message_1, finalResults);
        }
        finalResultMessage.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_LONG).show();

        // Reset number of correct answers.
        correctAnswers = 0;
    }

    /**
     * This method finds the correct answer and returns the final quiz results.
     * @correctAnswers: global variable
     */
    public String calculateQuizResult(){
        // Take the answer of question 2. Check if any check box is checked.
        question2CheckBox1Checked = question2CheckBox1.isChecked();
        question2CheckBox2Checked = question2CheckBox2.isChecked();
        question2CheckBox3Checked = question2CheckBox3.isChecked();
        question2CheckBox4Checked = question2CheckBox4.isChecked();

        // Take the answer of question 5. Check if any check box is checked.
        question5CheckBox1Checked = question5CheckBox1.isChecked();
        question5CheckBox2Checked = question5CheckBox2.isChecked();
        question5CheckBox3Checked = question5CheckBox3.isChecked();
        question5CheckBox4Checked = question5CheckBox4.isChecked();

        // Find the user's name.
        answerQuestion8 = questionAnswer8.getText().toString();
        answerQuestion9 = questionAnswer9.getText().toString();
        answerQuestion10 = questionAnswer10.getText().toString();

        // Check Question 1 if it's correct.
        question1RadioButtonSelectedId = question1RadioGroup.getCheckedRadioButtonId();
        if (question1RadioGroup.findViewById(question1RadioButtonSelectedId) == question1RadioButton3) {
            correctAnswers += 1;
        }

        // Check Question 2 if it's correct.
        if (question2CheckBox1Checked == true && question2CheckBox2Checked == false
                && question2CheckBox3Checked == true && question2CheckBox4Checked == true){
            correctAnswers += 1;
        }

        // Check Question 3 if it's correct.
        question3RadioButtonSelectedId = question3RadioGroup.getCheckedRadioButtonId();
        if (question3RadioGroup.findViewById(question3RadioButtonSelectedId) == question3RadioButton3) {
            correctAnswers += 1;
        }

        question4RadioButtonSelectedId = question4RadioGroup.getCheckedRadioButtonId();
        if (question4RadioGroup.findViewById(question4RadioButtonSelectedId) == question4RadioButton4) {
            correctAnswers += 1;
        }

        // Check Question 5 if it's correct.
        if (question5CheckBox1Checked == true && question5CheckBox2Checked == false
                && question5CheckBox3Checked == true && question5CheckBox4Checked == true){
            correctAnswers += 1;
        }

        question6RadioButtonSelectedId = question6RadioGroup.getCheckedRadioButtonId();
        if (question6RadioGroup.findViewById(question6RadioButtonSelectedId) == question6RadioButton1) {
            correctAnswers += 1;
        }

        // Check Question 7 if it's correct.
        question7RadioButtonSelectedId = question7RadioGroup.getCheckedRadioButtonId();
        if (question7RadioGroup.findViewById(question7RadioButtonSelectedId) == question7RadioButton4) {
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

        return(correctAnswers + "/10");
    }
}
