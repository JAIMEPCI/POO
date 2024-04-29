public class Piloto extends Empleado{
    public Piloto(String n,int e,int s){
        super(n,e,s);
    }
    public String mostrarRenovacion (){
        if(edad>50){
            return "Cada 6 meses";
        }else{
            return "Cada añO";
        }
    }
    @Override
    public int calcularSueldo(int d,int b){
        return this.sueldo - (d/2) + b;
    }

}
