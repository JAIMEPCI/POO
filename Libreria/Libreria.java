package Libreria;

import javax.swing.*;
import java.io.Serializable;
import java.util.ArrayList;
public class Libreria implements Serializable {
    ArrayList<Libro> libros;
    public Libreria() {
        libros = new ArrayList<Libro>();
    }
    public String toString() {
        return "Los libros de la libreria " + libros;
    }
    public Boolean Existe(int isbn) {
        for (Libro i : libros) {
            if (isbn == i.getISBN()) {

                return true;
            }
        }
        return false;
    }
    public void Agregar(int isbn, String n, String a, int c) {
        Libro book = new Libro(isbn, n, a, c);
        libros.add(book);
    }
    public void ModCantidad(int isbn, int c) {
        for (Libro i : libros) {
            if (isbn == i.getISBN()) {
                i.setCantidad(c);
            }
        }
    }
    public int getCant(int isbn) {
        for (Libro i : libros) {
            if (isbn == i.getISBN()) {
                return i.getCantidad();
            }
        }
        return 0;
    }
    public int getSize(){return libros.size();}
    public void autor(String nb){
        for (Libro n: libros){
            if (nb.equalsIgnoreCase(n.getAutor())){
                JOptionPane.showMessageDialog(null,"Libros encontrados por el autor " + nb + " Son :\n " + n.toString()+"\n");
            } else {
                JOptionPane.showMessageDialog(null,"No se encontro ningun libro a nombre de este autor");
            }
        }

    }
}