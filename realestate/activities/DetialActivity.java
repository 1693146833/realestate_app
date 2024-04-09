package com.example.realestate.activities;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.realestate.Domain.ItemsDmain;
import com.example.realestate.R;

import java.text.DecimalFormat;

public class DetialActivity extends AppCompatActivity{
    private TextView titleText, addressText, bedText, bathText ,wifiText ,descriptionText, priceText;
    private ItemsDmain itemsDmain;
    private ImageView pic;

    DecimalFormat formatter = new DecimalFormat("###,###,###.##");
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detial);

        initView();
        setVariable();
    }
    @SuppressLint("SetTextI18n")
    private void setVariable(){
        itemsDmain = (ItemsDmain) getIntent().getSerializableExtra("object");
        assert itemsDmain != null;
        titleText.setText(itemsDmain.getTitle());
        addressText.setText(itemsDmain.getAddress());
        bedText.setText(itemsDmain.getBed()+" 卧室");
        bathText.setText(itemsDmain.getBath()+ " 洗手间");
        descriptionText.setText(itemsDmain.getDescription());
        priceText.setText("$"+formatter.format(itemsDmain.getPrice()));
        if(itemsDmain.isWifi()){
            wifiText.setText("Wifi");
        }else{
            wifiText.setText("无-Wifi");
        }

        int drawableResourceId = getResources().getIdentifier(itemsDmain.getPic(), "drawable", getPackageName());
        Glide.with(this).load(drawableResourceId).into(pic);

    }

    private void initView(){
        titleText = findViewById(R.id.titleText);
        addressText = findViewById(R.id.addressText);
        bedText = findViewById(R.id.bedText);
        bathText = findViewById(R.id.bathText);
        descriptionText = findViewById(R.id.descriptionText);
        wifiText = findViewById(R.id.wifiText);
        priceText = findViewById(R.id.priceText);
        pic = findViewById(R.id.pic);

    }
}
