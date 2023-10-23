package Proxy;

import java.io.Serializable;
import Strategy.Idioma;

public interface User extends Serializable {

  public String getNombre();
  public String getPais();
  public String getDireccion();
  public int getDinero();
  public boolean validarCuenta(int cuenta);
  public boolean validarUsuario(String contrasenia);
  public Idioma getIdioma();
  public String getTelefono();
  public int getDescuento();
  public void actualizarDatos(String nombre, String pais, String direccion);
  public void actualizarContrasenia(String contrasenia);
  public void actualizarDinero(int dinero);
}
