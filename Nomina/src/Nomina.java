import javax.swing.*;
public class Nomina {
    public static void main(String[] args){
        AgenteVentas emple1 = new AgenteVentas("pepe perexxxxxx",22,500,2);
        JOptionPane.showMessageDialog(null, "Nombre: " + emple1.getNombre());
        JOptionPane.showMessageDialog(null, "Sueldo: " + emple1.calcularSueldo(100,330));
        JOptionPane.showMessageDialog(null, "Mostrador: "+emple1.getMostrador());
        JOptionPane.showMessageDialog(null, "Edad: "+emple1.getEdad());
        Piloto emple2 = new Piloto("garnica",40,500);
        JOptionPane.showMessageDialog(null, "La renovacion del piloto " + emple2.getNombre() + " debe ser hecha " + emple2.mostrarRenovacion());
        JOptionPane.showMessageDialog(null, "agente de ventas: " + emple1.calcularSueldo(100,100)+"\npiloto: " + emple2.calcularSueldo(100,100));
        JOptionPane.showMessageDialog(null, emple1.toString());
    }
}
