import State.CheemsMark;
import java.util.Random;
import Observer.*;
public class Main {
  public static void main(String[] args) {
    Random rnd = new Random;
    RegionDescuento espania = new DescuentoEspania();
    RegionDescuento mexico = new DescuentoLatam();
    RegionDescuento america = new DescuentoEU();
    CheemsMark estados = new CheemsMark(); 
    boolean bandera = true;
    while(bandera){
      bandera = estados.inicializarEstado();
    }
  }
}
