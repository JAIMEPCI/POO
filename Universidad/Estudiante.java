package Universidad;

public abstract class Estudiante {
    protected int codigo;
    protected String nombre;
    protected String programa;
    protected int nota;

    public Estudiante(int codigo, String nombre, String programa, int nota) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.programa = programa;
        this.nota = nota;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrograma() {
        return programa;
    }

    public int getNota() {
        return nota;
    }

    public abstract void asignarNota(int n);
}
