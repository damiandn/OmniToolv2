package com.damiandn.omnitool.MolBio;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.damiandn.omnitool.R;

public class PCR extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.molbiopcr);
        if (savedInstanceState != null) {
            //grab the saved values from the bundle and put them back in the new fields
            //ie savedInstanceState.getString(STRING_KEY);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        //save the values to the bundle
        //ie  outState.putString(STRING_KEY, value);
        //outState.putInt(STATE_LIMIT, feedLimit);
        super.onSaveInstanceState(outState);
    }


}
