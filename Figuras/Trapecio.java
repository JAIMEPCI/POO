package Figuras;

import java.lang.Math;
public class Trapecio extends Poligono {
    private float baseSuperior;
    public Trapecio(float base, float altura, float baseSuperior) {
        super(base, altura);
        this.baseSuperior = baseSuperior;
    }
    @Override
    public float area() {
        return altura*(base+baseSuperior)/2;
    }
    @Override
    public float perimetro() {
        return (float) ((Math.sqrt(Math.pow(base-baseSuperior/2,2)+Math.pow(altura,2))*2)+baseSuperior+base);
    }
    public float getBaseSuperior() {
        return baseSuperior;
    }
    public void setBaseSuperior(float baseSuperior) {
        this.baseSuperior = baseSuperior;
    }
}
