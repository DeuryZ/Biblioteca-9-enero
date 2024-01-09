/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

/**
 *
 * @author user
 */
public class Revista extends Recurso{
    int numero;
    tipoRevista tipo;
    public enum tipoRevista {
        
        Farandula("Categoria=Farandula"), Ciencia("Categoria=Ciencia"), Deportes("Categoria=Deportes"), Moda("Categoria=Moda"), Comics("Categoria=Comics");
        
        private String categoria;
        private tipoRevista(String categoria){
            this.categoria=categoria;
        }

        public String getCategoria() {
            return categoria;
        }
    }
    
    public Revista(int numero,  String titulo, boolean disponible, tipoRevista tipo) {
        super(titulo, disponible);
        this.numero = numero;
        this.tipo = tipo;
    }
}
