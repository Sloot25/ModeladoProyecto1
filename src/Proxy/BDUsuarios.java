package Proxy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.ArrayList;
import Observer.*;
import State.CheemsMark;

public class BDUsuarios implements Serializable{
  HashMap<String, User> usuarios;
  HashMap<String,User> usuariosBaneados;
  ArrayList<RegionDescuento> regiones;

  public BDUsuarios(){
    leerArchivos();
  }
    
  private void generarUsuarios(){
    User usuarioMexa2 = new UsuarioProxy(new Usuario("Juan",
                        "caldodepollo",
                        "5553525251",
                        "Riva Palacio 4, La Merced, CDMX",
                        "Mexico",
                        30000,
                        99995, this));
    User usuarioMexa1 = new UsuarioProxy(new Usuario("Helena",
                        "contrasenia",
                        "5556143112",
                        "Corona del Rosal Mz 25, Leon, Guanajuato",
                        "Mexico",
                        40000,
                        99303, this));
    User usuarioEspa1 = new UsuarioProxy(new Usuario("Manuel",
                        "password",
                        "3429527592",
                        "San Agustin 23, Madrid",
                        "Espania",
                        50000,
                        84445, this));
    User usuarioEspa2 = new UsuarioProxy(new Usuario("Martina Bolzanon",
                        "jamonserrano",
                        "3429527592",
                        "Av Horacio Carvajal 312, Granada",
                        "Estados Unidos",
                        45000,
                        84048, this));
    User usuarioEUA2 = new UsuarioProxy(new Usuario("John Smith",
                        "partyparty",
                        "8099237212",
                        "Av Siempre Viva 742, Springfield",
                        "Estados Unidos",
                        20000,
                        13335, this));
    User usuarioEUA1 = new UsuarioProxy(new Usuario("Catherine Paulson",
                        "oceans8",
                        "8021948562",
                        "Federal Hall 12, Brooklyn",
                        "Estados Unidos",
                        80000,
                        13853, this));
    
    usuarios.put(usuarioMexa1.getNombre(),usuarioMexa1);
    usuarios.put(usuarioEspa1.getNombre(),usuarioEspa1);
    usuarios.put(usuarioEUA1.getNombre(),usuarioEUA1);
    usuarios.put(usuarioMexa2.getNombre(),usuarioMexa2);
    usuarios.put(usuarioEspa2.getNombre(),usuarioEspa2);
    usuarios.put(usuarioEUA2.getNombre(),usuarioEUA2);
  }
    
  // Serialización
  public void guardarArchivos(){
    // Serializacion usuarios activos  
    try {
      // archivo donde guardamos el arreglo de usuarios serializado
      FileOutputStream archivoSalidaUsuarios = new FileOutputStream("usuarios.ser");
      ObjectOutputStream salidaUsuarios = new ObjectOutputStream(archivoSalidaUsuarios);
      salidaUsuarios.writeObject(this.usuarios); // enviamos el objeto Usuarios atraves del ObjectOutputStream
      salidaUsuarios.close();
      archivoSalidaUsuarios.close();
    } catch (IOException e) {
        e.printStackTrace();
    }

    // Serializacion usuarios baneados
    try {
      // archivo donde guardamos el arreglo de usuarios baneados serializado
      FileOutputStream archivoSalidaBaneados = new FileOutputStream("baneados.ser");
      ObjectOutputStream salidaBaneados = new ObjectOutputStream(archivoSalidaBaneados);
      salidaBaneados.writeObject(usuariosBaneados);
      salidaBaneados.close();
      archivoSalidaBaneados.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
    
    try{
      FileOutputStream archivosRegiones = new FileOutputStream("regiones.ser");
      ObjectOutputStream salidaRegiones = new ObjectOutputStream(archivosRegiones);
      salidaRegiones.writeObject(this.regiones);
      salidaRegiones.close();
      archivosRegiones.close();
    }catch(IOException e){
      e.printStackTrace();
    }
  }
  public void leerArchivos(){

    try{
      FileInputStream archivoRegiones = new FileInputStream("regiones.ser");
      ObjectInputStream entradaRegiones = new ObjectInputStream(archivoRegiones);
      @SuppressWarnings("unchecked") ArrayList<RegionDescuento> list = (ArrayList<RegionDescuento>) entradaRegiones.readObject();
      this.regiones = list;
      entradaRegiones.close();
      archivoRegiones.close();
    }catch(FileNotFoundException e){
      this.regiones = new ArrayList<RegionDescuento>();
      this.regiones.add(new DescuentoEspania());
      this.regiones.add(new DescuentoEU());
      this.regiones.add(new DescuentoLatam());
    }catch(Exception e){
      e.printStackTrace();
    }
    // Deserialización usuarios activos
    try {
      FileInputStream archivoEntradaUsuarios = new FileInputStream("usuarios.ser");
      ObjectInputStream entradaUsuarios = new ObjectInputStream(archivoEntradaUsuarios);
      @SuppressWarnings("unchecked") HashMap<String, User> map = (HashMap<String, User>) entradaUsuarios.readObject();
      this.usuarios = map;
      entradaUsuarios.close();
      archivoEntradaUsuarios.close();
    }catch(FileNotFoundException e){
      this.usuarios = new HashMap<String, User>();
      generarUsuarios();
    }catch (Exception e) {
      e.printStackTrace();
    }
  
    // Deserialización usuarios baneados
    try {
      FileInputStream archivoEntradaBaneados = new FileInputStream("baneados.ser");
      ObjectInputStream entradaBaneados = new ObjectInputStream(archivoEntradaBaneados);
      @SuppressWarnings("unchecked") HashMap<String, User> map = (HashMap<String, User>) entradaBaneados.readObject();
      this.usuariosBaneados = map;
      entradaBaneados.close();
      archivoEntradaBaneados.close();
    }catch(FileNotFoundException e){
      this.usuariosBaneados = new HashMap<String, User>();
    }catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void actualizarDescuento(int pos, int desc){
    this.regiones.get(pos).notifyObserver(desc);
  }
  public RegionDescuento getRegion(int pos){
    return regiones.get(pos);
  }
  
  public boolean validarUsuario(String nombre, String contrasenia){
    if(this.usuarios.containsKey(nombre)){
      if(this.usuarios.get(nombre).validarUsuario(contrasenia))
        return true;
    }
    return false;
  }

  public boolean usuarioPermitido(String nombre){
    return !this.usuariosBaneados.containsKey(nombre);
  }

  public User getUsuario(String nombre){
    return this.usuarios.get(nombre);
  }
  
  public void banearUsuario(User user){
    this.usuariosBaneados.put(user.getNombre(), user);
  }
}
