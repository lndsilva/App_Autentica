package br.sp.senac.appautentica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Autentica_Activity extends AppCompatActivity {
    //Declaração dos objetos xml para o java
    EditText txtEmailPhone, txtPassword;
    Button btnAutLogIn, btnLoginFacebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.autentica_layout);

        //ligar o xml ao java

        txtEmailPhone = findViewById(R.id.txtEmailPhone);
        txtPassword = findViewById(R.id.txtPassword);
        btnAutLogIn = findViewById(R.id.btnAutLogIn);
        btnLoginFacebook = findViewById(R.id.btnLoginFacebook);

        btnAutLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //criar uma estrutura de decisão para autenticação
                String emailPhone, password;

                emailPhone = txtEmailPhone.getText().toString();
                password = txtPassword.getText().toString();

                if (emailPhone.equals("senac") && password.equals("senac")) {
                    //abrir a janela
                    startActivity(new Intent(getApplicationContext(),
                            MainActivity.class));
                    finish();
                } else {
                    Toast.makeText(getApplicationContext(),
                            "Usuário ou senha inválidos!!!",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnLoginFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Em construção!!!",
                        Toast.LENGTH_SHORT).show();
            }
        });


    }
}