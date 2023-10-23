package State;
import java.util.Scanner;
import Composite.CatalogoComponente;

public class IniciarSesion implements EstadoMark{
  CheemsMark chemsito;

  public IniciarSesion(CheemsMark chemsito){
    this.chemsito = chemsito;
  }
  public boolean inicializarEstado(){
    System.out.println(chemsito.getUsuario().getIdioma().saludar());
    System.out.println(chemsito.getUsuario().getIdioma().ofertas() + chemsito.getUsuario().getDescuento());
    Scanner in = new Scanner(System.in);
    while(true){
      System.out.println(chemsito.getUsuario().getIdioma().opciones());
    String opcionUsuario = in.nextLine();
    int opcion; 
    try {
        opcion = Integer.parseInt(opcionUsuario);
    } catch (NumberFormatException e) {
      System.out.println(chemsito.getUsuario().getIdioma().noEsNumero());
        continue;
    }
    switch(opcion){
      case 1:
        return verCatalogo();
      case 2:
        return comprar();
      case 3:
        return cerrarSesion();
      case 4:
        return salir();
      default:
        System.out.println(chemsito.getUsuario().getIdioma().escogeOpcion());
      }
    }
  }

  public boolean verCatalogo(){
    chemsito.setEstado(chemsito.getEstadoVerCatalogo());
    return true;
  }
  public boolean comprar(){
    chemsito.setEstado(chemsito.getEstadoComprar());
    return true;
  }
  public boolean cerrarSesion(){
    chemsito.setEstado(chemsito.getEstadoIniciar()); 
    return true;
  }
  public boolean iniciarSesion(){
    throw new UnsupportedOperationException();
  }
  public boolean salir(){
    System.out.println(chemsito.getUsuario().getIdioma().despedirse());
    chemsito.getBaseUsuarios().guardarArchivos();
    return false;
  }
}
