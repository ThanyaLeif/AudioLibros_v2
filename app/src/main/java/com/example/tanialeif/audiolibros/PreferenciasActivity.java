package com.example.tanialeif.audiolibros;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.tanialeif.audiolibros.fragments.PreferenciasFragment;

public class PreferenciasActivity extends AppCompatActivity {

   @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportFragmentManager().beginTransaction()
                .replace(android.R.id.content, new PreferenciasFragment()).commit();

    }
}
