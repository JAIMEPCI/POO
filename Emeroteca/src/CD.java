public class CD extends Item{
    private String artista;
    private int numeroCanciones;

    public CD(String tit, int time, String c, int y, String artista, int numeroCanciones) {
        super(tit, time, c, y);
        this.artista = artista;
        this.numeroCanciones = numeroCanciones;
    }

    @Override
    public String toString() {
        return "CD{" +
                "artista='" + artista + '\'' +
                ", numeroCanciones=" + numeroCanciones +
                "} " + super.toString();
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getNumeroCanciones() {
        return numeroCanciones;
    }

    public void setNumeroCanciones(int numeroCanciones) {
        this.numeroCanciones = numeroCanciones;
    }
}
