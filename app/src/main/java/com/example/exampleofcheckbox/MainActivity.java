package com.example.exampleofcheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView text_reportTxt;
    Button btn_submit;

    ArrayList favourite_color  =new ArrayList();

    CheckBox ch_red,ch_blue,ch_green,ch_yellow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_reportTxt =findViewById(R.id.text_reportTxt);
        ch_red =findViewById(R.id.ch_red);
        ch_blue =findViewById(R.id.ch_blue);
        ch_yellow =findViewById(R.id.ch_yellow);
        ch_green =findViewById(R.id.ch_green);

        btn_submit = findViewById(R.id.btn_submitted);
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                favourite_color.clear();

                if (ch_red.isChecked() == true) {
                    favourite_color.add(getResources().getString(R.string.red));
                }
                if (ch_blue.isChecked() == true)
                {
                    favourite_color.add(getResources().getString(R.string.blue));
                }
                if (ch_green.isChecked() == true)
                {
                    favourite_color.add(getResources().getString(R.string.green));
                }
                if (ch_yellow.isChecked() == true)
                {
                    favourite_color.add(getResources().getString(R.string.orange));
                }
                if (favourite_color.isEmpty())
                {
                    text_reportTxt.setText("No One is selected");
                    Toast.makeText(MainActivity.this, "Please select one of them", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    String show_color = "";
                    for (int i = 0; i <favourite_color.size(); i++ )
                    {
                        show_color = show_color + "  " + favourite_color.get(i);
                    }
                    text_reportTxt.setText(show_color);
                    Toast.makeText(MainActivity.this, show_color, Toast.LENGTH_SHORT).show();
                }

             }
        });
        
    }
}
