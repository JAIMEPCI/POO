public class Juego extends Item{
    private int numeroJugadores;

    public Juego(String tit, int time, String c, int y, int numeroJugadores) {
        super(tit, time, c, y);
        this.numeroJugadores = numeroJugadores;
    }

    @Override
    public String toString() {
        return "Juego{" +
                "numeroJugadores=" + numeroJugadores +
                "} " + super.toString();
    }

    public int getNumeroJugadores() {
        return numeroJugadores;
    }

    public void setNumeroJugadores(int numeroJugadores) {
        this.numeroJugadores = numeroJugadores;
    }
}
