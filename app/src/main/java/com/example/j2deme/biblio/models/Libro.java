package com.example.j2deme.biblio.models;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by j2deme on 9/05/16.
 */
@Table(name = "Libros")
public class Libro extends Model {
  @Column(name = "titulo")
  private String titulo;

  @Column(name = "paginas")
  private int paginas;

  @Column(name = "autor")
  private String autor;

  public Libro() {
    super();
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public int getPaginas() {
    return paginas;
  }

  public void setPaginas(int paginas) {
    this.paginas = paginas;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }
}
