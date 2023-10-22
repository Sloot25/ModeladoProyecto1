package Proxy;

import Strategy.Espania;
import Strategy.Idioma;
import Strategy.Ingles;
import Strategy.Latino;

public class UsuarioProxy implements User {
  String nombre; 
  String contrasenia; 
  String telefono; 
  String direccion; 
  String pais;
  int dinero; 
  User user; 
  Idioma idioma; 

  public UsuarioProxy(User usuario){
    this.user = usuario;
    this.nombre = usuario.getNombre();
    this.telefono = usuario.getTelefono();
    this.direccion = usuario.getDireccion();
    this.dinero = usuario.getDinero();
    this.idioma = usuario.getIdioma();
    this.pais = usuario.getPais();
  }
  public String getNombre(){
    return this.nombre; 
  }
  public String getPais(){ return this.pais; }
  public String getDireccion(){ return this.direccion; }
  public boolean validarCuenta(int cuenta){ return user.validarCuenta(cuenta); }
  public Idioma getIdioma(){    return this.idioma;  }
  public String getTelefono(){ return this.telefono; }
  public int getDescuento(){ return user.getDescuento(); }
  public int getDinero(){ return this.dinero; }
  public void actualizarDatos(String nombre, String pais, String direccion){
    this.nombre = nombre; 
    this.pais = pais;
    cambiarIdioma(pais);
    this.direccion = direccion;
  }
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
  public void actualizarDatosReal(){
    user.actualizarDatos(this.nombre, this.pais, this.direccion);
  }
  public void actualizarContrasenia(String contrasenia){
    this.contrasenia = contrasenia; 
  }
  public void actualizarContraseniaReal(){
    user.actualizarContrasenia(this.contrasenia);
  }
  public void actualizarDinero(int dinero){
    this.dinero = dinero; 
  }
  public void actualizarDineroReal(){
    user.actualizarDinero(this.dinero);
  }
  @Override
  public boolean validarUsuario(String contrasenia) {
    return contrasenia.equals(this.contrasenia);
  }
  @Override
  public void actualizarDescuento(int descuento) {
    this.user.actualizarDescuento(descuento); 
  }
}
