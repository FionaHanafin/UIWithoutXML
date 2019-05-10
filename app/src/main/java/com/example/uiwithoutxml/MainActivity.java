package com.example.uiwithoutxml;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button myButton = new Button(this);
        Button myButton2 = new Button(this);
        EditText myEdit= new EditText(this);
        EditText myEdit2= new EditText(this);
        LinearLayout myLayout = new LinearLayout(this);
        LinearLayout inner1 = new LinearLayout(this);
        LinearLayout inner2 = new LinearLayout(this);
        myLayout.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams layout = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);
        myLayout.addView(inner1);
        myLayout.addView(inner2);
        inner1.addView(myEdit);
        inner1.addView(myEdit2);
        inner2.addView(myButton);
        inner2.addView(myButton2);
        myButton.setWidth(300);
        myButton2.setWidth(300);
        myEdit.setWidth(300);
        myEdit2.setWidth(300);
        myButton.setText("Button 1");
        myButton2.setText("Button 2");
        setContentView(myLayout);
    }
}
