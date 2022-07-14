package com.cleiton.appcalcink;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FormWall extends AppCompatActivity implements View.OnClickListener {

    ViewHolder mViewholder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_wall);

        this.mViewholder.text_title = findViewById(R.id.text_title);
        this.mViewholder.edit_altura = findViewById(R.id.edit_altura);
        this.mViewholder.edit_largura = findViewById(R.id.edit_largura);
        this.mViewholder.edit_porta = findViewById(R.id.edit_porta);
        this.mViewholder.edit_janela = findViewById(R.id.edit_janela);
        this.mViewholder.button_save = findViewById(R.id.button_save);
        this.mViewholder.button_return = findViewById(R.id.button_return);

        this.mViewholder.button_save.setOnClickListener(this);
        this.mViewholder.button_return.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button_return) {
            Intent voltar = new Intent(this, MainActivity.class);
            startActivity(voltar);
        }

    }

    private static class ViewHolder {

        TextView text_title;
        EditText edit_altura;
        EditText edit_largura;
        EditText edit_porta;
        EditText edit_janela;
        Button button_save;
        Button button_return;

    }
}