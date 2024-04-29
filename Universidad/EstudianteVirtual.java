package Universidad;

public class EstudianteVirtual extends Estudiante{
    public EstudianteVirtual(int codigo, String nombre, String programa, int nota) {
        super(codigo, nombre, programa, nota);
    }
    public void asignarNota(int n){
        if(n<3){
            nota=1;
        }else{
            nota=5;
        }
    }
}
