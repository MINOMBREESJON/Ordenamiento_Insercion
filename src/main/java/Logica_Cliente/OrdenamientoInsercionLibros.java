/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

/**
 *
 * @author BIENVENIDO
 */
import java.util.ArrayList;

public class OrdenamientoInsercionLibros {

    public static void main(String[] args) {
        // Pila de libros desordenados
        ArrayList<Libro> pilaLibros = new ArrayList<>();
        pilaLibros.add(new Libro("Cien años de soledad", "Gabriel García Márquez"));
        pilaLibros.add(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes"));
        pilaLibros.add(new Libro("El Principito", "Antoine de Saint-Exupéry"));
        pilaLibros.add(new Libro("Crimen y castigo", "Fiódor Dostoyevski"));
        pilaLibros.add(new Libro("Orgullo y prejuicio", "Jane Austen"));

        // Imprimir pila de libros desordenada
        System.out.println("Pila de libros desordenada:");
        for (Libro libro : pilaLibros) {
            System.out.println(libro);
        }

        // Ordenar libros alfabéticamente por título usando el algoritmo de inserción
        ordenarInsercion(pilaLibros);

        // Imprimir pila de libros ordenada
        System.out.println("\nPila de libros ordenada:");
        for (Libro libro : pilaLibros) {
            System.out.println(libro);
        }
    }

    private static void ordenarInsercion(ArrayList<Libro> pilaLibros) {
        for (int i = 1; i < pilaLibros.size(); i++) {
            Libro libroActual = pilaLibros.get(i);
            int j = i - 1;

            while (j >= 0 && pilaLibros.get(j).getTitulo().compareToIgnoreCase(libroActual.getTitulo()) > 0) {
                pilaLibros.set(j + 1, pilaLibros.get(j));
                j--;
            }

            pilaLibros.set(j + 1, libroActual);
        }
    }
}

class Libro {
    private String titulo;
    private String autor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}

