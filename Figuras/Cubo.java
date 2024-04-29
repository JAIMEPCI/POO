package Figuras;

import Figuras.Cuadrado;

public class Cubo extends Cuadrado {
    public Cubo(float base) {
        super(base);
    }

    @Override
    public float area() {
        return 6*base*base;
    }

    @Override
    public float perimetro() {
        return 12*base;
    }
}
