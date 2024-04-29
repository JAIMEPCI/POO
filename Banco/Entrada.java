package Banco;
import javax.swing.*;
import java.io.*;

public class Entrada {
    GestionCuentas gestor;
    public Entrada() {
        gestor = new GestionCuentas();
        menu();
    }

    public void menu(){
        int opc;
        ObjectOutputStream oos = null;
        File archivo;
        try {
            archivo= new File("CuentasBanco.txt");
            if (!archivo.exists()){
                oos = new ObjectOutputStream((new FileOutputStream("CuentasBanco.txt")));
                oos.writeObject(gestor);
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
            opc= Integer.parseInt(JOptionPane.showInputDialog("""
                    ==========MENU==========
                    1.Crear Cuenta
                    2.Realizar Consignacion
                    3.Realizar Retiro
                    4.Estado de Cuenta
                    5.Analisis del Banco
                    6.Salir"""));
            switch (opc) {
                case 6 -> JOptionPane.showMessageDialog(null, "Programa cerrado exitosamente");
                case 1 -> crearCuenta();
                case 2 -> consignarDinero();
                case 3 -> retirarDinero();
                case 4 -> presentarCuenta();
                case 5 -> analizarBanco();
            }
        }while(opc!=6);

    }

    public void crearCuenta(){
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;
        try {
            int opc1 = Integer.parseInt(JOptionPane.showInputDialog("""
                    =====QUE TIPO DE CUENTA DESEA CREAR==
                    1.Cuenta de Ahorros
                    2.Cuenta Corriente"""));

            ois = new ObjectInputStream(new FileInputStream("CuentasBanco.txt"));
            gestor = (GestionCuentas) ois.readObject();
            ois.close();
            String numero;
            do {
                numero = JOptionPane.showInputDialog("Digite el numero de cuenta");
            } while (gestor.existeCuenta(numero));
            String titular = JOptionPane.showInputDialog("Digite su nombre");
            int saldo;
            do {
                saldo = Integer.parseInt(JOptionPane.showInputDialog("Digite el saldo de la cuenta"));
            } while (saldo < 0);
            switch (opc1) {
                case 1:
                    gestor.crearCAhorro(numero, titular, saldo);
                    oos = new ObjectOutputStream(new FileOutputStream("CuentasBanco.txt"));
                    oos.writeObject(gestor);
                    oos.close();
                    break;
                case 2:
                    int sobre;
                    do {
                        sobre = Integer.parseInt(JOptionPane.showInputDialog("Digite el limite de sobregiro de la cuenta"));
                    } while (sobre < 0);
                    gestor.crearCCorriente(numero, titular, saldo, sobre);
                    oos = new ObjectOutputStream(new FileOutputStream("CuentasBanco.txt"));
                    oos.writeObject(gestor);
                    oos.close();
                    break;
            }
        }catch ( Exception e) {
            System.out.print(e.getMessage());
            JOptionPane.showMessageDialog(null,"Error al crear la cuenta");
        }
    }

    public void consignarDinero(){
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;
        try {
            ois = new ObjectInputStream( new FileInputStream ("CuentasBanco.txt"));
            gestor = (GestionCuentas) ois.readObject();
            ois.close();
            String numero=JOptionPane.showInputDialog("Sobre que cuenta desea consignar");
            if (!gestor.existeCuenta(numero)) {
                JOptionPane.showMessageDialog(null, "Esta cuenta NO existe");
            }else {
                int monto = Integer.parseInt(JOptionPane.showInputDialog("Que monto desea cargar a su cuenta"));
                gestor.consignarDinero(numero, monto);
            }
            oos = new ObjectOutputStream ( new FileOutputStream ("CuentasBanco.txt"));
            oos.writeObject(gestor);
            oos.close();
        }	catch ( Exception e) {
            System.out.print(e.getMessage());
            JOptionPane.showMessageDialog(null,"Error al intentar consignar en la cuenta");
        }
    }

    public void retirarDinero() {
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;
        try {
            ois = new ObjectInputStream( new FileInputStream ("CuentasBanco.txt"));
            gestor = (GestionCuentas) ois.readObject();
            ois.close();
            String numero=JOptionPane.showInputDialog("Sobre que cuenta desea retirar");
            if (!gestor.existeCuenta(numero)) {
                JOptionPane.showMessageDialog(null, "Esta cuenta NO existe");
            }else {
                int monto = Integer.parseInt(JOptionPane.showInputDialog("Que monto desea retirar de su cuenta"));
                if(gestor.retirarDinero(numero, monto)){
                    JOptionPane.showMessageDialog(null, "Se ha retirado el dinero de manera exitosa");
                }else{
                    JOptionPane.showMessageDialog(null, "No se ha podido retirar el dinero");
                }
            }
            oos = new ObjectOutputStream ( new FileOutputStream ("CuentasBanco.txt"));
            oos.writeObject(gestor);
            oos.close();
        }	catch ( Exception e) {
            System.out.print(e.getMessage());
            JOptionPane.showMessageDialog(null,"Error al intentar retirar de la cuenta");
        }
    }

    public void presentarCuenta(){
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream( new FileInputStream ("CuentasBanco.txt"));
            gestor = (GestionCuentas) ois.readObject();
            ois.close();
            String numero=JOptionPane.showInputDialog("Sobre que cuenta desea ver la informacion");
            JOptionPane.showMessageDialog(null,gestor.verCuenta(numero));
        }	catch ( Exception e) {
            System.out.print(e.getMessage());
            JOptionPane.showMessageDialog(null,"Error al intentar mostrar la cuenta");
        }
    }

    public void analizarBanco(){
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("CuentasBanco.txt"));
            gestor = (GestionCuentas) ois.readObject();
            ois.close();
            JOptionPane.showMessageDialog(null, "El dinero almacenado en el banco es de: " + gestor.dineroAlmacenado());
            JOptionPane.showMessageDialog(null, "El dinero que el banco ha prestado es de: " + gestor.dineroPrestado());
        }	catch ( Exception e) {
            System.out.print(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al intentar consignar en la cuenta");
        }
    }
    public static void main(String[] args) {
        new Entrada();
    }

}