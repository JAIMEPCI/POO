package EjercicioColegio;

import java.io.Serializable;

public abstract class Examen implements Aprobado, Serializable {
    private static final long serialVersionUID = 12345L;
    String titulo;
    String fecha;
    public Examen(String titulo, String fecha) {
        this.titulo = titulo;
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getFecha() {
        return fecha;
    }
}
