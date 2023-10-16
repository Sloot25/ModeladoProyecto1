public class IniciarSesion {
  CheemsMark chemsito; 

  public IniciarSesion(CheemsMark chemsito){
    this.chemsito = chemsito;
  }
  public void inicializarEstado(){
    System.out.println(chemsito.getUsuario().getIdioma().saludoInicio());
    System.out.print(chemsito.getUsuario().getIdioma().descuento());
    System.out.println(" " + chemsito.getUsuario().getDescuento());
  }

  public void verCatalogo(){
    chemsito.setEstado(chemsito.getEstadoVerCatalogo());
    chemsito.incializarEstado(); 
  }
  public void comprar(){
    chemsito.setEstado(chemsito.getEstadoComprar());
    chemsito.inicializarEstado();
  }
  public void cerrarSesion(){
    chemsito.setEstado(chemsito.getEstadoIniciar()); 
    System.out.println(chemsito.getUsuario().getIdioma().cerrarSesion());
    chemsito.inicializarEstado();
  }
  public void IniciarSesion(){
    System.out.println(chemsito.getUsuario().getIdioma().sesionIniciada());
  }
  public void salir(){
    System.out.println(chemsito.getUsuario().getIdioma().despedirse());
  }
}
