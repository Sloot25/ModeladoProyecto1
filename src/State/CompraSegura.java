package State; 
import java.util.Scanner;
import Proxy.UsuarioProxy;
public class CompraSegura implements EstadoMark{
  CheemsMark chemsito; 
  int precio;
  int intentos;
  /* Metodo correspondiente a realizar las acciones adecuadas de la clase 
   * Si son 3 iteraciones o mas el usuario se encontrara baneado 
   * si no esta baneado, intentara validar la banca para reakizar la compra, si lo consigue regresa true 
   *
   * @return boolean correspondiente a si el programa sigue corriendo 
   *
   * */
  public boolean inicializarEstado(){
    System.out.println(chemsito.getUsuario().getIdioma().iniciandoCompra());
    if(intentos >= 3){
      return banearUsuario();
    }
    else 
      return validarBanca();
  }

  /* Metodo correspondiente a la validacion de las bancas 
   * Valida la banca, si el usuario falla en la verificacion lo vuelve a intentar, este tiene 3 intentos, si no 
   * lo consigue el usuario se ira baneado
   *
   *  @return boolean correspondiente a si el usuario logro la validacion de su cuenta
   * */
  private boolean validarBanca(){
    Scanner in = new Scanner(System.in);
    while(true){
      try{
        String tmp = in.nextLine();
        int banca = Integer.parseInt(tmp);
        if(chemsito.getUsuario().validarCuenta(banca)){
          chemsito.getUsuario().actualizarDinero(chemsito.getUsuario().getDinero()- this.precio);
          return finalizarCompra();
        }else{
          intentos++;
          return inicializarEstado();
        }
      }catch(NumberFormatException e){
        intentos++;
        System.out.println(chemsito.getUsuario().getIdioma().noEsNumero());
      }
    }
  }
  /* Metodo correspondiente a finalizar la compra, actualiza los datos 
   * en el usuario y agradece por la compra 
   *
   * Muestra nuevamente el menu
   * 
   * @return boolean correspondiente a si el programa sigue corriendo 
   * */
  private boolean finalizarCompra(){
    System.out.println(chemsito.getUsuario().getIdioma().compraFinalizada());
    ((UsuarioProxy)chemsito.getUsuario()).actualizarDineroReal();
    System.out.println(chemsito.getUsuario().getIdioma().opciones());
    Scanner in = new Scanner(System.in);
    while(true){
      try{
        String tmp = in.nextLine();
        int opcion = Integer.parseInt(tmp);
        switch (opcion) {
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

  /* Metodo correspondiente al ban del usuario 
   *
   * @return false porque un usuario baneado ya no puede hacer nada 
   * */
  
  private boolean banearUsuario(){
    System.out.println(chemsito.getUsuario().getIdioma().baneado()); 
    chemsito.getBaseUsuarios().banearUsuario(chemsito.getUsuario());
    chemsito.getBaseUsuarios().guardarArchivos();
    chemsito.getBaseUsuarios().leerArchivos();
    return false;
  }

  /* Constructor de la clase 
   * 
   * @param Recibe un objeto de tipo CheemsMark
   * */
  public CompraSegura(CheemsMark chemsito){
    this.chemsito = chemsito;
  }

  /*Setea los intentos que lleva el usuario en ingresar su cuenta */
  public void setIntentos(int intento){
    this.intentos = intento;
  }

  /*set del precio */
  public void setPrecio(int precio){
    this.precio = precio;
  }

  /*metodos encargados del cambio de estados 
   *
   * @return boolean correspondiente a si el programa sigue ejecutandosej
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
  public boolean salir(){
    System.out.println(chemsito.getUsuario().getIdioma().despedirse());
    chemsito.getBaseUsuarios().guardarArchivos();
    return false;
  }
  public boolean iniciarSesion(){
    throw new UnsupportedOperationException();
  }
}
