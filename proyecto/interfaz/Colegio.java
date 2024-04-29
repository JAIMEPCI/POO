/*package com.example.proyecto;

import javax.swing.*;
import java.io.Serializable;
import java.util.ArrayList;

public class Colegio {

import javax.swing.*;
import java.io.Serializable;
import java.util.ArrayList;

    public class Colegio implements Serializable {
        private static final long serialVersionUID = 12345L;
        private ArrayList<Estudiante> estudiantes;
        public Colegio(){
            estudiantes = new ArrayList<Estudiante>();
        }
        public void agregarEstudiante(String nombre,int id) {
            if(!existeCodigo(id)) {
                Estudiante e = new Estudiante(nombre, id);
                estudiantes.add(e);
            }else{
                JOptionPane.showMessageDialog(null,"ya hay un estudiante");
            }
        }
        public void agregarExamenOral(int id){
            int a=0;
            if (existeCodigo(id)) {
                for (Estudiante i : estudiantes) {
                    if (i.getId() == id) {
                        i.agregaarExamenOral(JOptionPane.showInputDialog("titulo"),JOptionPane.showInputDialog("fecha"),Integer.parseInt(JOptionPane.showInputDialog("tiempo")));
                        JOptionPane.showMessageDialog(null, "se encontro un estudiante y creo el examen");
                        a=1;
                        break;
                    }
                }
                if(a==0) {
                    JOptionPane.showMessageDialog(null, "NOOOOOO se encontro un estudiante");
                }        }else{
                JOptionPane.showMessageDialog(null, "NOOOOOO existe el codigo");
            }
        }
        public void agregarExamenEscrito(int id){
            int a =0;
            if (existeCodigo(id)) {
                for (Estudiante i : estudiantes) {
                    if (i.getId() == id) {
                        i.agregaarExamenEscrito(JOptionPane.showInputDialog("titulo"),JOptionPane.showInputDialog("fecha"),Integer.parseInt(JOptionPane.showInputDialog("nota")));
                        JOptionPane.showMessageDialog(null, "se encontro un estudiante y se creo el examen");
                        a=1;
                        break;
                    }
                }
                if(a==0) {
                    JOptionPane.showMessageDialog(null, "NOOOOOO se encontro un estudiante");
                }        }else{
                JOptionPane.showMessageDialog(null, "NOOOOOO existe el codigo");
            }
        }
        public void buscarEstudiante(int id) {
            if (existeCodigo(id)) {
                int a=0;
                for (Estudiante i : estudiantes) {
                    if (i.getId() == id) {
                        JOptionPane.showMessageDialog(null, "se encontro un estudiante");
                        System.out.println(i.toString());
                        a=1;
                        break;
                    }
                }
                if(a==0) {
                    JOptionPane.showMessageDialog(null, "NOOOOOO se encontro un estudiante");
                }
            }else{
                JOptionPane.showMessageDialog(null, "NOOOOOO existe el codigo");
            }
        }
        public void verExamenesEstudiante(int id) {
            if (existeCodigo(id)) {
                int a=0;
                for (Estudiante i : estudiantes) {
                    if (i.getId() == id) {
                        JOptionPane.showMessageDialog(null,i.verExamenes());
                        a=1;
                        break;
                    }
                }
                if(a==0) {
                    JOptionPane.showMessageDialog(null, "NOOOOOO se encontro un estudiante");
                }
            }else{
                JOptionPane.showMessageDialog(null, "NOOOOOO existe el codigo");
            }
        }
        public void modifyNombre(int id,String nuevoNombre){
            if (existeCodigo(id)) {
                int a=0;
                for (Estudiante i : estudiantes) {
                    if (i.getId() == id) {
                        i.setNombre(nuevoNombre);
                        JOptionPane.showMessageDialog(null, "se cambio el titulo del estudiante");
                        a=1;
                        break;
                    }
                }
                if(a==0) {
                    JOptionPane.showMessageDialog(null, "NOOOOOO se encontro un estudiante");
                }
            }else{
                JOptionPane.showMessageDialog(null, "NOOOOOO existe el codigo");
            }
        }
        public void modifyId(int id,int nuevoId){
            if (existeCodigo(id)) {
                int a=0;
                for (Estudiante i : estudiantes) {
                    if (i.getId() == id) {
                        i.setId(nuevoId);
                        JOptionPane.showMessageDialog(null, "se cambio el ID del estudiante");
                        a=1;
                        break;
                    }
                }
                if(a==0) {
                    JOptionPane.showMessageDialog(null, "NOOOOOO se encontro un estudiante");
                }
            }else{
                JOptionPane.showMessageDialog(null, "NOOOOOO existe el codigo");
            }
        }
        public void estudiantesAprobados(){
            for (Estudiante i : estudiantes) {
                if(i.aprobo()){
                    System.out.println(i.toString());
                }
            }
        }
        private boolean existeCodigo(int id){
            for (Estudiante i : estudiantes) {
                if(i.getId()==id){
                    return true;
                }
            }
            return false;
        }
        public void eliminarEstudiante(int id){
            if (existeCodigo(id)) {
                int a=0;
                for (Estudiante i : estudiantes) {
                    if (i.getId() == id) {
                        estudiantes.remove(i);
                        JOptionPane.showMessageDialog(null, "se elimino un estudiante");
                        a=1;
                        break;
                    }
                }
                if(a==0) {
                    JOptionPane.showMessageDialog(null, "NOOOOOO se encontro un estudiante");
                }
            }else{
                JOptionPane.showMessageDialog(null, "NOOOOOO existe el codigo");
            }
        }
        public void verTodosEstudiantes(){
            for (Estudiante i : estudiantes) {
                System.out.println(i.toString());
            }
        }
    }

}*/
