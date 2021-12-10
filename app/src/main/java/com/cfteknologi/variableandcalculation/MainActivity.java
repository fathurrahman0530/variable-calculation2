package com.cfteknologi.variableandcalculation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // component
    Button bHitung;
    EditText eNil1, eNil2, eHasil;

    // variable
    int nil1, nil2, hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // menghubungkan antara id dengan resource
        eNil1 = (EditText) findViewById(R.id.editTextNumber);
        eNil2 = (EditText) findViewById(R.id.editTextNumber2);
        eHasil = (EditText) findViewById(R.id.editTextNumber4);

        bHitung = (Button) findViewById(R.id.btnHitung);

        // pembuatan method
        bHitung.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // proses conversi dari tipe data string ke integer
                nil1 = Integer.parseInt(eNil1.getText().toString());
                nil2 = Integer.parseInt(eNil2.getText().toString());

                // proses perhitungan
                hasil = nil1 + nil2;

                // proses pengubahan tipe data integer ke string
                eHasil.setText(Integer.toString(hasil));

            }

        });

    }
}