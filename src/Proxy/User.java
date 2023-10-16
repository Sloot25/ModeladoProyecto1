package Proxy; 

public interface User {
  public String getNombre();
  public String getPais();
  public String getDireccion();
  public boolean validarCuenta(int cuenta);
  public int getDinero();
  public boolean validarUsuario(String contrasenia);
  public Idioma getIdioma();
  public String getTelefono();
  public String getDescuento();
  public void actualizarDatos(String nombre, String pais, String direccion);
  public void actualizarContrasenia(String contrasenia);
  public void actualizarDinero(int dinero);
}
