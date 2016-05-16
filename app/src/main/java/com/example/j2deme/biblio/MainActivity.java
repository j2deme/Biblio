package com.example.j2deme.biblio;

import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.j2deme.biblio.models.Libro;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @BindView(R.id.txtTitulo)
    TextInputEditText txtTitulo;
    @BindView(R.id.txtPaginas)
    TextInputEditText txtPaginas;
    @BindView(R.id.txtAutor)
    TextInputEditText txtAutor;
    @BindView(R.id.btnNewAutor)
    Button btnNewAutor;
    @BindView(R.id.btnSaveLibro)
    Button btnSaveLibro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
      ButterKnife.bind(this);
      btnSaveLibro.setOnClickListener(this);
    }

  @Override
  public void onClick(View v) {
    switch(v.getId()){
      case R.id.btnSaveLibro:
        saveLibro();
        break;
    }
  }

  private void saveLibro() {
    Libro l = new Libro();
    l.setTitulo(txtTitulo.getText().toString());
    l.setPaginas(Integer.parseInt(txtPaginas.getText().toString()));
    l.setAutor(txtAutor.getText().toString());
    l.save();
    Log.i("BIBLIO", "Libro "+l.getId());
  }
}
