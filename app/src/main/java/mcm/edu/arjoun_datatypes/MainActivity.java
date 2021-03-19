    package mcm.edu.arjoun_datatypes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

    public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView display;

        display = findViewById(R.id.displayTxt);

        String firstName = "Nizar";
        char middleInitial = 'D';
        String lastName =  "Arjoun";
        int myAge = 18;
        float myDreamTVLGrade = 95.0f;
        double myMoney = 99999.9f;

        //double into string
        //Double.parseDouble => converts datatypes to double
        //Integer.parseInt => converts dataTypes to int
        //String.valueOf => converts dataTypes to String


        //String.valueOf(myMoney);
        display.setText("My name is "+firstName+" "+String.valueOf(middleInitial)+" "+lastName+
                " \nand my age is " +myAge+ ". \nI want my grade in TVL3 to be"+String.valueOf(myDreamTVLGrade));


        boolean amIMarried = false;

    }
}