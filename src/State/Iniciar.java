package State;
import Proxy.User;
import java.util.HashMap;
import java.util.Scanner;

public class Iniciar implements EstadoMark{
  CheemsMark chemsito; 
  HashMap<String, User> map;

  public Iniciar(CheemsMark chemsito){
    this.chemsito = chemsito;
    this.map = new HashMap<String, User>();
  }

  public void inicializarEstado(){
    throw new UnsupportedOperationException();
  }
  public void ingresar(){
    throw new UnsupportedOperationException();
  }
  public void verCatalogo(){
    throw new UnsupportedOperationException(); 
  }
  public void comprar(){
    throw new UnsupportedOperationException(); 
  }
  public void cerrarSesion(){
    throw new UnsupportedOperationException();
  }
  public void IniciarSesion(){
    try (Scanner in = new Scanner(System.in)) {
      System.out.println("****************************************");
      System.out.println("*                                      *");
      System.out.println("*        Bienvenido a CheemsMark       *");
      System.out.println("*                                      *");
      System.out.println("****************************************\n");
      System.out.println("Por favor, ingrese su usuario: ");
      String nombre = in.nextLine();
      System.out.println("Por favor, ingrese su contraseña: ");
      String contrasenia = in.nextLine();
      if(map.get(nombre).validarUsuario(contrasenia)){
        chemsito.setEstado(chemsito.getEstadoIniciarSesion());
        chemsito.inicializarEstado();
      }
      else{ 
        System.err.println("Tu usuario y/o contrasenia es incorrecta");
      }
    }
  }
  public void salir(){
    System.out.println("Finalizando el programa...");
  }
}
  






