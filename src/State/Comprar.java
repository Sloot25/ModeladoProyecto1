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
  public Comprar(CheemsMark chemsito){
    this.chemsito = chemsito;
    this.carrito = new ArrayList<CatalogoComponente>();
  }
  public boolean inicializarEstado(){
    Scanner in = new Scanner(System.in);
    System.out.println(chemsito.getUsuario().getIdioma().bienvenidaCompra());
    System.out.println(menu.getMenu());
    agregarCarrito();
    return pagarCarrito();
  }

  private boolean pagarCarrito(){
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

  public boolean iniciarSesion(){
    chemsito.setEstado(chemsito.getEstadoIniciarSesion());
    return true;
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
        this.carrito.add(menu.getChild(numeroItem));
      }catch(NumberFormatException e){
        System.err.println(chemsito.getUsuario().getIdioma().noEsNumero());
      }catch(CodigoIncorrectoException e){
        System.err.println(chemsito.getUsuario().getIdioma().codigoIncorrecto());
      }
    }
  }

  private int calcularPrecio(){
    int precio = 0; 
    for(CatalogoComponente item : carrito)
      precio += item.getPrecio();
    return precio;
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
  public boolean salir(){
    System.out.println(chemsito.getUsuario().getIdioma().despedirse());
    chemsito.getBaseUsuarios().guardarArchivos();
    return false;
  }
  

}
