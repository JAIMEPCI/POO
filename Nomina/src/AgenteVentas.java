public class AgenteVentas extends Empleado {
    private int mostrador;
    public AgenteVentas(String n,int e,int s,int m){
        super(n,e,s);
        this.mostrador=m;
    }
    public int getMostrador() {
        return mostrador;
    }
    public void setMostrador(int mostrador) {
        this.mostrador = mostrador;
    }
    @Override
    public String toString() {
        return "Agente de ventas[mostrador=" + mostrador + super.toString() + "]";
    }
}