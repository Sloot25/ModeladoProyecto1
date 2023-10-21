package State;
import java.util.Scanner;
import Composite.CatalogoComponente;
import Composite.MenuDepartamental;

public class IniciarSesion implements EstadoMark{
  CheemsMark chemsito;
  MenuDepartamental catalogo = new MenuDepartamental(chemsito); 

  public IniciarSesion(CheemsMark chemsito){
    this.chemsito = chemsito;
  }
  public void inicializarEstado(){
    System.out.println(chemsito.getUsuario().getIdioma().saludar());
    Scanner in = new Scanner(System.in);
    while(true){
    String opcionUsuario = in.nextLine();
    int opcion; 
    try {
        opcion = Integer.parseInt(opcionUsuario);
    } catch (NumberFormatException e) {
      System.out.println("Error: Debe ingresar un número entero. Intente nuevamente.");
        continue;
    }
    switch(opcion){
      case 1:
        chemsito.setEstado(chemsito.getEstadoVerCatalogo());
        break;
      case 2:
        chemsito.setEstado(chemsito.getEstadoComprar());
        break;
      case 3:
        chemsito.setEstado(chemsito.getEstadoCerrarSesion());
        break;
      case 4:
        chemsito.setEstado(chemsito.getEstadoSalir());;
        break;
      default:
        System.out.println("Error. Debe ingresar una opcion valida.");
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
