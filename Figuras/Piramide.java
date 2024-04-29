package Figuras;

import java.lang.Math;
public class Piramide extends Triangulo {
    public Piramide(float base, float altura) {
        super(base, altura);
    }

    @Override
    public float area() {
        return (base*base)+super.area()*4;
    }

    @Override
    public float perimetro() {
        return (float) (base*4+Math.sqrt((altura*altura)+((base/2)*(base/2))));
    }
}
