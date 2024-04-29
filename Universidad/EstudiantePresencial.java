package Universidad;

public class EstudiantePresencial extends Estudiante{
    public EstudiantePresencial(int codigo, String nombre, String programa, int nota) {
        super(codigo, nombre, programa, nota);
    }
    public void asignarNota(int n){
        nota = n;
    }
}
