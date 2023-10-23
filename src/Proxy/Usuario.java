package Proxy;

import Observer.DescuentoEU;
import Observer.DescuentoEspania;
import Observer.DescuentoLatam;
import Observer.RegionDescuento;
import Observer.Observer;
import Strategy.Espania;
import Strategy.Idioma;
import Strategy.Ingles;
import Strategy.Latino;

public class Usuario implements User, Observer {
  String nombre; 
  RegionDescuento regionDescuento; 
  int descuento;
  String contrasenia; 
  String telefono; 
  String direccion; 
  int cuenta; 
  int dinero;
  String pais; 
  Idioma idioma;
  BDUsuarios base;

  /*Constructor de la clase 
   *
   * @param String nombre del usuario 
   *        String contrasenia del usuario 
   *        String telefono del usuario
   *        String direccion del usuario 
   *        String pais del usuario 
   *        int cantidad de dinero 
   *        int cuenta bancaria 
   *        BDUsuarios base de datos
   *        
   * */
  public Usuario(String nombre, String contrasenia, String telefono, String direccion, String pais, int dinero, int cuenta, BDUsuarios base){
    this.nombre = nombre; 
    this.contrasenia = contrasenia; 
    this.telefono = telefono;
    this.direccion = direccion;
    this.pais = pais;
    this.cuenta = cuenta; 
    this.dinero = dinero;
    this.base = base;
    cambiarIdioma(pais);
  }

  /* Metodo encargado de cambiar el idioma segun el pais de procedencia 
   * @param String pais de procedencia 
   * */
  private void cambiarIdioma(String pais){
    switch (pais) {
      case "Mexico":
        this.idioma = new Latino();
        this.regionDescuento = base.getRegion(2);
        base.getRegion(2).registerObserver(this);
        break;
      case "Espania":
        this.idioma = new Espania();
        this.regionDescuento = base.getRegion(0);
        base.getRegion(0).registerObserver(this);
        break;
      case "Estados Unidos":
        this.idioma = new Ingles();
        this.regionDescuento = base.getRegion(1);
        base.getRegion(1).registerObserver(this);
      default:
        break;
    }
  }
  /* getters de la clase */
  public Idioma getIdioma(){ return this.idioma; }
  public String getNombre(){ return this.nombre; }
  public String getPais(){ return this.pais; }
  public String getDireccion(){ return this.direccion; }

  /*  @param int cuenta ingresada
   * 
   * @return boolean correspondiente a si la cuenta ingresada y la del usuario son la misma*/
  public boolean validarCuenta(int cuenta){
    return cuenta == this.cuenta; 
  }

  /*getter dinero*/
  public int getDinero(){ return this.dinero; }

  /*  @param String contrasenia
   *
   *  @return boolean correspondiente a validar la contrasenia
   * */
  public boolean validarUsuario(String contrasenia){
    return this.contrasenia.equals(this.contrasenia);
  }

  /*getter telefono*/
  public String getTelefono(){ 
    return this.telefono;
  }

  /*getter descuento*/
  public int getDescuento(){
    return this.descuento;
  }

  /*Metodo encargado de actualizar los atributos recibidos 
   *
   *  @param String nombre 
   *        String pais
   *        String direccion
   * */
  public void actualizarDatos(String nombre, String pais, String direccion){
    this.nombre = nombre; 
    this.pais = pais; 
    this.direccion = direccion;
    cambiarIdioma(pais);
  }

  /*  Metodo encargado de actualizar los atributos recibidos
   *
   * @param String contrasenia
   * */
  public void actualizarContrasenia(String contrasenia){
    this.contrasenia = contrasenia;
  }

  /*  Metodo encargado de actualizar el dinero de la cuenta
   *
   *  @param int dinero
   * */
  public void actualizarDinero(int dinero){
    this.dinero = dinero;
  }

  /*  Metodo encargado de actualizar el descuento del usuario 
   *
   *  @param int descuento
   *  */
  public void actualizarDescuento(int descuento){
    this.descuento = descuento;
  }
}
