package Banco;
import java.io.Serializable;
import java.util.ArrayList;
public class GestionCuentas implements Serializable {
    private static final long serialVersionUID = 12345L;
    private ArrayList<Cuenta> cuentas;
    public GestionCuentas() {
        cuentas = new ArrayList<Cuenta>();
        System.out.println("se creo la lista de estudiantes");
    }

    public void crearCAhorro(String num,String t,int saldo){
        CAhorro a = new CAhorro(num,t,saldo);
        cuentas.add(a);
    }
    public void crearCCorriente(String num,String t,int saldo,int sobre){
        CCorriente c = new CCorriente(num,t,saldo,sobre);
        cuentas.add(c);
    }

    public int dineroAlmacenado(){
        int a=0;
        for (Cuenta i : cuentas) {
            if (i.getSaldo()>0){
                a=a+i.getSaldo();
            }
        }
        return a;
    }

    public void consignarDinero(String numero,int monto){
        for (Cuenta i : cuentas) {
            if (i.getNumero().equals(numero)){
                i.consignar(monto);
            }
        }
    }
    public boolean retirarDinero(String numero,int monto){
        for (Cuenta i : cuentas) {
            if (i.getNumero().equals(numero)){
                int a=i.getSaldo();
                i.retirar(monto);
                if(a!=i.getSaldo()){
                    return true;
                }
            }
        }return false;
    }
    public int dineroPrestado(){
        int a=0;
        for (Cuenta i : cuentas) {
            if (i.getSaldo()<0){
                a=a-i.getSaldo();
            }
        }
        return a;
    }

    public String verCuenta(String numero){
        for (Cuenta i : cuentas) {
            if (i.getNumero().equals(numero)){
                return i.estadoCuenta();
            }
        }
        return "No existe esta cuenta";
    }

    public boolean existeCuenta(String numero){
        for (Cuenta i : cuentas) {
            if (i.getNumero().equals(numero)){
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "GestionCuentas{" +
                "cuentas=" + cuentas +
                '}';
    }
}
