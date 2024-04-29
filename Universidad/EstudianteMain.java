package Universidad;

import javax.swing.*;

public class EstudianteMain {
    public static void main(String[] args) {
        int opc,c,nota;
        String n,p,pa;
        n=JOptionPane.showInputDialog("Diga el nombre del estudiante");
        p=JOptionPane.showInputDialog("Diga el programa del estudiante");
        c=Integer.parseInt(JOptionPane.showInputDialog("Diga el codigo del estudiante"));
        nota=Integer.parseInt(JOptionPane.showInputDialog("Diga la nota del estudiante"));
        pa=JOptionPane.showInputDialog("Diga el pais del estudiante");
        EstudianteVirtual vir = new EstudianteVirtual(c,n,p,nota);
        EstudiantePresencial pre = new EstudiantePresencial(c,n,p,nota);
        EstudianteInternacional inte = new EstudianteInternacional(c,n,p,nota,pa);
        EstudianteDobleTitulacion doti = new EstudianteDobleTitulacion(c,n,p,nota,pa);
        pre.asignarNota(nota);
        inte.asignarNota(nota);
        doti.asignarNota(nota);
        vir.asignarNota(nota);
        JOptionPane.showMessageDialog(null,"Si el estudiante "+ vir.getNombre() +" Codigo: "+vir.getCodigo() +" del programa "+vir.getPrograma()+ " estudia virtualmente, su nota es de: "+ vir.getNota());
        JOptionPane.showMessageDialog(null,"Si el estudiante "+ pre.getNombre() +" Codigo: "+pre.getCodigo()+" del programa "+pre.getPrograma()+ " estudia presencialmente, su nota es de: "+ pre.getNota());
        JOptionPane.showMessageDialog(null,"Si el estudiante "+ inte.getNombre() +" Codigo: "+inte.getCodigo()+" del programa "+inte.getPrograma()+ " proveniente del país "+inte.getPais()+ " estudia de intercambio, su nota es de: "+ inte.getNota());
        JOptionPane.showMessageDialog(null,"Si el estudiante "+ doti.getNombre() +" Codigo: "+doti.getCodigo()+" del programa "+doti.getPrograma()+ " proveniente del país "+doti.getPais()+ " estudia un programa de doble titulacion, su nota es de: "+ doti.getNota());
    }
}
