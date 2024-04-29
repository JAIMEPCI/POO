package com.example.proyecto;

public class ExamenOral extends Examen{
    int tiempo;
    public ExamenOral(String titulo, String fecha,int tiempo) {
        super(titulo, fecha);
        this.tiempo=tiempo;
    }
    public boolean aprobo() {
        if (tiempo<=70){
            return true;
        }
        return false;
    }
    public String toString() {
        return "ExamenOral{" +
                "titulo='" + titulo + '\'' +
                ", fecha='" + fecha + '\'' +
                ", tiempo=" + tiempo +
                "} ";
    }
}
