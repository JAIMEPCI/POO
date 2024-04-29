package com.example.proyecto;

public class ExamenEscrito extends Examen{
    float nota;
    public ExamenEscrito(String titulo, String fecha,float nota) {
        super(titulo, fecha);
        this.nota=nota;
    }

    public boolean aprobo() {
        if (nota >= 3) {
            return true;
        }
        return false;
    }
    public String toString() {
        return "ExamenEscrito{" +
                "titulo='" + titulo + '\'' +
                ", fecha='" + fecha + '\'' +
                ", nota=" + nota +
                "} ";
    }
}
