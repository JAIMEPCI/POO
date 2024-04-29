package Figuras;

public class Poligono {
    protected float base;
    protected float altura;

    public Poligono(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    public float area(){
     return base*altura;
    }
    public float perimetro(){
        return base+altura;
    }
    public float getBase() {
        return base;
    }
    public void setBase(float base) {
        this.base = base;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public String toString() {
        return "Poligono{" +
                "Base=" + base +
                ", Altura=" + altura +
                '}';
    }

}
