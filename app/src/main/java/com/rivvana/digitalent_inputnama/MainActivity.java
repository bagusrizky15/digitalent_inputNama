package com.rivvana.digitalent_inputnama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //deklarasi variabel

    TextView tvNama;
    EditText etInput;
    Button btnTampil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvNama = findViewById(R.id.tv_nama);
        etInput = findViewById(R.id.et_input_nama);
        btnTampil = findViewById(R.id.btn_tampilkan);

        btnTampil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvNama.setText("Nama Anda : " + etInput.getText().toString() );
            }
        });
    }
}