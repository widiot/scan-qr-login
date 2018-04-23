package com.example.scanqr;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
    private String username;
    private String password;
    private EditText ed_user;
    private EditText ed_pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //username and password
        ed_user = (EditText) findViewById(R.id.ed_user);
        ed_pwd = (EditText) findViewById(R.id.ed_pwd);

        //login button
        Button btnlogin = (Button) findViewById(R.id.btnlogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username = ed_user.getText().toString();
                password = ed_pwd.getText().toString();

                if (username.equals("")) {
                    Toast.makeText(MainActivity.this, "用户名啊大哥^_^", Toast.LENGTH_SHORT).show();
                } else if (password.equals("")) {
                    Toast.makeText(MainActivity.this, "密码都没有-_-", Toast.LENGTH_SHORT).show();
                } else if (username.equals("widiot") && password.equals("123456")) {
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}