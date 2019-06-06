package com.damiandn.omnitool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnStartMolBio, btnStartImaging, btnStartTools;



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

                switch(v.getId()) {
                    case R.id.btnMolBio:
                        Intent startMolBio = new Intent(MainActivity.this, MolBioMain.class);
                        startActivity(startMolBio);
                        break;
                    case R.id.btnImaging:
                        Intent startImaging = new Intent(MainActivity.this, ImagingMain.class);
                        startActivity(startImaging);
                        break;
                    case R.id.btnUtils:
                    Intent startUtils = new Intent(MainActivity.this, UtilsMain.class);
                    startActivity(startUtils);
                }

            }
        };



        btnStartMolBio.setOnClickListener(listener);
        btnStartImaging.setOnClickListener(listener);
        btnStartTools.setOnClickListener(listener);
    }


}
