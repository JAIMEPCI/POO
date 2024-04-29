public class VideoJuego extends Juego{
    private String plataforma;
    private String casa;

    public VideoJuego(String tit, int time, String c, int y, int numeroJugadores, String plataforma, String casa) {
        super(tit, time, c, y, numeroJugadores);
        this.plataforma = plataforma;
        this.casa = casa;
    }

    @Override
    public String toString() {
        return "VideoJuego{" +
                "plataforma='" + plataforma + '\'' +
                ", casa='" + casa + '\'' +
                "} " + super.toString();
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }
}
