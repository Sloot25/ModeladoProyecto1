package State;
import Proxy.User;
import java.util.HashMap;
import java.util.Scanner;

public class Iniciar implements EstadoMark{
  CheemsMark chemsito; 

  /* Constructor de la clase 
   * 
   * @param Recibe un objeto de tipo CheemsMark
   * */
  public Iniciar(CheemsMark chemsito){
    this.chemsito = chemsito;
  }

  /*Metodo encargado de realizar las acciones correspondientes de cada estado 
   *  Realiza un saludo y permite el inicio de sesion del usuario, asi como la salida de la aplicacion 
   *
   *  @return boolean Correspondiente a si el programa sigue corriendo 
   * */
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
  /* Metodos correspondientes al cambio de estado 
   *
   * @return boolean Correspondiente a saber si el programa sigue corriendo
   * */
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

  /*Realiza el inicio de sesion verificando si el usuario se encuentra en la base 
   * asi como si el usuario no se encuentra baneado de la base 
   * Si el usuario es vaido ingresa al resto del programa 
   *
   *  @return boolean correspondiente a si el programa sigue corriendo
   * */
  public boolean IniciarSesion(){
    Scanner in = new Scanner(System.in);
    System.out.println("Por favor, ingrese su usuario: ");
    String nombre = in.nextLine();
    System.out.println("Por favor, ingrese su contraseña: ");
    String contrasenia = in.nextLine();
    if(chemsito.getBaseUsuarios().validarUsuario(nombre, contrasenia) && chemsito.getBaseUsuarios().usuarioPermitido(nombre)){
      chemsito.setEstado(chemsito.getEstadoIniciarSesion());
      ((CompraSegura)chemsito.getEstadoCompraSegura()).setIntentos(0);
      chemsito.setUsuario(chemsito.getBaseUsuarios().getUsuario(nombre));
    }else if(chemsito.getBaseUsuarios().validarUsuario(nombre, contrasenia)){
      System.err.println("El usuario no está permitido");
      System.out.println("Procederemos a salir");
      return false;
    } else{ 
      System.err.println("Tu usuario y/o contrasenia es incorrecta");
    }
    return true;
  }
  /*  Sale del programa
   *
   *  @return boolean correspondiente a si el programa sigue corriendo*/
  public boolean salir(){
    System.out.println("Finalizando el programa...");
    chemsito.getBaseUsuarios().guardarArchivos();
    return false;
  }
}
  






