package State;

import java.util.Scanner;
import Composite.MenuDepartamental;


public class Comprar implements EstadoMark{
  CheemsMark chemsito;
  MenuDepartamental menu;
  ArrayList<CatalogoComponente> carrito;
  public Comprar(CheemsMark chemsito){
    this.chemsito = chemsito;
    this.carrito = new ArrayList<CatalogoComponente>();
  }
  public void inicializarEstado(){
    Scanner in = new Scanner(System.in);
    System.out.println(chemsito.getUsuario().getIdioma().bienvenidaCompra());
    System.out.println(menu.getMenu());
    agregarCarrito();
    pagarCarrito();
  }

  private void pagarCarrito(){
    Scanner in = new Scanner(System.in);
    while(true){
      try{
        System.out.println(chemsito.getUsuario().getIdioma().costo() + calcularPrecio());
        System.out.println(chemsito.getUsuario().getIdioma().continuarCompra());
        String tmp = in.nextLine();
        int opcion = Integer.parseInt(tmp);
        switch (opcion) {
          case 1:
            chemsito.setEstado(chemsito.getEstadoCompraSegura());
            this.carrito = new ArrayList<CatalogoComponente>();
            break;
          case 2:
            inicializarEstado();
            break;
          default:
            System.out.println(chemsito.getUsuario().getIdioma().escogeOpcion());
            break;
        }
      }catch(NumberFormatException e){
        System.err.println(chemsito.getUsuario().getIdioma().noEsNumero());
      }

    }
    in.close();
  }

  private void agregarCarrito(){
    Scanner in = new Scanner(System.in);
    while(true){
      try{
        System.out.println(chemsito.getUsuario().getIdioma().seguirComprando());
        String tmp = in.nextLine();
        int numeroItem = Integer.parseInt(tmp);
        if(numeroItem == 1)
          return;
        this.carrito.add(menu.getChild(numero));
      }catch(NumberFormatException e){
        System.err.println(chemsito.getUsuario().getIdioma().noEsNumero());
      }catch(CodigoIncorrectoException e){
        System.err.println(chemsito.getUsuario().getIdioma().codigoIncorrecto());
      }
    }
    in.close();
  }

  private int calcularPrecio(){
    int precio = 0; 
    for(CatalogoComponente item : carrito)
      precio += item.getPrecio();
    return precio;
  }

  public void verCatalogo(){
    chemsito.setEstado(chemsito.getEstadoVerCatalogo());
    chemsito.inicializarEstado();
  }

}
