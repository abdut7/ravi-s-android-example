package com.example.loginpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
EditText t1,t2;
Button b1;
TextView v1,v2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         t1=(EditText) findViewById(R.id.edusername);
         t2=(EditText)findViewById(R.id.edpass);
         b1=(Button)findViewById(R.id.buttonlogin);
         v1=(TextView)findViewById(R.id.textView3);
         v2=(TextView)findViewById(R.id.textView5);

    }
    public void login(View view){
        String pass=t2.getText().toString();
        if (pass=="123"){
            Toast.makeText(this, "you are successfully login", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "password error", Toast.LENGTH_SHORT).show();
        }

    }public void error(View view){
        Intent x=new Intent(this,Main2Activity.class);
        startActivity(x);

    }
}
