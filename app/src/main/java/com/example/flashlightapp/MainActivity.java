package com.example.flashlightapp;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    TextView helperText;
    LinearLayout flashLightBackground, colorPanel;
    Button w, b, r, y, g;
    boolean toggle = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeComponents();
        handleColorSwitch();
        flashLightBackground.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setToggle();
            }
        });
    }

    public void setToggle() {
        if (toggle) {
            hideView(helperText);
            colorPanel.setVisibility(View.GONE);
        } else {
            colorPanel.setVisibility(View.VISIBLE);
        }
        toggle = !toggle;
    }

    public void initializeComponents() {
        helperText = findViewById(R.id.helperText);
        flashLightBackground = findViewById(R.id.flashLightBackground);
        colorPanel = findViewById(R.id.colorPanel);
        w = findViewById(R.id.w);
        b = findViewById(R.id.b);
        r = findViewById(R.id.r);
        y = findViewById(R.id.y);
        g = findViewById(R.id.g);
    }

    public void hideView(View v) {
        v.setVisibility(View.GONE);
    }

    public void handleColorSwitch() {
        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hideView(w);
                flashLightBackground.setBackgroundColor(Color.WHITE);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hideView(b);
                flashLightBackground.setBackgroundColor(Color.BLUE);
            }
        });
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hideView(r);
                flashLightBackground.setBackgroundColor(Color.RED);
            }
        });
        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hideView(y);
                flashLightBackground.setBackgroundColor(Color.YELLOW);
            }
        });
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hideView(g);
                flashLightBackground.setBackgroundColor(Color.GREEN);
            }
        });
    }

}
