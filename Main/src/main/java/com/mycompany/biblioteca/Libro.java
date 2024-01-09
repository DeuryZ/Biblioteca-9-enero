
package com.mycompany.biblioteca;

public class Libro extends Recurso{
    String autor;
    public Libro(int id, String titulo, boolean disponible, String autor) {
        super(titulo, disponible);
        this.autor=autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "autor=" + autor + ", id=" + getId() + ", titulo=" + getTitulo() + ", disponible=" + isDisponible() + '}';
    }
}