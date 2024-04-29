package Banco;

public class CAhorro extends Cuenta{
    public CAhorro(String numero, String titular, int saldo) {
        super(numero, titular, saldo);
    }
    @Override
    public void retirar(int monto) {
        if (saldo-monto>=0) {
            saldo = saldo - monto;
        }
    }

    @Override
    public String estadoCuenta() {
        return "Cuenta de Ahorro No "+numero+ "\nTitular: "+titular+"\nSaldo: "+saldo;
    }
    @Override
    public String toString() {
        return "CAhorro{} " + super.toString();
    }
}

