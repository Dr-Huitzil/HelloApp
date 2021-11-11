package com.ivan.helloworld1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = ((TextView) findViewById(R.id.text));

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                textView.setTextColor(getResources().getColor(R.color.Green));
            }
        });

        findViewById(R.id.ChangeBackgroundButton).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                findViewById(R.id.Parent1).setBackgroundColor(getResources().getColor(R.color.cute_blue));
            }
        });

        findViewById(R.id.ChangeTextButton).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                textView.setText("Android is Awesome!");
            }
        });

        findViewById(R.id.Parent1).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                textView.setText("Hello from Ivan!");
                findViewById((R.id.Parent1)).setBackgroundColor(getResources().getColor(R.color.pink));
                textView.setTextColor(getResources().getColor(R.color.black));
            }
        });

        findViewById(R.id.ChangeCustomTextButton).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String userEnter = ((EditText) findViewById(R.id.editText)).getText().toString();

                if(userEnter.isEmpty())
                {
                    textView.setText("Enter your own text!");
                }
                else
                {
                    textView.setText(userEnter);
                }

            }
        });
    }
}
