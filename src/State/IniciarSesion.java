package State;
import java.util.Scanner;
import Composite.CatalogoComponente;

public class IniciarSesion implements EstadoMark{
  CheemsMark chemsito;

  /* Constructor de la clase 
   * 
   * @param Recibe un objeto de tipo CheemsMark
   * */
  public IniciarSesion(CheemsMark chemsito){
    this.chemsito = chemsito;
  }

  /*  Metodo encargado de realizar las acciones correspondientes a cada estado
   *  Nos permite ingresar a alguno de los otros estados del Proyecto y nos 
   *  notifica de los descuentos
   *
   *  @return boolean Correspondiente a saber si seguimos dentro o fuera del programa
   * */
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

  /* Metodos correspondiente al cambio de estado 
   *
   *  @return boolean Correspondiente a si la aplicacion sigue corriendo en dicho estado 
   * */
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
