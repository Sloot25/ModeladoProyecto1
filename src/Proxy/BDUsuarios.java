package Proxy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.ArrayList;

import State.CheemsMark;

public class BDUsuarios{
  HashMap<String, User> usuarios;
  HashMap<String,User> usuariosBaneados;
  ArrayList<RegionDescuento> regiones;

  public BDUsuarios(){
    leerArchivos();
  }
    
  public void generarUsuarios(){
    usuarioMexa2 = new UsuarioProxy(new Usuario("Juan Pablo Perez",
                        "caldodepollo",
                        "5553525251",
                        "Riva Palacio 4, La Merced, CDMX",
                        "Mexico",
                        30000,
                        99995));
    usuarioMexa1 = new UsuarioProxy(new Usuario("Helena Gonzalez",
                        "contrasenia",
                        "5556143112",
                        "Corona del Rosal Mz 25, Leon, Guanajuato",
                        "Mexico",
                        40000,
                        99303));
    usuarioEspa1 = new UsuarioProxy(new Usuario("Manuel de la Garza",
                        "password",
                        "3429527592",
                        "San Agustin 23, Madrid",
                        "Espania",
                        50000,
                        84445));
    usuarioEspa2 = new UsuarioProxy(new Usuario("Martina Bolzanon",
                        "jamonserrano",
                        "3429527592",
                        "Av Horacio Carvajal 312, Granada",
                        "Estados Unidos",
                        45000,
                        84048));
    usuarioEUA2 = new UsuarioProxy(new Usuario("John Smith",
                        "partyparty",
                        "8099237212",
                        "Av Siempre Viva 742, Springfield",
                        "Massachussetts",
                        20000,
                        13335));
    usuarioEUA1 = new UsuarioProxy(new Usuario("Catherine Paulson",
                        "oceans8",
                        "8021948562",
                        "Federal Hall 12, Brooklyn",
                        "Estados Unidos",
                        80000,
                        13853));
    
    usuarios.add(usuarioMexa1.getNombre(),usuarioMexa1);
    usuarios.add(usuarioEspa1.getNombre(),usuarioEspa1);
    usuarios.add(usuarioEUA1.getNombre(),usuarioEUA1);
    usuarios.add(usuarioMexa2.getNombre(),usuarioMexa2);
    usuarios.add(usuarioEspa2.getNombre(),usuarioEspa2);
    usuarios.add(usuarioEU2.getNombre(),usuarioEUA2);
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
      ObjectOutputStream salidaRegiones = new ObjectOutputStream(archivoRegiones);
      salidaRegiones.writeObject(this.regiones);
      salidaRegiones.close();
      archivoRegiones.close();
    }catch(IOException e){
      e.printStackTrace();
    }
  }
  public void leerArchivos(){
    // Deserialización usuarios activos
    try {
      FileInputStream archivoEntradaUsuarios = new FileInputStream("usuarios.ser");
      ObjectInputStream entradaUsuarios = new ObjectInputStream(archivoEntradaUsuarios);
      this.usuarios = (HashMap<String, User>) entradaUsuarios.readObject();
      entradaUsuarios.close();
      archivoEntradaUsuarios.close();
    }catch(ClassNotFoundException e){
      this.usuarios = new HashMap<String, User>();
      generarUsuarios();
    }catch (IOException e) {
      e.printStackTrace();
    }
  
    // Deserialización usuarios baneados
    try {
      FileInputStream archivoEntradaBaneados = new FileInputStream("baneados.ser");
      ObjectInputStream entradaBaneados = new ObjectInputStream(archivoEntradaBaneados);
      this.usuariosBaneados = (HashMap<String, User>) entradaBaneados.readObject();
      entradaBaneados.close();
      archivoEntradaBaneados.close();
    }catch(ClassNotFoundException e){
      this.usuariosBaneados = new HashMap<String, User>();
    }catch (IOException) {
      e.printStackTrace();
    }

    try{
      FileInputStream archivoRegiones = new FileInputStream("regiones.ser");
      ObjectInputStream entradaRegiones = new ObjectInputStream(archivoRegiones);
      this.regiones = (ArrayList<RegionDescuento>) entradaRegiones.readObject();
      entradaRegiones.close();
      archivoRegiones.close();
    }catch(ClassNotFoundException e){
      this.regiones = new ArrayList<RegionDescuento>();
    }catch(IOException e){
      e.printStackTrace();
    }
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
    this.usuariosBaneados.add(user.getNombre(), user);
  }
}
