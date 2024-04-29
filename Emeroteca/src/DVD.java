public class DVD extends Item{
    private String director;

    public DVD(String tit, int time, String c, int y, String director) {
        super(tit, time, c, y);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "director='" + director + '\'' +
                "} " + super.toString();
    }

}
