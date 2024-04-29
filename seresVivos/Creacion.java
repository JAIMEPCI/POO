package seresVivos;
public class Creacion {
    public static void main(String[] args) {
        Planta planti = new Planta("PepiRRico");
        System.out.println(planti.getNombre()+" se alimenta "+ planti.alimentar());
        Carnivoro tiburon = new Carnivoro("tiburoncin");
        System.out.println(tiburon.getNombre()+" se alimenta "+ tiburon.alimentar()+ " y se desplaza " + tiburon.desplazar());
        Insectivoro bird = new Insectivoro("mordekai");
        System.out.println(bird.getNombre()+" se alimenta "+ bird.alimentar()+ " y se desplaza " + bird.desplazar());
        SerVivo ser = new Carnivoro("carniboro");
        System.out.println(ser.alimentar());

    }

}
