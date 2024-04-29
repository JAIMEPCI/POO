package Estudiantes;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GestionEstudiante implements Serializable {
    private static final long serialVersionUID = 1L;
    ArrayList <Estudiante> listaEstudiantes;

    public GestionEstudiante (){
        listaEstudiantes = new ArrayList <Estudiante> ();
        System.out.print("Se creo la lista de estudiante");
    }

    public void nuevoEstudiante () {
        try {
            int codigo;
            String nombre;
            float nota;
            do {
                codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite el codigo del estudiante"));

            } while (siExiste(codigo));
            nombre = JOptionPane.showInputDialog("Digite los nombres del estudiante");
            do {
                nota = Float.parseFloat(JOptionPane.showInputDialog("Digite la nota del estudiante"));
            }while (nota<0 || nota>5);

            Estudiante e = new Estudiante (codigo, nombre, nota);
            listaEstudiantes.add(e);

        }catch ( Exception e) {
            System.out.println(e.getMessage());
        }


    }
    public void buscarEstudiante() {
        int codigo;
        codigo = Integer.parseInt(JOptionPane.showInputDialog("Diga el codigo a buscar"));
        if (siExiste(codigo)) {
            for (Estudiante e: listaEstudiantes) {
                if (codigo == e.getCodigo()) {
                    JOptionPane.showMessageDialog(null, e.toString());
                    return ;
                }
            }
        }else {
            JOptionPane.showMessageDialog(null,"El codigo no existe");
        }


    }
    public void modifyCodigo() {
        int codigo, nCodigo;
        codigo = Integer.parseInt(JOptionPane.showInputDialog("Diga el codigo a modificar"));
        if (siExiste(codigo)) {
            do {
                nCodigo = Integer.parseInt(JOptionPane.showInputDialog("Digite el nuevo codigo del estudiante"));

            } while (siExiste(nCodigo));
            for (Estudiante e: listaEstudiantes) {
                if (codigo == e.getCodigo()) {
                    e.setCodigo(nCodigo);
                    return ;
                }
            }
        }else {
            JOptionPane.showMessageDialog(null,"El codigo no existe");
        }



    }
    public void modifyNombre() {
        int codigo;
        String nNombre;
        codigo = Integer.parseInt(JOptionPane.showInputDialog("Diga el codigo a modificar"));
        if (siExiste(codigo)) {
            nNombre = JOptionPane.showInputDialog("Digite el nuevo nombre del estudiante");
            for (Estudiante e: listaEstudiantes) {
                if (codigo == e.getCodigo()) {
                    e.setNombre(nNombre);
                    return ;
                }
            }
        }else {
            JOptionPane.showMessageDialog(null,"El codigo no existe");
        }
    }
    public void modifyNota() {
        int codigo;
        float nNota;
        codigo = Integer.parseInt(JOptionPane.showInputDialog("Diga el codigo a modificar"));
        if (siExiste(codigo)) {
            do {
                nNota = Float.parseFloat(JOptionPane.showInputDialog("Digite la nota del estudiante"));
            }while (nNota<0 || nNota>5);
            for (Estudiante e: listaEstudiantes) {
                if (codigo == e.getCodigo()) {
                    e.setNota(nNota);
                    return ;
                }
            }
        }else {
            JOptionPane.showMessageDialog(null,"El codigo no existe");
        }
    }
    public void eliminarEstudiante () {
        int codigo;

        codigo = Integer.parseInt(JOptionPane.showInputDialog("Diga el codigo a eliminar"));
        if (siExiste(codigo)) {

            for (Estudiante e: listaEstudiantes) {
                if (codigo == e.getCodigo()) {
                    listaEstudiantes.remove(e);
                    return ;
                }
            }
        }else {
            JOptionPane.showMessageDialog(null,"El codigo no existe");
        }
    }
    @Override
    public String toString() {
        return "Estudiante1.GestionEstudiantes [listaEstudiantes=" + listaEstudiantes + "]";
    }
    private boolean siExiste(int codigo) {
        for (Estudiante e: listaEstudiantes) {
            if (codigo == e.getCodigo()) {
                return true;
            }
        }
        return false;
    }

}
