package State; 
import java.util.Scanner;
import Proxy.UsuarioProxy;
public class CompraSegura implements EstadoMark{
  CheemsMark chemsito; 
  int precio;
  int intentos;
  public boolean inicializarEstado(){
    System.out.println(chemsito.getUsuario().getIdioma().iniciandoCompra());
    if(intentos >= 3){
      return banearUsuario();
    }
    else 
      return validarBanca();
  }

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
  private boolean banearUsuario(){
    System.out.println(chemsito.getUsuario().getIdioma().baneado()); 
    chemsito.getBaseUsuarios().banearUsuario(chemsito.getUsuario());
    chemsito.getBaseUsuarios().guardarArchivos();
    chemsito.getBaseUsuarios().leerArchivos();
    return false;
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
