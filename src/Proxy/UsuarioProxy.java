package Proxy; 

public class UsuarioProxy implements User{
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
    this.nombre; 
  }
  public String getPais(){ return this.pais; }
  public String getDireccion(){ return this.direccion; }
  public boolean validarCuenta(int cuenta){ return usuario.validarCuenta(cuenta); }
  public Idioma getIdioma(){
    return this.idioma;
  }
  public String getTelefono(){ return this.telefono; }
  public String getDescuento(){ return usuario.getDescuento(); }
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
    usuario.actualizarDatos(this.nombre, this.pais, this.direccion);
  }
  public void actualizarContrasenia(String contrasenia){
    this.contrasenia = contrasenia; 
  }
  public void actualizarContraseniaReal(){
    usuario.actualizarContrasenia(this.contrasenia);
  }
  public void actualizarDinero(int dinero){
    this.dinero = dinero; 
  }
  public void actualizarDineroReal(){
    usuario.actualizarDinero(this.dinero);
  }
}
