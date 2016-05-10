package com.tekin.loginp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

import inducesmile.com.androidloginandregistration.R;
public class LoginActivity extends ActionBarActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Intent intent = getIntent();
        Bundle intentBundle = intent.getExtras();
        String loggedUser = intentBundle.getString("USERNAME");
        loggedUser = capitalizeFirstCharacter(loggedUser);
        String message = intentBundle.getString("MESSAGE");
        TextView loginUsername = (TextView)findViewById(R.id.login_user);
        TextView successMessage = (TextView)findViewById(R.id.message);
        loginUsername.setText(loggedUser);
        successMessage.setText(message);
    }
    private String capitalizeFirstCharacter(String textInput){
        String input = textInput.toLowerCase();
        String output = input.substring(0, 1).toUpperCase() + input.substring(1);
        return output;    }

}