package Figuras;

public class Triangulo extends Poligono {
    public Triangulo(float base, float altura) {
        super(base, altura);
    }
    @Override
    public float area(){
        return base*altura/2;
    }
    @Override
    public float perimetro(){
        return base*3;
    }
}
