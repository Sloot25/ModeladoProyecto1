package State;

import java.util.ArrayList;
import java.util.Scanner;
import Composite.MenuDepartamental;
import Composite.CatalogoComponente;
import Composite.CodigoIncorrectoException;


public class Comprar implements EstadoMark{
  CheemsMark chemsito;
  MenuDepartamental menu;
  ArrayList<CatalogoComponente> carrito;

  /* Constructor de la clase 
   * 
   * @param Recibe un objeto de tipo CheemsMark
   * */
  public Comprar(CheemsMark chemsito){
    this.chemsito = chemsito;
    this.carrito = new ArrayList<CatalogoComponente>();
  }
  /*  Metodo que se encarga de las acciones correspondientes al estado 
   * Imprime el catalogo, al mismo tiempo que da la bienvenida y permite el ingreso de articulos al carrito 
   *
   *  @return boolean correspondiente a sigue el programa sigue ejecutandose 
   * */
  public boolean inicializarEstado(){
    menu = new MenuDepartamental(chemsito.getUsuario());
    Scanner in = new Scanner(System.in);
    System.out.println(chemsito.getUsuario().getIdioma().bienvenidaCompra());
    System.out.println(menu.getMenu());
    agregarCarrito();
    if(calcularPrecio() == 0)
      return iniciarSesion();
    return pagarCarrito();
  }

  /* @return Regresa una cadena correspndiente al carrito de compra*/
  private String imprimitCarrito(){
    String res = "";
    for(CatalogoComponente item : carrito)
      res += item.print("  ");
    return res;
  }

  /*  Metodo correspondiente  a pagar el carrito, muestra opciones para pagar, seguir comprando o cancelar la compra
   *
   *  @return boolean correspondiente a si el programa se sigue ejecutando
   * */
  private boolean pagarCarrito(){
    Scanner in = new Scanner(System.in);
    while(true){
      try{
        System.out.println(chemsito.getUsuario().getIdioma().entrega());
        System.out.println(imprimitCarrito());
        System.out.println(chemsito.getUsuario().getIdioma().costo() + calcularPrecio());
        System.out.println(chemsito.getUsuario().getIdioma().continuarCompra());
        String tmp = in.nextLine();
        int opcion = Integer.parseInt(tmp);
        switch (opcion) {
          case 1:
            chemsito.setEstado(chemsito.getEstadoCompraSegura());
            ((CompraSegura)chemsito.getEstado()).setPrecio(calcularPrecio());
            this.carrito = new ArrayList<CatalogoComponente>();
            return true;
          case 2:
            inicializarEstado();
            return true;
          case 3: 
            return iniciarSesion();
            
          default:
            System.out.println(chemsito.getUsuario().getIdioma().escogeOpcion());
            break;
        }
      }catch(NumberFormatException e){
        System.err.println(chemsito.getUsuario().getIdioma().noEsNumero());
      }

    }
  }

  /* Devuelve al estado inicial del menu 
   * @return boolean correspondiente a si el programa se sigue ejecutando
   * */
  public boolean iniciarSesion(){
    chemsito.setEstado(chemsito.getEstadoIniciarSesion());
    return true;
  }
  /* Metodo encargado de agregar articulos al carrito*/
  private void agregarCarrito(){
    Scanner in = new Scanner(System.in);
    while(true){
      try{
        System.out.println(chemsito.getUsuario().getIdioma().seguirComprando());
        String tmp = in.nextLine();
        int numeroItem = Integer.parseInt(tmp);
        if(numeroItem == 1)
          return;
        this.carrito.add(menu.getChild(numeroItem));
      }catch(NumberFormatException e){
        System.err.println(chemsito.getUsuario().getIdioma().noEsNumero());
      }catch(CodigoIncorrectoException e){
        System.err.println(chemsito.getUsuario().getIdioma().codigoIncorrecto());
      }
    }
  }

  /* @return int correspondiente al precio actual del carrito*/
  private int calcularPrecio(){
    int precio = 0; 
    for(CatalogoComponente item : carrito)
      precio += item.getPrecio();
    return precio;
  }
  /*  Metodos de cambio de estado
   *
   * @return boolean correspondiente a si el estado sigue ejecutandose */
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
  public boolean salir(){
    System.out.println(chemsito.getUsuario().getIdioma().despedirse());
    chemsito.getBaseUsuarios().guardarArchivos();
    return false;
  }
  

}
