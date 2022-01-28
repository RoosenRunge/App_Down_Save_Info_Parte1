package com.example.downsaveinfo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class Tela2 extends AppCompatActivity {

    // 1- String para armazenar o conteúdo da mensagem recebida da primeira tela
    String mensagemRecebida;

    // 2- variável TextView no código Java associada ao TextView "mensagemRecebidaXML" no Layout)
    TextView exibeMensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        // 3- Associando a variável mensagemInserida do Java com o TextView "mensagemRecebidaXML" do arquivoXML
        exibeMensagem = findViewById(R.id.mensagemRecebidaXML);

        // 4- Utilizando o método getExtras() para recuperar a mensagem enviada.
        Intent intent = getIntent();
        Bundle bd = intent.getExtras();
        String mensagemRecebida =(String) bd.get("mensagemEnviada");

        // 5- Exibindo a mensagem na Tela
        exibeMensagem.setText(mensagemRecebida);

    }
}