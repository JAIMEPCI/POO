package ManageVehicle;
import javax.swing.JOptionPane;
public class Entrada {
    private FlotaVehiculos inventario;
    public Entrada() {

    }
    public void menu(){
        inventario = new FlotaVehiculos();
        int menu=-1;
        do {
            menu=Integer.parseInt(JOptionPane.showInputDialog(null, """
                     Que desea hacer:
                     1.Resgistre un vechiculo a la flota
                     2.Conozca el costo de los activos de la flota
                     3.Listado de cada vehiculo de la flota
                     Digite su opcion:"""));

        switch (menu) {
            case 1:
                int opc=0;
                String pl;
                int m,pr;
                while(opc!=1 && opc!=2) {
                    opc = Integer.parseInt(JOptionPane.showInputDialog("Desea poner un auto o una van en la flota\nSi es un auto escriba 1, si es una van escriba 2"));
                }
                pl=JOptionPane.showInputDialog("Diga la placa del vehiculo");
                m=Integer.parseInt(JOptionPane.showInputDialog("Diga el modelo del vehiculo"));
                pr=Integer.parseInt(JOptionPane.showInputDialog("Diga el precio del vehiculo"));
                if(opc==1){
                    inventario.agregarAuto(pl,m,pr);
                }else{
                    inventario.agregarVan(pl,m,pr);
                }
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"La flota tiene un costo de activos actual de: "+inventario.costoFlota());
                break;
            case 3:
                JOptionPane.showMessageDialog(null,inventario.listado());
                break;

        }
        }while (menu!=0);
    }
}
