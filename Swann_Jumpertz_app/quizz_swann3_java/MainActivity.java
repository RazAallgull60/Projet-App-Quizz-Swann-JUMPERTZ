package com.example.quizz_swann3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText ePseudo;
    private EditText ePassword;
    private Button eLogin;
    private TextView eAttemptsInfo;

    private String Username = "swannj";
    private String Password = "erp";

    boolean isValid = false;
    private int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ePseudo = findViewById(R.id.etPseudo);
        ePassword = findViewById(R.id.etPassword);
        eLogin = findViewById(R.id.btnLogin);

        eLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inputName = ePseudo.getText().toString();
                String inputPassword =ePassword.getText().toString();

                if (inputName.isEmpty() || inputPassword.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Veuillez recommencer !", Toast.LENGTH_SHORT).show();
                }else{

                    isValid = validate(inputName, inputPassword);

                    if(!isValid){

                        counter--;

                        Toast.makeText(MainActivity.this, "Informations saisies incorrectes  !", Toast.LENGTH_SHORT).show();

                        if (counter == 0){
                            eLogin.setEnabled(false);
                        }
                    }else{

                        Toast.makeText(MainActivity.this, "Authentification OK !", Toast.LENGTH_SHORT).show();

                        Intent intent = new Intent(MainActivity.this, Question1.class);
                        startActivity(intent);
                    }
                }
            }
        });
    }

    private boolean validate(String pseudo, String password){
        if(pseudo.equals(Username) && password.equals(Password)){
            return true;
        }

        return false;
    }
}