package Estudiantes;
import java.io.*;

import javax.swing.JOptionPane;

public class EntradaE {


    GestionEstudiante gestor ;

    public EntradaE () {
        gestor = new GestionEstudiante();
        menu ();
    }

    public void menu () {
        int opcion = -1;
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;
        File archivo;

        try {
            archivo= new File("ListaClase.dat");
            if (!archivo.exists()){
                oos = new ObjectOutputStream((new FileOutputStream("ListaClase.dat")));
                oos.writeObject(gestor);
                oos.close();
                JOptionPane.showMessageDialog(null, "Se creo el archivo de datos");
            }
            else {
                JOptionPane.showMessageDialog(null, "El archivo de datos se encontro!!");

            }
        }catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "El archivo no se encontro");
        } catch (IOException e) {
            e.printStackTrace();
        }



        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("-------------MENU-----------\n"+
                    "0. Salir\n" +
                    "1. Nuevo Estudiante1.Estudiante\n" +
                    "2. Ver Todos \n" +
                    "3. Buscar Estudiante1.Estudiante\n" +
                    "4. Modificar Estudiante1.Estudiante\n" +
                    "5. Eliminar Estudiante1.Estudiante\n\n" +
                    "Diga su opcion")) ;
            switch (opcion) {
                case 0: JOptionPane.showMessageDialog(null,"Fin del programa");
                    break;
                case 1: try {
                    ois = new ObjectInputStream( new FileInputStream ("ListaClase.dat"));
                    gestor = (GestionEstudiante) ois.readObject();
                    ois.close();
                    gestor.nuevoEstudiante();
                    oos = new ObjectOutputStream ( new FileOutputStream ("ListaClase.dat"));
                    oos.writeObject(gestor);
                    oos.close();
                }catch ( Exception e) {
                    System.out.print(e.getMessage());
                    JOptionPane.showMessageDialog(null,"Error al crear nuevo estudiante");
                }
                    break;
                case 2: try {
                    ois = new ObjectInputStream( new FileInputStream ("ListaClase.dat"));
                    gestor = (GestionEstudiante) ois.readObject();
                    ois.close();
                    JOptionPane.showMessageDialog(null,gestor.toString());
                }	catch ( Exception e) {
                    System.out.print(e.getMessage());
                    JOptionPane.showMessageDialog(null,"Error al listar los Estudiante1.Estudiante");
                }
                    break;
                case 3: try {
                    ois = new ObjectInputStream( new FileInputStream ("ListaClase.dat"));
                    gestor = (GestionEstudiante) ois.readObject();
                    ois.close();
                    gestor.buscarEstudiante();
                }	catch ( Exception e) {
                    System.out.print(e.getMessage());
                    JOptionPane.showMessageDialog(null,"Error al buscar al Estudiante1.Estudiante");
                }
                    break;
                case 4 : menuModify ();
                    break;
                case 5: try {
                    ois = new ObjectInputStream( new FileInputStream ("ListaClase.dat"));
                    gestor = (GestionEstudiante) ois.readObject();
                    ois.close();
                    gestor.eliminarEstudiante();
                    oos = new ObjectOutputStream ( new FileOutputStream ("ListaClase.dat"));
                    oos.writeObject(gestor);
                    oos.close();
                }catch ( Exception e) {
                    System.out.print(e.getMessage());
                    JOptionPane.showMessageDialog(null,"Error al crear nuevo estudiante");
                }
                    break;
            }
        }while (opcion != 0);


    }
    public void menuModify () {
        int opcion = -1;
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("-------------Menu Modificaci�n-----------\n"+
                    "0. Salir\n" +
                    "1. Modificar C�digo\n" +
                    "2. Modificar Nombre\n" +
                    "3. Modificar Nota\n\n" +
                    "Diga su opcion")) ;
            switch (opcion) {
                case 0: JOptionPane.showMessageDialog(null,"Regresa al Men� Principal");
                    break;
                case 1: try {
                    ois = new ObjectInputStream( new FileInputStream ("ListaClase.dat"));
                    gestor = (GestionEstudiante) ois.readObject();
                    ois.close();
                    gestor.modifyCodigo();
                    oos = new ObjectOutputStream ( new FileOutputStream ("ListaClase.dat"));
                    oos.writeObject(gestor);
                    oos.close();
                }catch ( Exception e) {
                    System.out.print(e.getMessage());
                    JOptionPane.showMessageDialog(null,"Error al modificar el codigo");
                }
                    break;
                case 2: try {
                    ois = new ObjectInputStream( new FileInputStream ("ListaClase.dat"));
                    gestor = (GestionEstudiante) ois.readObject();
                    ois.close();
                    gestor.modifyNombre();
                    oos = new ObjectOutputStream ( new FileOutputStream ("ListaClase.dat"));
                    oos.writeObject(gestor);
                    oos.close();
                }catch ( Exception e) {
                    System.out.print(e.getMessage());
                    JOptionPane.showMessageDialog(null,"Error al modificar nombre");
                }
                    break;
                case 3: try {
                    ois = new ObjectInputStream( new FileInputStream ("ListaClase.dat"));
                    gestor = (GestionEstudiante) ois.readObject();
                    ois.close();
                    gestor.modifyNota();
                    oos = new ObjectOutputStream ( new FileOutputStream ("ListaClase.dat"));
                    oos.writeObject(gestor);
                    oos.close();
                }catch ( Exception e) {
                    System.out.print(e.getMessage());
                    JOptionPane.showMessageDialog(null,"Error al modificar la nota");
                }
                    break;
            }
        }while (opcion != 0);

    }
    public static void main(String[] args) {
        new EntradaE ();
    }

}
