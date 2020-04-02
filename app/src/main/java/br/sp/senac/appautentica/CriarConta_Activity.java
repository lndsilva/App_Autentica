package br.sp.senac.appautentica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CriarConta_Activity extends AppCompatActivity {

    Button btnCadatra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.criar_conta_layout);

        btnCadatra = findViewById(R.id.btnCrSignUp);

        btnCadatra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Em construção!!!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        //criar a estrutura para verificação dos campos

        //criar a comparação e recebimento dos valores sem banco de dados.

    }
}