package com.example.j2deme.biblio;

import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.txtTitulo)
    TextInputEditText txtTitulo;
    @BindView(R.id.txtPaginas)
    TextInputEditText txtPaginas;
    @BindView(R.id.txtAutor)
    TextInputEditText txtAutor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
