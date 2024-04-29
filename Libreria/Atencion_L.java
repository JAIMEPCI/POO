package Libreria;

import Libreria.Libreria;

import javax.swing.*;

public class Atencion_L {
    public static void main(String[] args) {
        Libreria usuario = new Libreria();
        int opc,i,c;
        String n,a;
        do {
            opc= Integer.parseInt(JOptionPane.showInputDialog("""
                    ====OPCIONES====
                    1.Inventario
                    2.Disponibilidad
                    3.Vender
                    4.Surtir
                    0.Salir del menú"""));
            if(opc==1){
                if (usuario.getSize()==0) {
                    JOptionPane.showMessageDialog(null, "No hay libros aqui, agrega alguno!");
                } else {
                    JOptionPane.showMessageDialog(null, usuario.toString());
                }
            }
            if(opc==2){
                if (usuario.getSize()==0) {
                    JOptionPane.showMessageDialog(null, "No hay libros aqui, agrega alguno!");
                } else {
                    i = Integer.parseInt(JOptionPane.showInputDialog("Diga el ISBN del libro que desea conocer si existe:"));
                    if (usuario.Existe(i)) {
                        JOptionPane.showMessageDialog(null, "Si tenemos este libro :D");
                    } else {
                        JOptionPane.showMessageDialog(null, "No tenemos este libro LoL");
                    }
                }
            }
            if (opc==3){
                if (usuario.getSize()==0) {
                    JOptionPane.showMessageDialog(null, "No hay libros aqui, agrega alguno!");
                } else {
                    i = Integer.parseInt(JOptionPane.showInputDialog("Diga el ISBN del libro que desea vender:"));
                    if (usuario.Existe(i)) {
                        usuario.ModCantidad(i,(usuario.getCant(i)-1));
                    } else {
                        JOptionPane.showMessageDialog(null, "No tenemos este libro LoL");
                    }
                }
            }
            if (opc==4){
                i = Integer.parseInt(JOptionPane.showInputDialog("Diga el ISBN del libro que desea surtir:"));
                if (usuario.Existe(i)) {
                    c = Integer.parseInt(JOptionPane.showInputDialog("Diga la cantidad de libros que desea surtir"));
                    usuario.ModCantidad(i, (usuario.getCant(i) + c));
                }else{
                    JOptionPane.showMessageDialog(null, "No tenemos este libro, deberá agregarlo a la base de datos");
                    n = JOptionPane.showInputDialog("Diga el nombre del libro que desea agregar:");
                    a = JOptionPane.showInputDialog("Diga el autor del libro que desea agregar:");
                    c = Integer.parseInt(JOptionPane.showInputDialog("Diga la cantidad de libros que desea agregar:"));
                    usuario.Agregar(i,n,a,c);
                }
            }
            if (opc==5){
                n = JOptionPane.showInputDialog("Diga el nombre del autor a buscar");

            }
        } while (opc != 0);
    }
}
