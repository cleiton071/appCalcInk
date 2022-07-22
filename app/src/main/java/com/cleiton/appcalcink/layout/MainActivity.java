package com.cleiton.appcalcink.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.cleiton.appcalcink.R;
import com.cleiton.appcalcink.data.Data;
import com.cleiton.appcalcink.model.Wall;
import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ViewHolder mViewHolder = new ViewHolder();
    private Data mdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mdata = new Data(this);
        this.mdata.setNumWalls("0");

        this.mViewHolder.layout_empty = findViewById(R.id.layout_empty);

        this.mViewHolder.layout_room = findViewById(R.id.layout_room);
        this.mViewHolder.button_add = findViewById(R.id.button_add);
        this.mViewHolder.button_calc = findViewById(R.id.button_calc);

        this.mViewHolder.layout_wall1 = findViewById(R.id.layout_wall1);
        this.mViewHolder.image_info1 = findViewById(R.id.image_info1);
        this.mViewHolder.layout_info1 = findViewById(R.id.layout_info1);
        this.mViewHolder.text_qtd_portas1 = findViewById(R.id.text_qtd_portas1);
        this.mViewHolder.text_qtd_janelas1 = findViewById(R.id.text_qtd_janelas1);
        this.mViewHolder.text_info_altura1 = findViewById(R.id.text_info_altura1);
        this.mViewHolder.text_info_largura1 = findViewById(R.id.text_info_largura1);

        this.mViewHolder.layout_wall2 = findViewById(R.id.layout_wall2);
        this.mViewHolder.image_info2 = findViewById(R.id.image_info2);
        this.mViewHolder.layout_info2 = findViewById(R.id.layout_info2);
        this.mViewHolder.text_qtd_portas2 = findViewById(R.id.text_qtd_portas2);
        this.mViewHolder.text_qtd_janelas2 = findViewById(R.id.text_qtd_janelas2);
        this.mViewHolder.text_info_altura2 = findViewById(R.id.text_info_altura2);
        this.mViewHolder.text_info_largura2 = findViewById(R.id.text_info_largura2);

        this.mViewHolder.layout_wall3 = findViewById(R.id.layout_wall3);
        this.mViewHolder.image_info3 = findViewById(R.id.image_info3);
        this.mViewHolder.layout_info3 = findViewById(R.id.layout_info3);
        this.mViewHolder.text_qtd_portas3 = findViewById(R.id.text_qtd_portas3);
        this.mViewHolder.text_qtd_janelas3 = findViewById(R.id.text_qtd_janelas3);
        this.mViewHolder.text_info_altura3 = findViewById(R.id.text_info_altura3);
        this.mViewHolder.text_info_largura3 = findViewById(R.id.text_info_largura3);

        this.mViewHolder.layout_wall4 = findViewById(R.id.layout_wall4);
        this.mViewHolder.image_info4 = findViewById(R.id.image_info4);
        this.mViewHolder.layout_info4 = findViewById(R.id.layout_info4);
        this.mViewHolder.text_qtd_portas4 = findViewById(R.id.text_qtd_portas4);
        this.mViewHolder.text_qtd_janelas4 = findViewById(R.id.text_qtd_janelas4);
        this.mViewHolder.text_info_altura4 = findViewById(R.id.text_info_altura4);
        this.mViewHolder.text_info_largura4 = findViewById(R.id.text_info_largura4);

        this.mViewHolder.layout_modal = findViewById(R.id.layout_modal);
        this.mViewHolder.button_close_modal = findViewById(R.id.button_close_modal);
        this.mViewHolder.text_modal1 = findViewById(R.id.text_modal1);
        this.mViewHolder.text_modalResult = findViewById(R.id.text_modalResult);

        this.mViewHolder.button_add.setOnClickListener(this);
        this.mViewHolder.image_info1.setOnClickListener(this);
        this.mViewHolder.image_info2.setOnClickListener(this);
        this.mViewHolder.image_info3.setOnClickListener(this);
        this.mViewHolder.image_info4.setOnClickListener(this);
        this.mViewHolder.button_calc.setOnClickListener(this);
        this.mViewHolder.button_close_modal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.button_add) {
            Intent add = new Intent(this, FormWall.class);
            startActivityForResult(add, 37);

        } else if (v.getId() == R.id.image_info1) {
            if (this.mViewHolder.layout_info1.getVisibility() == View.VISIBLE) {
                this.mViewHolder.layout_info1.setVisibility(View.GONE);
            } else {
                this.mViewHolder.layout_info1.setVisibility(View.VISIBLE);
                this.mViewHolder.layout_info2.setVisibility(View.GONE);
                this.mViewHolder.layout_info3.setVisibility(View.GONE);
                this.mViewHolder.layout_info4.setVisibility(View.GONE);
            }

        } else if (v.getId() == R.id.image_info2) {
            if (this.mViewHolder.layout_info2.getVisibility() == View.VISIBLE) {
                this.mViewHolder.layout_info2.setVisibility(View.GONE);
            } else {
                this.mViewHolder.layout_info1.setVisibility(View.GONE);
                this.mViewHolder.layout_info2.setVisibility(View.VISIBLE);
                this.mViewHolder.layout_info3.setVisibility(View.GONE);
                this.mViewHolder.layout_info4.setVisibility(View.GONE);
            }

        } else if (v.getId() == R.id.image_info3) {
            if (this.mViewHolder.layout_info3.getVisibility() == View.VISIBLE) {
                this.mViewHolder.layout_info3.setVisibility(View.GONE);
            } else {
                this.mViewHolder.layout_info1.setVisibility(View.GONE);
                this.mViewHolder.layout_info2.setVisibility(View.GONE);
                this.mViewHolder.layout_info3.setVisibility(View.VISIBLE);
                this.mViewHolder.layout_info4.setVisibility(View.GONE);
            }

        } else if (v.getId() == R.id.image_info4) {
            if (this.mViewHolder.layout_info4.getVisibility() == View.VISIBLE) {
                this.mViewHolder.layout_info4.setVisibility(View.GONE);
            } else {
                this.mViewHolder.layout_info1.setVisibility(View.GONE);
                this.mViewHolder.layout_info2.setVisibility(View.GONE);
                this.mViewHolder.layout_info3.setVisibility(View.GONE);
                this.mViewHolder.layout_info4.setVisibility(View.VISIBLE);
            }

        } else if (v.getId() == R.id.button_calc) {
            Gson gson = new Gson();

            String primeira = this.mdata.getStoreString("Wall_0");
            Wall p1 = gson.fromJson(primeira, Wall.class);

            String segunda = this.mdata.getStoreString("Wall_1");
            Wall p2 = gson.fromJson(segunda, Wall.class);

            String terceira = this.mdata.getStoreString("Wall_2");
            Wall p3 = gson.fromJson(terceira, Wall.class);

            String quarta = this.mdata.getStoreString("Wall_3");
            Wall p4 = gson.fromJson(quarta, Wall.class);

            Consumo_tinta(p1, p2, p3, p4);

        } else {
            this.mViewHolder.layout_modal.setVisibility(View.GONE);
            this.mdata.setNumWalls("0");
            Replay();
        }
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 37) {
            if (resultCode == Activity.RESULT_OK) {
                Toast.makeText(this, "Dados salvos!", Toast.LENGTH_LONG).show();

                Gson gson = new Gson();

                this.mViewHolder.layout_empty.setVisibility(View.GONE);
                this.mViewHolder.layout_room.setVisibility(View.VISIBLE);

                if (this.mdata.getNumWalls().equals("0")) {
                    String info_1 = this.mdata.getStoreString("Wall_0");
                    Wall parede_1 = gson.fromJson(info_1, Wall.class);

                    this.mViewHolder.text_info_altura1.setText(String.format("%.2f", parede_1.getAltura()));
                    this.mViewHolder.text_info_largura1.setText(String.format("%.2f", parede_1.getLargura()));
                    this.mViewHolder.text_qtd_portas1.setText(String.valueOf(parede_1.getNporta()));
                    this.mViewHolder.text_qtd_janelas1.setText(String.valueOf(parede_1.getNjanela()));

                    this.mViewHolder.layout_wall1.setVisibility(View.VISIBLE);
                    this.mdata.setNumWalls("1");

                } else if (mdata.getNumWalls().equals("1")) {
                    String info_2 = this.mdata.getStoreString("Wall_1");
                    Wall parede_2 = gson.fromJson(info_2, Wall.class);

                    this.mViewHolder.text_info_altura2.setText(String.format("%.2f", parede_2.getAltura()));
                    this.mViewHolder.text_info_largura2.setText(String.format("%.2f", parede_2.getLargura()));
                    this.mViewHolder.text_qtd_portas2.setText(String.valueOf(parede_2.getNporta()));
                    this.mViewHolder.text_qtd_janelas2.setText(String.valueOf(parede_2.getNjanela()));

                    this.mViewHolder.layout_wall2.setVisibility(View.VISIBLE);
                    this.mdata.setNumWalls("2");

                } else if (mdata.getNumWalls().equals("2")) {
                    String info_3 = this.mdata.getStoreString("Wall_2");
                    Wall parede_3 = gson.fromJson(info_3, Wall.class);

                    this.mViewHolder.text_info_altura3.setText(String.format("%.2f", parede_3.getAltura()));
                    this.mViewHolder.text_info_largura3.setText(String.format("%.2f", parede_3.getLargura()));
                    this.mViewHolder.text_qtd_portas3.setText(String.valueOf(parede_3.getNporta()));
                    this.mViewHolder.text_qtd_janelas3.setText(String.valueOf(parede_3.getNjanela()));

                    this.mViewHolder.layout_wall3.setVisibility(View.VISIBLE);
                    this.mdata.setNumWalls("3");

                } else if (mdata.getNumWalls().equals("3")) {
                    String info_4 = this.mdata.getStoreString("Wall_3");
                    Wall parede_4 = gson.fromJson(info_4, Wall.class);

                    this.mViewHolder.text_info_altura4.setText(String.format("%.2f", parede_4.getAltura()));
                    this.mViewHolder.text_info_largura4.setText(String.format("%.2f", parede_4.getLargura()));
                    this.mViewHolder.text_qtd_portas4.setText(String.valueOf(parede_4.getNporta()));
                    this.mViewHolder.text_qtd_janelas4.setText(String.valueOf(parede_4.getNjanela()));

                    this.mViewHolder.layout_wall4.setVisibility(View.VISIBLE);
                    this.mdata.setNumWalls("4");

                    Toast.makeText(this, "Limite de paredes atingidos!", Toast.LENGTH_LONG).show();
                    this.mViewHolder.button_add.setVisibility(View.GONE);
                    this.mViewHolder.button_calc.setVisibility(View.VISIBLE);
                }

            } else if (resultCode == Activity.RESULT_CANCELED) {
                Toast.makeText(this, "página anterior", Toast.LENGTH_LONG).show();
            }
        }
    }

    public void Consumo_tinta(Wall wall_1, Wall wall_2, Wall wall_3, Wall wall_4) {
        Double areaTotal = (wall_1.getAltura() * wall_1.getLargura());
        areaTotal += (wall_2.getAltura() * wall_2.getLargura());
        areaTotal += (wall_3.getAltura() * wall_3.getLargura());
        areaTotal += (wall_4.getAltura() * wall_4.getLargura());

        areaTotal -= ((wall_1.getNporta() * 1.52) + (wall_1.getNjanela() * 2.4));
        areaTotal -= ((wall_2.getNporta() * 1.52) + (wall_2.getNjanela() * 2.4));
        areaTotal -= ((wall_3.getNporta() * 1.52) + (wall_3.getNjanela() * 2.4));
        areaTotal -= ((wall_4.getNporta() * 1.52) + (wall_4.getNjanela() * 2.4));

        Double qtdTintaNec = areaTotal / 5.00;
        Double[] latasTinta = {18.00, 3.60, 2.50, 0.50};
        Integer[] latanec = {0, 0, 0, 0};
        Double qtdAtual = qtdTintaNec;
        Integer i = 0;

        while (i <= 3) {
            if (qtdAtual >= latasTinta[i]) {
                qtdAtual = qtdAtual - latasTinta[i];
                latanec[i]++;
            } else i++;
        }
        while (qtdAtual >= 0.01) {
            qtdAtual = qtdAtual - latasTinta[3];
            latanec[3]++;
        }
        Integer l18 = latanec[0];
        Integer l36 = latanec[1];
        Integer l25 = latanec[2];
        Integer l05 = latanec[3];

        this.mViewHolder.text_modalResult.setText(String.format("%d lata(s) de 18L +  %d lata(s) de 3,6L +  %d lata(s) de 2,5L +  %d lata(s) de 0,5L", l18, l36, l25 ,l05));

        this.mViewHolder.layout_modal.setVisibility(View.VISIBLE);
    }

    public void Replay () {
        if (this.mdata.getNumWalls() == "0"){
            this.mViewHolder.layout_room.setVisibility(View.GONE);
            this.mViewHolder.button_calc.setVisibility(View.GONE);

            this.mViewHolder.layout_wall1.setVisibility(View.GONE);
            this.mViewHolder.layout_wall2.setVisibility(View.GONE);
            this.mViewHolder.layout_wall3.setVisibility(View.GONE);
            this.mViewHolder.layout_wall4.setVisibility(View.GONE);

            this.mViewHolder.layout_empty.setVisibility(View.VISIBLE);
            this.mViewHolder.button_add.setVisibility(View.VISIBLE);

        }


    }

    private static class ViewHolder {
        RelativeLayout layout_empty;
        RelativeLayout layout_room;

        Button button_add;
        Button button_calc;
        Button button_close_modal;

        RelativeLayout layout_wall1;
        ImageView image_info1;
        RelativeLayout layout_info1;
        TextView text_qtd_portas1;
        TextView text_qtd_janelas1;
        TextView text_info_altura1;
        TextView text_info_largura1;

        RelativeLayout layout_wall2;
        ImageView image_info2;
        RelativeLayout layout_info2;
        TextView text_qtd_portas2;
        TextView text_qtd_janelas2;
        TextView text_info_altura2;
        TextView text_info_largura2;

        RelativeLayout layout_wall3;
        ImageView image_info3;
        RelativeLayout layout_info3;
        TextView text_qtd_portas3;
        TextView text_qtd_janelas3;
        TextView text_info_altura3;
        TextView text_info_largura3;

        RelativeLayout layout_wall4;
        ImageView image_info4;
        RelativeLayout layout_info4;
        TextView text_qtd_portas4;
        TextView text_qtd_janelas4;
        TextView text_info_altura4;
        TextView text_info_largura4;

        RelativeLayout layout_modal;
        TextView text_modal1;
        TextView text_modalResult;

    }
}