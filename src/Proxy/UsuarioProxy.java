package Proxy;

import Strategy.Espania;
import Strategy.Idioma;
import Strategy.Ingles;
import Strategy.Latino;

public class UsuarioProxy implements User{
  String nombre; 
  String contrasenia; 
  String telefono; 
  String direccion; 
  String pais;
  int dinero; 
  User user; 
  Idioma idioma; 

  /*Constructor de la clase 
   *
   *  @param User usuario 
   * */
  public UsuarioProxy(User usuario){
    this.user = usuario;
    this.nombre = usuario.getNombre();
    this.telefono = usuario.getTelefono();
    this.direccion = usuario.getDireccion();
    this.dinero = usuario.getDinero();
    this.idioma = usuario.getIdioma();
    this.pais = usuario.getPais();
  }
  /*getters de la clase*/
  public String getNombre(){
    return this.nombre; 
  }
  public String getPais(){ return this.pais; }
  public String getDireccion(){ return this.direccion; }

  /* Metodo que valida la cuenta con el User de la clase 
   *
   *  @param int cuenta 
   *
   *  @return boolean correspondiente a la validacion de la cuenta 
   * */
  public boolean validarCuenta(int cuenta){ return user.validarCuenta(cuenta); }

  /*getters de la clase*/
  public Idioma getIdioma(){    return this.idioma;  }
  public String getTelefono(){ return this.telefono; }
  public int getDescuento(){ return user.getDescuento(); }
  public int getDinero(){ return this.dinero; }

  /* actualiza los datos correspondientes en la clase 
   *
   *  @param String nombre 
   *         String pais
   *         String direccion;
   * */
  public void actualizarDatos(String nombre, String pais, String direccion){
    this.nombre = nombre; 
    this.pais = pais;
    cambiarIdioma(pais);
    this.direccion = direccion;
  }

  /*Cambia el idioma del usuario correspondiente al pais
   *
   * @param String pais
   * */
  
  private void cambiarIdioma(String pais){
    switch(pais){
      case "Mexico":
        this.idioma = new Latino();
        break; 
      case "Espania": 
        this.idioma = new Espania();
        break;
      case "Estados Unidos": 
        this.idioma = new Ingles();
        break;
    }
  }

  /* Actualiza los datos en el usuario real */
  public void actualizarDatosReal(){
    user.actualizarDatos(this.nombre, this.pais, this.direccion);
  }

  /* actualiza la contrasenia por la recibida 
   *
   * @param String contrasenia
   * */
  public void actualizarContrasenia(String contrasenia){
    this.contrasenia = contrasenia; 
  }

  /* actuaiza la contrasenia en el usuario real*/
  public void actualizarContraseniaReal(){
    user.actualizarContrasenia(this.contrasenia);
  }

  /*actualiza el dinero en la clase
   *
   *  @param int dinero
   * */
  public void actualizarDinero(int dinero){
    this.dinero = dinero; 
  }

  /* Actualiza el dinero en el usuario real*/ 
  public void actualizarDineroReal(){
    user.actualizarDinero(this.dinero);
  }

  /* Valida si la contrasenia ingresada es la correcta 
   *
   *  @param String contrasenia
   *
   *  @return boolean correspondiente a si la contrasenia es correcta 
   * */
  @Override
  public boolean validarUsuario(String contrasenia) {
    return user.validarUsuario(this.contrasenia);
  }
}
