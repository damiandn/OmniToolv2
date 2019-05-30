package com.damiandn.omnitool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnStartMolBio, btnStartImaging, btnStartTools;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStartMolBio = (Button) findViewById(R.id.btnMolBio);
        btnStartImaging = (Button) findViewById(R.id.btnImaging);
        btnStartTools = (Button) findViewById(R.id.btnUtils);


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };

        btnStartMolBio.setOnClickListener(listener);


    }
}
