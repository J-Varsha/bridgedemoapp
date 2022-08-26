package com.bridgedemoapp;

import android.content.Context;
import android.graphics.Color;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;

public class CustomCardView extends FrameLayout {

    private TextView textView;

    public CustomCardView(@NonNull Context context) {
        super(context);
        this.setPadding(50,20,50,20);
        this.setBackgroundColor(Color.parseColor("#D3D3D3"));


        this.textView = new TextView(context);
        this.addView(this.textView);
    }

    public void setText(String text) {
        this.textView.setText(text);
    }

    // public void setText(String userId, String name, String location) {
    //     this.textView.setText("Id: "+userId+"\n"+"Name: "+name+"\n"+"Location: "+location);
    // }
}