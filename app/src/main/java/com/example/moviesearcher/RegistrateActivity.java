package com.example.moviesearcher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.moviesearcher.ui.login.User;

import java.util.ArrayList;
import java.util.List;

public class RegistrateActivity extends AppCompatActivity {
    List<User> userList = new ArrayList<>();
    User temp;
    EditText loginEmail;
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrate);
        loginEmail = findViewById(R.id.loginEmail);
        password = findViewById(R.id.password);
    }

    public void registration(View view) {
        temp = new User(loginEmail.getText().toString(),password.getText().toString());
        userList.add(temp);
    }

    public void show(View view) {
        Toast.makeText(this, userList.toString(), Toast.LENGTH_SHORT).show();
    }
}