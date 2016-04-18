package com.example.tacademy.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText inputView;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputView=(EditText)findViewById(R.id.editText_send);
        textView=(TextView)findViewById(R.id.text_string);
        btn=(Button)findViewById(R.id.btn_send);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text=inputView.getText().toString();
                textView.setText(text);
            }
        });
    }
}
