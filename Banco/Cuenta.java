package Banco;
import java.io.Serializable;
public abstract class Cuenta implements Serializable{
    private static final long serialVersionUID = 12345L;
    protected String numero;
    protected String titular;
    protected int saldo;
    public Cuenta(String numero, String titular, int saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
    public void consignar(int monto){
        saldo=saldo+monto;
    }
    public abstract void retirar(int monto);
    public abstract String estadoCuenta();
    public String toString() {
        return "numero='" + numero + '\'' +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo;
    }
    public String getNumero() {
        return numero;
    }
    public String getTitular() {
        return titular;
    }
    public int getSaldo() {
        return saldo;
    }
}
