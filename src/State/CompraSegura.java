package State;

import java.util.Scanner;

public class CompraSegura implements EstadoMark{
  CheemsMark chemsito; 
  int precio;
  int intentos;
  public void inicializarEstado(){
    System.out.println(chemsito.getUsuario().getIdioma().iniciandoCompra());
    if(intentos >= 3)
      banearUsuario();
    else 
      validarBanca();
  }

  private void validarBanca(){
    try (Scanner in = new Scanner(System.in)) {
        while(true){
          try{
            String tmp = in.nextLine();
            int banca = Integer.parseInt(tmp);
            if(chemsito.getUsuario().validarCuenta(banca)){
              chemsito.getUsuario().actualizarDinero(chemsito.getUsuario().getDinero()- this.precio);
              finalizarCompra();
            }else{
              intentos++;
              inicializarEstado();
            }
          }catch(NumberFormatException e){
            System.out.println(chemsito.getUsuario().getIdioma().noEsNumero());
          }
        }
    }
  }
  private void finalizarCompra(){
    System.out.println(chemsito.getUsuario().getIdioma().compraFinalizada());
    System.out.println(chemsito.getUsuario().getIdioma().opciones());
    try (Scanner in = new Scanner(System.in)) {
        while(true){
          try{
            String tmp = in.nextLine();
            int opcion = Integer.parseInt(tmp);
            switch (opcion) {
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
                break;
            }
            
          }catch(NumberFormatException e){
            System.err.println(chemsito.getUsuario().getIdioma().noEsNumero());
          }
        }
    }
  }
  private void banearUsuario(){
    System.out.println(chemsito.getUsuario().getIdioma().baneado()); 
  }
  public CompraSegura(CheemsMark chemsito){
    this.chemsito = chemsito;
  }
  public void setIntentos(int intento){
    this.intentos = intento;
  }
  public void setPrecio(int precio){
    this.precio = precio;
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
  public void salir(){
    System.out.println(chemsito.getUsuario().getIdioma().despedirse());
  }
  public void iniciarSesion(){
    throw new UnsupportedOperationException();
  }
}
