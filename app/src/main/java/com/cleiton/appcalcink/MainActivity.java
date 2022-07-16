package com.cleiton.appcalcink;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ViewHolder mViewHolder = new ViewHolder();
    public static int in = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewHolder.room.init();
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


        this.mViewHolder.button_add.setOnClickListener(this);
        this.mViewHolder.image_info1.setOnClickListener(this);
        this.mViewHolder.button_calc.setOnClickListener(this);


        if (in == 1) {
            this.mViewHolder.layout_empty.setVisibility(View.GONE);
            this.mViewHolder.layout_room.setVisibility(View.VISIBLE);
            this.mViewHolder.layout_wall1.setVisibility(View.VISIBLE);

        } else if (in == 2) {
            this.mViewHolder.layout_empty.setVisibility(View.GONE);
            this.mViewHolder.layout_room.setVisibility(View.VISIBLE);
            this.mViewHolder.layout_wall1.setVisibility(View.VISIBLE);
            this.mViewHolder.layout_wall2.setVisibility(View.VISIBLE);

        } else if (in == 3) {
            this.mViewHolder.layout_empty.setVisibility(View.GONE);
            this.mViewHolder.layout_room.setVisibility(View.VISIBLE);
            this.mViewHolder.layout_wall1.setVisibility(View.VISIBLE);
            this.mViewHolder.layout_wall2.setVisibility(View.VISIBLE);
            this.mViewHolder.layout_wall3.setVisibility(View.VISIBLE);

        } else if (in == 4) {
            this.mViewHolder.layout_empty.setVisibility(View.GONE);
            this.mViewHolder.layout_room.setVisibility(View.VISIBLE);
            this.mViewHolder.layout_wall1.setVisibility(View.VISIBLE);
            this.mViewHolder.layout_wall2.setVisibility(View.VISIBLE);
            this.mViewHolder.layout_wall3.setVisibility(View.VISIBLE);
            this.mViewHolder.layout_wall4.setVisibility(View.VISIBLE);
            this.mViewHolder.button_add.setVisibility(View.GONE);
            this.mViewHolder.button_calc.setVisibility(View.VISIBLE);
        }
    }


    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.button_add) {

            Intent add = new Intent(this, FormWall.class);
            startActivity(add);

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

        } else return;
    }

    private static class ViewHolder {
        Room room = new Room();

        RelativeLayout layout_empty;
        RelativeLayout layout_room;

        Button button_add;
        Button button_calc;

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

    }
}