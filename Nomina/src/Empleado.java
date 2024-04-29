public class Empleado {
    protected String nombre;
    protected int edad;
    protected int sueldo;

    public Empleado(String n,int e,int s){
        this.nombre=n;
        this.edad=e;
        this.sueldo=s;
    }
    public int calcularSueldo(int d,int b){
        return this.sueldo - d + b;
    }
    public String toString() {
        return "Empleado{" + "nombre='" + nombre + '\'' + ", edad=" + edad + ", sueldo=" + sueldo + '}';
    }

    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public int getSueldo() {
        return sueldo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
}
