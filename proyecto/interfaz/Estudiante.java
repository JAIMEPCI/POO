package com.example.proyecto;

//import javax.swing.*;
import java.io.Serializable;
import java.util.ArrayList;

public class Estudiante implements Aprobado, Serializable {
    private static final long serialVersionUID = 12345L;
    private String nombre;
    private int id;
    private ArrayList<Examen> examenes;
    public Estudiante(String nombre,int id){
        examenes = new ArrayList<Examen>();
        this.nombre=nombre;
        this.id=id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public boolean aprobo() {
        int a =0;
        for (Examen i : examenes) {
            if(i.aprobo()){
                a+=1;
            }
        }
        if(examenes.size()==0){
            return false;
        }
        return a / examenes.size() >= 0.8;
    }
    public void agregaarExamenEscrito(String titulo, String fecha,float nota){
        if(!existeExamen(titulo)) {
            Examen e = new ExamenEscrito(titulo, fecha, nota);
            examenes.add(e);
        }else{
           // JOptionPane.showMessageDialog(null,"ya hay un examen con este nombre");

        }
    }
    public void agregaarExamenOral(String titulo, String fecha,int tiempo){
        if(!existeExamen(titulo)) {
            Examen e = new ExamenOral(titulo, fecha, tiempo);
            examenes.add(e);
        }else{
          //  JOptionPane.showMessageDialog(null,"ya hay un examen con este nombre");

        }
    }
    private boolean existeExamen(String titulo){
        for (Examen i : examenes) {
            if(i.getTitulo().equals(titulo)){
                return true;
            }
        }return false;
    }
    public String verExamenes(){
        String a="";
        if(!examenes.isEmpty()) {
            for (Examen i : examenes) {
                a = a + i.toString() + ", ";
            }
            return a;
        }
        return "No ha presentado ningun examen este estudiante";
    }
    public String nToString() {
        return nombre;
    }
    public String iDtoString() {
        return "" + id ;
    }
}
