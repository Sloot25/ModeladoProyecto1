package State;

import Composite.MenuDepartamental;

public class Catalogo implements EstadoMark{
  CheemsMark chemsito;
  MenuDepartamental menu;
  public Catalogo(CheemsMark chemsito){
    this.chemsito = chemsito;
  }  
  public void inicializarEstado(){
    System.out.println(chemsito.getUsuario().getIdioma().opciones());
    System.out.println(menu.getMenu());
  }
  public void verCatalogo(){
    System.out.println(chemsito.getUsuario().getIdioma().repeticionCatalogo());
  }
  public void comprar(){
    chemsito.setEstado(chemsito.getEstadoComprar());
    chemsito.inicializarEstado();
  }
  public void cerrarSesion(){
    chemsito.setEstado(chemsito.getEstadoIniciar());
    System.out.println(chemsito.getUsuario().getIdioma().cerrarSesion());
  }
  public void iniciarSesion(){
    System.out.println(chemsito.getUsuario().getIdioma().sesionIniciada());
  }
  public void salir(){
    System.out.println(chemsito.getUsuario().getIdioma().despedirse());
  }
}
