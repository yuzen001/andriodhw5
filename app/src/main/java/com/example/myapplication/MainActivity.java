package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
//import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    EditText year;             
    EditText month;
    EditText day;
    EditText hour;
    EditText minute;
    EditText second;
    TextView output;
    TextView output2;
    TextView output3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        year = (EditText) findViewById(R.id.year_in);
        month = (EditText) findViewById(R.id.month_in);
        day = (EditText) findViewById(R.id.day_in);
        hour = (EditText) findViewById(R.id.hour_in);
        minute = (EditText) findViewById(R.id.minute_in);
        second = (EditText) findViewById(R.id.second_in);
        output = (TextView) findViewById(R.id.displayoutput);
        output2 = (TextView) findViewById(R.id.displayoutput2);
        output3 = (TextView) findViewById(R.id.displayoutput3);

        Button submit = (Button) findViewById(R.id.output);
        submit.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View arg0) {

                float h3 = Float.parseFloat(year.getEditableText().toString());

                //tv.setText((h1) +" / "+(w1)+" / "+(a1));
                output.setText(year.getText() + " / "+month.getText() + " / "+day.getText());
                // tv1.setText((h3) +" : "+(w3)+" : "+(a3));
                output2.setText(hour.getText() + " : "+minute.getText() + " : "+second.getText());
                float year=h3;
                if(year>0){
                    if((year%4==0)&&(year%100!=0)||(year%400==0)){
                        output3.setText("是閏年");
                    }else{
                        output3.setText("非閏年");
                    }
                }
            }




        });
    }

}
