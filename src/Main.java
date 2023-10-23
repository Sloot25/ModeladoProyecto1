import State.CheemsMark;
import java.util.Random;
import Observer.*;
import Proxy.BDUsuarios;
public class Main {
  public static void main(String[] args) {
    Random rnd = new Random();
    BDUsuarios bd = new BDUsuarios();
    CheemsMark estados = new CheemsMark(); 
    estados.setBaseUsuarios(bd);
    // Actualiza los descuentos de acuerdo a un valor random entre 0 y 40 
    bd.actualizarDescuento(0, rnd.nextInt(40));
    bd.actualizarDescuento(1, rnd.nextInt(40));
    bd.actualizarDescuento(2, rnd.nextInt(40));
    boolean bandera = true;
    // Mientras la bandera sea true el programa estara ejecutandose
    while(bandera){
      bandera = estados.inicializarEstado();
    }
  }
}
