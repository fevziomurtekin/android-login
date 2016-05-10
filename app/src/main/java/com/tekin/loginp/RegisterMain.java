package com.tekin.loginp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import inducesmile.com.androidloginandregistration.R;

/**
 * Created by Ömür on 23.03.2016.
 */
public class RegisterMain extends Activity {
    protected EditText username;
    private EditText password;
    private EditText email;
    Button signUpButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        username = (EditText)findViewById(R.id.username_field);
        password = (EditText)findViewById(R.id.password_field);
        email = (EditText)findViewById(R.id.email_field);
         signUpButton = (Button)findViewById(R.id.sign_up);
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enteredUsername = username.getText().toString();
                String enteredPassword = password.getText().toString();
                 String enteredEmail = email.getText().toString();
                String parameters="&username="+enteredUsername+"&password="+enteredPassword+"&email="+enteredEmail;
                if (enteredUsername.equals("") || enteredPassword.equals("") || enteredEmail.equals("")) {
                    Toast.makeText(RegisterMain.this, "Username or password or email must be filled", Toast.LENGTH_LONG).show();
                    return;
                }
                if (enteredUsername.length() <= 1 || enteredPassword.length() <= 1) {
                    Toast.makeText(RegisterMain.this, "Username or password length must be greater than one", Toast.LENGTH_LONG).show();
                    return;
                }
// request authentication with remote server4
                RegisterActivity deneme=new RegisterActivity(parameters);
                deneme.execute();
                Toast.makeText(RegisterMain.this,"Kayıt Başarılı,Anasayfaya yönlendiriliyorsunuz..",Toast.LENGTH_SHORT).show();
                Intent ıntent=new Intent(RegisterMain.this,MainActivity.class);
                startActivity(ıntent);
            }
        });

    }
}
