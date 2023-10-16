package Usuario; 

public class Usuario implements User {
  String nombre; 
  RegionDescuento regionDescuento; 
  String descuento;
  String contrasenia; 
  String telefono; 
  int direccion; 
  int cuenta; 
  int dinero;
  String pais; 
  Idioma idioma;


  public Usuario(String nombre, String contrasenia, String telefono, String direccion, String pais, int dinero, int cuenta){
    this.nombre = nombre; 
    this.contrasenia = contrasenia; 
    this.telefono = telefono;
    this.direccion = direccion;
    this.pais = pais;
    this.cuenta = cuenta; 
    this.dinero = dinero;
    cambiarIdioma(pais);
  }
  private void cambiarIdioma(String pais){
    switch (pais) {
      case "Mexico":
        this.idioma = new Latino();
        this.regionDescuento = new DescuentoLatam();
        break;
      case "Espania":
        this.idioma = new Espania();
        this.regionDescuento = new DescuentoEspania();
        break;
      case "Estados Unidos"
        this.idioma = new Ingles();
        this.regionDescuento = new DescuentoEU();
      default:
        break;
    }
  }
  public Idioma getIdioma(){ return this.idioma; }
  public String getNombre(){ return this.nombre; }
  public String getPais(){ return this.pais; }
  public String getDireccion(){ return this.direccion; }
  public boolean validarCuenta(int cuenta){
    return cuenta == this.cuenta; 
  }
  public int getDinero(){ return this.dinero; }
  public boolean validarUsuario(String contrasenia){
    return contrasenia.equals(this.contrasenia);
  }
  public String getTelefono(){ return this.telefono; }
  public String getDescuento(){
    return this.descuento;
  }
  public void actualizarDatos(String nombre, String pais, String direccion){
    this.nombre = nombre; 
    this.pais = pais; 
    this.direccion = direccion;
    cambiarIdioma(pais);
  }
  public void actualizarContrasenia(String contrasenia){
    this.contrasenia = contrasenia;
  }
  public void actualizarDinero(int dinero){
    this.dinero = dinero;
  }
  public void actualizarDescuento(int descuento){
    this.descuento = descuento;
  }
}
