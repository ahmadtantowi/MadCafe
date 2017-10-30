package com.ahmadtantowi.madcafe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username, password;
    String uname, pword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view) {

        username = (EditText)findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        uname = username.getText().toString();
        pword = password.getText().toString();

        //Kondisi jika username dan password benar maka akan menampilkan pesan text toast
        //Login sukses dan masuk ke activity 2
        if ((uname.contains("ahmadtantowi"))&&((pword.contains("informatika")))) {
            Toast.makeText(this, "Login Sukses", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        }

        else if ((uname.matches("")||pword.matches("")))
        {
            Toast.makeText(this, "Isikan Username dan Password", Toast.LENGTH_SHORT).show();
        }

        else {
            Toast.makeText(this, "Login Gagal /Username Password Salah", Toast.LENGTH_SHORT).show();
        }
    }
}
