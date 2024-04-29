public class JuegoMesa extends Juego{
    private String categoria;

    public JuegoMesa(String tit, int time, String c, int y, int numeroJugadores, String categoria) {
        super(tit, time, c, y, numeroJugadores);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "JuegoMesa{" +
                "categoria='" + categoria + '\'' +
                "} " + super.toString();
    }
}
