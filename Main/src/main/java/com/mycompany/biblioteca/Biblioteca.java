package com.mycompany.biblioteca;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Biblioteca {
    static ArrayList<Recurso> listaRecursos = new ArrayList();
    
    public static void main(String[] args) {
        
        
    }
    
    public void agregarRecurso(Recurso recurso){
        listaRecursos.add(recurso);
    }    
}