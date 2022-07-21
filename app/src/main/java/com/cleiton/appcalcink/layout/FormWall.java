package com.cleiton.appcalcink.layout;


import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.cleiton.appcalcink.R;
import com.cleiton.appcalcink.data.Data;
import com.cleiton.appcalcink.model.Wall;

public class FormWall extends AppCompatActivity implements View.OnClickListener {

    ViewHolder mViewholder = new ViewHolder();
    private Data mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_wall);

        this.mData = new Data(this);

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
            Intent voltar = new Intent();
            this.setResult(Activity.RESULT_CANCELED, voltar);
            this.finish();


        } else if (v.getId() == R.id.button_save) {

            String altura = this.mViewholder.edit_altura.getText().toString();
            String largura = this.mViewholder.edit_largura.getText().toString();
            String porta = this.mViewholder.edit_porta.getText().toString();
            String janela = this.mViewholder.edit_janela.getText().toString();

            Double vAlt = Double.valueOf(altura);
            Double vLarg = Double.valueOf(largura);
            Integer vPor = Integer.valueOf(porta);
            Integer vJan = Integer.valueOf(janela);

            if ("".equals(altura) || "".equals(largura) || "".equals(porta) || "".equals(janela)) {
                Toast.makeText(this, "preencha os campos!", Toast.LENGTH_LONG).show();

            } else if (Area_parede(vAlt, vLarg) == true) {
                Wall parede = new Wall(vAlt, vLarg, vPor, vJan);
                if (Proporcao_area(parede) == true) {

                } else {
                    Toast.makeText(this, "esta parede não tem espaço para porta / janela!", Toast.LENGTH_LONG).show();
                } if (Altura_permitida(parede) == true) {
                    Intent resultIntent = new Intent();
                    Gson gson = new Gson();
                    String gsonAux = gson.toJson(parede);

                    this.mData.storeString("Wall_" + this.mData.getNumWalls(), gsonAux);
                    this.setResult(Activity.RESULT_OK, resultIntent);
                    this.finish();
                } else {
                    Toast.makeText(this, "esta parede n tem altura para a porta!", Toast.LENGTH_LONG).show();
                }
            }
            else {
                Toast.makeText(this, "a parede não pode ter mais que 15 ou menos que 1 m2!", Toast.LENGTH_LONG).show();

            }
        }
    }

    public boolean Proporcao_area(Wall wall) {
        Double areaParede = wall.getAltura() * wall.getLargura();
        Double areaPorta = 1.52 * wall.getNporta();
        Double areaJanela = 2.40 * wall.getNjanela();

        if ((areaJanela + areaPorta) > (areaParede / 2)) {
            return false;

        } else return true;
    }

    public boolean Area_parede(Double altura, Double largura) {
        Double area = altura * largura;

        if (area >= 1 && area <= 15) {
            return true;

        } else return false;
    }

    public boolean Altura_permitida(Wall wall) {
        if ((wall.getNporta() >= 0 && (wall.getAltura() - 0.30) >= 1.9) || wall.getNporta() == 0) {
            return true;

        } else return false;
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
