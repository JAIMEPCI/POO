package EjercicioColegio;

public abstract class Examen implements Aprobado{
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
