package com.first.project;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button addBtn=findViewById(R.id.addbtn);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {


                final EditText firstNumEditText=findViewById(R.id.firstNumber);
                final EditText secondNumEditText=findViewById(R.id.secondNumber);
                final TextView resultTextView=findViewById(R.id.resulttext);
                int num1=Integer.parseInt(firstNumEditText.getText().toString());
                int num2=Integer.parseInt(secondNumEditText.getText().toString());
                int result=num1+num2;
                resultTextView.setText(result+"");
            }
        });



    }
}
