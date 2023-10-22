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

  public boolean inicializarEstado(){
    System.out.println("****************************************");
    System.out.println("*                                      *");
    System.out.println("*        Bienvenido a CheemsMark       *");
    System.out.println("*                                      *");
    System.out.println("****************************************\n");
    while(true){
      try{
        Scanner in = new Scanner(System.in);
        System.out.println("1. Iniciar Sesion");
        System.out.println("2. Salir");
        String tmp = in.nextLine();
        int op = Integer.parseInt(tmp);
        switch (op) {
          case 1:
            return IniciarSesion();
          case 2: 
            return salir();
          default:
            System.err.println("Elige una opcion valida");
            break;
        }
      }catch(NumberFormatException e){
        System.err.println("Debes ingresar un numero");
      }
    }
  }
  public boolean ingresar(){
    throw new UnsupportedOperationException();
  }
  public boolean verCatalogo(){
    throw new UnsupportedOperationException(); 
  }
  public boolean comprar(){
    throw new UnsupportedOperationException(); 
  }
  public boolean cerrarSesion(){
    throw new UnsupportedOperationException();
  }
  public boolean IniciarSesion(){
    Scanner in = new Scanner(System.in);
    System.out.println("Por favor, ingrese su usuario: ");
    String nombre = in.nextLine();
    System.out.println("Por favor, ingrese su contraseña: ");
    String contrasenia = in.nextLine();
    if(chemsito.getBaseUsuarios().validarUsuario(nombre, contrasenia) && chemsito.getBaseUsuario().usuarioPerimitido()){
      chemsito.setEstado(chemsito.getEstadoIniciarSesion());
      chemsito.inicializarEstado();
      chemsito.setUsuario(chemsito.getBaseUsuarios().getUser(nombre));
    }else if(chemsito.getBaseUsuarios().validarUsuario(nombre)){
      System.err.println("El usuario no está permitido");
      System.out.println("Procederemos a salir");
      return false;
    } else{ 
      System.err.println("Tu usuario y/o contrasenia es incorrecta");
    }
    return true;
  }
  public boolean salir(){
    System.out.println("Finalizando el programa...");
    chemsito.getBaseUsuarios().guardarArchivos();
    return false;
  }
}
  






