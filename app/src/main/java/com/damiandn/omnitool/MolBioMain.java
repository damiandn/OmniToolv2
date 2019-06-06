package com.damiandn.omnitool;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.damiandn.omnitool.MolBio.PCR;

public class MolBioMain extends AppCompatActivity {

    private Button btnStartPCR;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.molbio_main);

        btnStartPCR = (Button) findViewById(R.id.btn_molbio_startPCR);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startPCR = new Intent(MolBioMain.this, PCR.class);
                startActivity(startPCR);


            }
        };

        btnStartPCR.setOnClickListener(listener);

    }
}
