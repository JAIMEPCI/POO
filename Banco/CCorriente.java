package Banco;

public class CCorriente extends Cuenta{
    private int sobregiro;

    public CCorriente(String numero, String titular, int saldo, int sobregiro) {
        super(numero, titular, saldo);
        this.sobregiro = sobregiro;
    }
    @Override
    public void retirar(int monto) {
        if (saldo-monto>=-sobregiro) {
            saldo = saldo - monto;
        }
    }

    @Override
    public String estadoCuenta() {
        int p=0,n=0;
        if(saldo>0){
            p=saldo;
        }else{
            n=-saldo;
        }
        return "Cuenta de Ahorro No "+numero+ "\nTitular: "+titular+"\nSaldo: "+p+"\nValor Sobregiro: "+n+"\nLimite Sobregiro: "+sobregiro;
    }
    public int getSobregiro() {
        return sobregiro;
    }
    @Override
    public String toString() {
        return "CCorriente{" +
                "sobregiro=" + sobregiro +
                "} " + super.toString();
    }
}
