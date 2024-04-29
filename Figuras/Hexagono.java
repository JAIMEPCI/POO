package Figuras;

public class Hexagono extends Poligono {
    public Hexagono(float base, float altura) {
        super(base, altura);
    }
    @Override
    public float area(){
        return (base*6)*altura/2;
    }
    @Override
    public float perimetro(){
        return base*6;
    }
}
