package Universidad;

public class EstudianteDobleTitulacion extends EstudianteIntercambio{
    public EstudianteDobleTitulacion(int codigo, String nombre, String programa, int nota, String pais) {
        super(codigo, nombre, programa, nota, pais);
    }
    public void asignarNota(int n){
        nota=(int)(n*10)/5;
    }
}
