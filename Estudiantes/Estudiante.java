package Estudiantes;
import java.io.Serializable;

public class Estudiante implements Serializable {
    private static final long serialVersionUID = 1L;
    int codigo;
    String nombre;
    float nota;

    public Estudiante(int codigo, String nombre, float nota) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.nota = nota;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String toString() {
        return "\nEstudiante1.Estudiante [codigo=" + codigo + ", nombre=" + nombre + ", nota=" + nota + "]";
    }

}
