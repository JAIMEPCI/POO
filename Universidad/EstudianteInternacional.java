package Universidad;

public class EstudianteInternacional extends EstudianteIntercambio{
    public EstudianteInternacional(int codigo, String nombre, String programa, int nota, String pais) {
        super(codigo, nombre, programa, nota, pais);
    }
    public void asignarNota(int n){
        nota=Math.round((n*7)/5.0f);
    }
}
