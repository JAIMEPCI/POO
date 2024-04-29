package RefugioMascotas;

import java.util.ArrayList;
public class Refugio {
    ArrayList<Mascota> masclist;
    public Refugio(){
        masclist = new ArrayList<Mascota>();
    }
    public void Agregar(int c,String n,String e){
        Mascota miau = new Mascota(c,n,e);
        masclist.add(miau);
    }
    public boolean Adoptar(int c) {
        for (Mascota i : masclist) {
            if (c== i.getCodigo()){
                masclist.remove(i);
                return true;
            }
        }
        return false;
    }
    public boolean ModificarNombre(int c,String nn){
        for (Mascota i : masclist) {
            if (c== i.getCodigo()){
                i.setNombre(nn);
                return true;
            }
        }
        return false;
    }
    public boolean ModificarEspecie(int c,String en){
        for (Mascota i : masclist) {
            if (c== i.getCodigo()){
                i.setEspecie(en);
                return true;
            }
        }
        return false;
    }
    public boolean ModificarCodigo(int c,int cn){
        for (Mascota i : masclist) {
            if (c== i.getCodigo()){
                i.setCodigo(cn);
                return true;
            }
        }
        return false;
    }
    public String toString(){
        return "Las mascotas " + masclist;
    }
    public int Size(){
        return masclist.size();
    }
    public boolean BuscarCodigo(int c){
        for (Mascota i : masclist) {
            if (c==i.getCodigo()){
                return true;
            }
        }
        return false;
    }
}
