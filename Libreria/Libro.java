package Libreria;

import java.io.Serializable;
public class Libro implements Serializable {
    private int ISBN;
    private String Nombre;
    private String Autor;
    private int Cantidad;
    public Libro(int isbn,String n,String a,int c) {
        this.Autor = a;
        this.Cantidad = c;
        this.ISBN = isbn;
        this.Nombre = n;
    }
    public String toString() {return "\nISBN= "+ISBN+"   Nombre= "+Nombre+"   Autor= "+Autor+"   Unidades existentes= "+Cantidad;}
    public String getNombre() {return Nombre;}
    public int getISBN() {return ISBN;}
    public int getCantidad() {return Cantidad;}
    public String getAutor() {return Autor;}
    public void setNombre(String nombre) {this.Nombre = nombre;}
    public void setAutor(String autor) {this.Autor = autor;}
    public void setCantidad(int cantidad) {this.Cantidad = cantidad;}
    public void setISBN(int ISBN) {this.ISBN = ISBN;}
}
