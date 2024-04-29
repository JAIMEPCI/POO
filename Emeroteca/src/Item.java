public class Item {
    private String titulo;
    private int tiempo;
    private String comentario;
    private int year;
    public Item(String tit,int time,String c,int y){
        this.titulo=tit;
        this.tiempo=time;
        this.comentario=c;
        this.year=y;
    }
    public String toString() {
        return "Item{" +
                "titulo='" + titulo + '\'' +
                ", tiempo=" + tiempo +
                ", comentario='" + comentario + '\'' +
                ", year=" + year +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
