package RefugioMascotas;

import javax.swing.*;

public class EntradaMiau {
    public static void main(String[]args) {
        int opc,opc1,c,cn;
        String n,e,nn,en;
        Refugio r = new Refugio();

        do{
            opc=Integer.parseInt(JOptionPane.showInputDialog("""
                ====OPCIONES====
                1.Agregar mascota
                2.Ver todas las mascotas
                3.Buscar mascota
                4.Modificar mascota
                5.Adoptar mascota
                0.Salir del menú"""));
            if(opc==1){
                c=Integer.parseInt(JOptionPane.showInputDialog("Cual es el codigo"));
                n=JOptionPane.showInputDialog("Cual es el titulo");
                e=JOptionPane.showInputDialog("Cual es su especie");
                r.Agregar(c,n,e);
            }
            if (opc==2){
                if (r.Size()==0){
                    JOptionPane.showMessageDialog(null,"No hay mascotas :v");
                }else{
                    JOptionPane.showMessageDialog(null,r.toString());
                }
            }
            if (opc==3){
                if (r.Size()==0){
                    JOptionPane.showMessageDialog(null,"No hay mascotas :v");
                }else{
                    c=Integer.parseInt(JOptionPane.showInputDialog("Cual es el codigo"));
                    if (r.BuscarCodigo(c)){
                        JOptionPane.showMessageDialog(null,"=SI= esta esta mascota");
                    }else{
                        JOptionPane.showMessageDialog(null,"=NO= está esta mascota");
                    }
                }
            }
            if (opc==4){
                opc1=Integer.parseInt(JOptionPane.showInputDialog("""
                ====OPCIONES====
                1.Modificar el codigo
                2.Modificar el titulo
                3.Modificar la especie"""));
                if (opc1==1){
                    c=Integer.parseInt(JOptionPane.showInputDialog("Cual es el codigo de la mascota a modificar"));
                    cn=Integer.parseInt(JOptionPane.showInputDialog("Cual es el codigo nuevo"));
                    r.ModificarCodigo(c,cn);
                }
                if (opc1==2){
                    c=Integer.parseInt(JOptionPane.showInputDialog("Cual es el codigo de la mascota a modificar"));
                    nn=JOptionPane.showInputDialog("Cual es el titulo nuevo");
                    r.ModificarNombre(c,nn);
                }
                if (opc1==3){
                    c=Integer.parseInt(JOptionPane.showInputDialog("Cual es el codigo de la mascota a modificar"));
                    en=JOptionPane.showInputDialog("Cual es la especie");
                    r.ModificarEspecie(c,en);
                }
            }
            if (opc==5) {
                c = Integer.parseInt(JOptionPane.showInputDialog("Cual es el codigo de la mascota que va a adoptar"));
                r.Adoptar(c);
            }
        }while(opc!=0);
    }
}
