package com.example.tacademy.helloandroid;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
        Button btn_google=(Button)findViewById(R.id.btn_to_google);
        btn_google.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent myintent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(myintent);
            }
        });
        Button btn_dial=(Button)findViewById(R.id.btn_dial);
        btn_dial.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent myintent=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:010-5050-9775"));
                startActivity(myintent);
            }
        });
        Button btn_toast=(Button)findViewById(R.id.btn_toast);
        btn_toast.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "toast", Toast.LENGTH_SHORT).show();
            }
        });
        Button btn_other=(Button)findViewById(R.id.btn_other);
        btn_other.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent myintent=new Intent(MainActivity.this,ohterActivity.class);
                startActivity(myintent);
            }
        });


    }
}
