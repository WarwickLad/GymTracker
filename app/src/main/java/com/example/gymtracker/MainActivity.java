package com.example.gymtracker;

import androidx.appcompat.app.AppCompatActivity;
import java.lang.Math;
import java.util.ArrayList;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.gymtracker.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public String rickismGenerate() {
        ArrayList<String> rickyisms = new ArrayList<String>();
        rickyisms.add("Smokes let's go!");
        rickyisms.add("Knock Knock..... Fuck Off");
        rickyisms.add("Braker braker this is rocket ship 27");
        rickyisms.add("Fuckin ATOADASO");
        int randomNumber = (int) Math.round(4*Math.random());
        return rickyisms.get(randomNumber);
    }

    /** Called when the user taps the Send button */
    public void rickyismButton(View view){
        // Do something in response to button
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.rickyism_quote);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, rickismGenerate());
        startActivity(intent);

    }

}
