package RefugioMascotas;                                                                                  //carpeta a la que pertenece

public class Mascota {                                                                                    //clase Mascota
    private int codigo;                                                                                   //atributo de tipo entero codigo
    private String nombre,especie;                                                                        //atributos de tipo String nombre y especie
    public Mascota(){                                                                                     //constructor sin atributos puestos, (mejor ponerlo siempre)
    }
    public Mascota(int c,String n,String e){                                                              //constructor con parametros
        this.codigo=c;                                                                                    //link entre parametro y atributo
        this.nombre=n;                                                                                    //link entre parametro y atributo
        this.especie=e;                                                                                   //link entre parametro y atributo
    }
    public String toString(){                                                                             //metodo que manda de vuelta una cadena de texto
        return "\nRefugioMascotas.Mascota[Codigo= "+codigo+"  Nombre= "+nombre+"  Especie= "+especie+"]"; //la cadena de texto en el return
    }


    public String getNombre() {                                                                           // getters, pido el valor de el atributo
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getEspecie() {
        return especie;
    }

    public void setNombre(String nombre) {                                                                //setters, doy un valor a el atributo
        this.nombre = nombre;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

}
