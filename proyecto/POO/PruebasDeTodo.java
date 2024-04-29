import EjercicioColegio.Colegio;
import javax.swing.*;
import java.io.*;

public class PruebasDeTodo {
    Colegio a;
    public PruebasDeTodo(){
        a = new Colegio();
        menu();
    }
    public static void main(String[] args){
        new PruebasDeTodo();
    }
    public void menu(){
        int opc=-1;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        File archivo;
        try {
            archivo= new File("Colegio.txt");
            if (!archivo.exists()){
                oos = new ObjectOutputStream((new FileOutputStream("Colegio.txt")));
                oos.writeObject(a);
                oos.close();
                JOptionPane.showMessageDialog(null, "Se creo el archivo exitosamente :D");
            }else{
                JOptionPane.showMessageDialog(null, "El archivo de datos se encontro AAAAAAA");

            }
        }catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "El archivo no se encontro");
        } catch (IOException e) {
            e.printStackTrace();
        }
        do{
            try {
                ois = new ObjectInputStream( new FileInputStream ("Colegio.txt"));
                a = (Colegio) ois.readObject();
                ois.close();
            opc= Integer.parseInt(JOptionPane.showInputDialog("""
                    ==========MENU==========
                    1.Agregar estudiante
                    2.Buscar estudiante
                    3.Eliminar estudiante
                    4.Modificar ID
                    5.Modificar Nombre
                    6.Agregar examen Oral
                    7.Agregar examen Escrito
                    8.Estudiantes aprobados
                    9.Ver todos los estudiantes
                    10.Ver examenes de un estudiante
                    0.Salir"""));
            switch (opc) {
                case 0 -> JOptionPane.showMessageDialog(null, "Programa cerrado exitosamente");
                case 1 -> a.agregarEstudiante(JOptionPane.showInputDialog("nombre"),Integer.parseInt(JOptionPane.showInputDialog("id")));
                case 2 -> a.buscarEstudiante(Integer.parseInt(JOptionPane.showInputDialog("id")));
                case 3 -> a.eliminarEstudiante(Integer.parseInt(JOptionPane.showInputDialog("id")));
                case 4 -> a.modifyId(Integer.parseInt(JOptionPane.showInputDialog("id")),Integer.parseInt(JOptionPane.showInputDialog("nuevo id")));
                case 5 -> a.modifyNombre(Integer.parseInt(JOptionPane.showInputDialog("id")),JOptionPane.showInputDialog("nombre"));
                case 6 -> a.agregarExamenOral(Integer.parseInt(JOptionPane.showInputDialog("id del estudiante")));
                case 7 -> a.agregarExamenEscrito(Integer.parseInt(JOptionPane.showInputDialog("id del estudiante")));
                case 8 -> a.estudiantesAprobados();
                case 9 -> a.verTodosEstudiantes();
                case 10 -> a.verExamenesEstudiante(Integer.parseInt(JOptionPane.showInputDialog("id del estudiante")));
            }oos = new ObjectOutputStream ( new FileOutputStream ("Colegio.txt"));
                oos.writeObject(a);
                oos.close();
            }	catch ( Exception e) {
                System.out.print(e.getMessage());
                JOptionPane.showMessageDialog(null,"error!!");
            }

        }while(opc!=0);
    }

}
