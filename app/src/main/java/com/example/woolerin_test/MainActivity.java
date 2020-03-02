package com.example.woolerin_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void clickFunc(View view){
        EditText in = (EditText) findViewById(R.id.input);
        EditText out = (EditText) findViewById(R.id.output);

        Log.i("info","clicked!");
        out.setText(in.getText().toString());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView marque = (TextView) this.findViewById(R.id.sliding_text_marquee);
        marque.setSelected(true);


    }
}
