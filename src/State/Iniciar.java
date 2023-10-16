import java.util.Scanner; 
public class Iniciar {
  CheemsMark chemsito; 
  Hashmap<String, User> map;

  public Iniciar(CheemsMark chemsito){
    this.chemsito = chemsito;
    this.map = new Hashmap<String, User>();
  }

  public void ingresar(){
    throw new UnSupportedOperationException();
  }
  public void verCatalogo(){
    throw new UnSupportedOperationException(); 
  }
  public void comprar(){
    throw new UnSupportedOperationException(); 
  }
  public void cerrarSesion(){
    throw new UnSupportedOperationException();
  }
  public void IniciarSesion(){
    Scanner in = new Scanner(System.in);
    System.out.println(chemsito.getUsuario().getIdioma().saludar());
    System.out.println(chemsito.getUsuario().getIdioma().ingresarUsuario());
    String nombre = in.nextLine();
    System.out.println(chemsito.getUsuario().getIdioma().ingresarContrasenia());
    String contrasenia = in.nextLine();
    if(map.get(nombre).validarUsuario(contrasenia))
      chemsito.setEstado(chemsito.getIniciarSesion());
    else 
      System.err.println("Tu usuario y/o contrasenia es incorrecta");
  }
  public void salir(){
    System.out.println(chemsito.getUsuario().getIdioma().despedirse());
  }
}
