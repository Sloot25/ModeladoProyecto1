package State;
import java.util.Scanner;
import Composite.MenuDepartamental;

public class IniciarSesion implements EstadoMark{
  CheemsMark chemsito;
  MenuDepartamental catalogo = new MenuDepartamental(chemsito); 

  public IniciarSesion(CheemsMark chemsito){
    this.chemsito = chemsito;
  }
  public void inicializarEstado(){
    System.out.println(chemsito.getUsuario().getIdioma().saludar());
    try (Scanner in = new Scanner(System.in)) {
      while(true){
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
            verCatalogo();
          break;
        case 2:
            comprar();
          break;
        case 3:
          cerrarSesion();
          break;
        case 4:
            salir();
          break;
        default:
          System.out.println(chemsito.getUsuario().getIdioma().escogeOpcion());
        }
      }
    }
  }

  public void verCatalogo(){
    chemsito.setEstado(chemsito.getEstadoVerCatalogo());
    chemsito.inicializarEstado();
  }
  public void comprar(){
    chemsito.setEstado(chemsito.getEstadoComprar());
    chemsito.inicializarEstado();
  }
  public void cerrarSesion(){
    chemsito.setEstado(chemsito.getEstadoIniciar()); 
    chemsito.inicializarEstado();
  }
  public void iniciarSesion(){
    throw new UnsupportedOperationException();
  }
  public void salir(){
    System.out.println(chemsito.getUsuario().getIdioma().despedirse());
  }
}
