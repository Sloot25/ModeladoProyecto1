package State;

import Composite.MenuDepartamental;
import java.util.Scanner;

public class Catalogo implements EstadoMark{
  CheemsMark chemsito;
  MenuDepartamental menu;
  public Catalogo(CheemsMark chemsito){
    this.chemsito = chemsito;
  }  
  public boolean inicializarEstado(){
    //System.out.println(chemsito.getUsuario().getIdioma().verCatalogo());
    menu = new MenuDepartamental(chemsito.getUsuario());
    System.out.println(menu.getMenu());
    Scanner in = new Scanner(System.in);
    while(true){
      try{
        System.out.println(chemsito.getUsuario().getIdioma().opciones());
        String tmp = in.nextLine();
        int op = Integer.parseInt(tmp);
        switch (op) {
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
            break;
        }
      }catch(NumberFormatException e){
        System.err.println(chemsito.getUsuario().getIdioma().noEsNumero());
      }
    }
  }
  public boolean verCatalogo(){
    System.out.println(chemsito.getUsuario().getIdioma().repeticionCatalogo());
    return true;
  }
  public boolean comprar(){
    chemsito.setEstado(chemsito.getEstadoComprar());
    return true;
  }
  public boolean cerrarSesion(){
    chemsito.setEstado(chemsito.getEstadoIniciar());
    System.out.println(chemsito.getUsuario().getIdioma().cerrarSesion());
    return true;
  }
  public boolean iniciarSesion(){
    System.out.println(chemsito.getUsuario().getIdioma().sesionIniciada());
    return true;
  }
  public boolean salir(){
    System.out.println(chemsito.getUsuario().getIdioma().despedirse());
    chemsito.getBaseUsuarios().guardarArchivos();
    return false;
  }
}
