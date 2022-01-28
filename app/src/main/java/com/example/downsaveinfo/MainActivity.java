package com.example.downsaveinfo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // 1- variável EditText no Java para captura do conteúdo inserido pelo usuário (associada ao componente EditText "editTextXML" no Layout)
    private EditText mensagemInserida;

    // 2- String contendo a mensagem a ser enviada.
    private String mensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 3- Associando o variável mensagemInserida do Java com o componente EditText do arquivoXML
        mensagemInserida = findViewById(R.id.editTextXML);



    }
    // 4- criando o método para envido da mensagem para a próxima tela
    public void disparoNovaTela(View v) {

        //4.1 atribuição do valor digitado pelo usuário no campo do EditTexXML para a variável mensagem

        mensagem = mensagemInserida.getText().toString();

        //4.2 Criação da Intent para chamada da segunda tela com envio da mensagem.
        Intent myIntent = new Intent(this, Tela2.class);

        //4.3 Uso do método putExtra para envio da mensagem.
        myIntent.putExtra("mensagemEnviada", mensagem);

        //4.4 Envio da solicitação
        startActivity(myIntent);

    }
}