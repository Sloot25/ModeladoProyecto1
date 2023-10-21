package State;

import java.util.Scanner;
import Composite.MenuDepartamental;


public class Comprar implements EstadoMark{
  CheemsMark chemsito;
  MenuDepartamental menu;
  public Comprar(CheemsMark chemsito){
    this.chemsito = chemsito;
  }
  public void inicializarEstado(){
    Scanner in = new Scanner(System.in);
    System.out.println(chemsito.getUsuario().getIdioma().bienvenidaCompra());
    System.out.println(menu.getMenu());
    int precio = 0;
    while(precio ==  0){
      try{
        String numeroItem = in.nextLine();
        int numero = Integer.parseInt(numeroItem);
        precio = menu.getChild(numero).getPrecio();
      }catch (NumberFormatException ex){
        System.err.println("Ese no es un numero");
      }catch(CodigoIncorrectoException e){
        System.err.println(e);
      }
    }
    System.out.println(chemsito.getUsuario().getIdioma().costo() + precio);
    System.out.println(chemsito.getUsuario().getIdioma().continuarCompra());
    while(true){
      try{
      String tmp = in.nextLine(); 
      int opcion = Integer.parseInt(tmp);
      if(opcion == 1)
        chemsito.setEstado(chemsito.getEstadoCompraSegura());
      else if(opcion == 2)
        inicializarEstado();
      }
    }
  }

  public void verCatalogo(){
    chemsito.setEstado(chemsito.getEstadoVerCatalogo());
    chemsito.inicializarEstado();
  }

}
