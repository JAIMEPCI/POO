package Universidad;

public abstract class EstudianteIntercambio extends Estudiante{
    protected String pais;

    public EstudianteIntercambio(int codigo, String nombre, String programa, int nota, String pais) {
        super(codigo, nombre, programa, nota);
        this.pais = pais;
    }
    public String getPais() {
        return pais;
    }
    public abstract void asignarNota(int n);
}
