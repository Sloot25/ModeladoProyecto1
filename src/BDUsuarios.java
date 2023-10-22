import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import Proxy.Usuario;
import Proxy.UsuarioProxy;
import State.CheemsMark;
public class BDUsuarios implements Serializable{
  UsuarioProxy usuarioMexa1, usuarioMexa2, usuarioEspa1,  usuarioEspa2, usuarioEUA1, usuarioEUA2;
  ArrayList<UsuarioProxy> Usuarios = new ArrayList<UsuarioProxy>();
  ArrayList<UsuarioProxy> UsuariosBaneados = new ArrayList<UsuarioProxy>();;
  CheemsMark chemsito;

  public BDUsuarios(CheemsMark chemsito){
    this.chemsito = chemsito;
    generarUsuarios();
  }
    
  public void generarUsuarios(){
    usuarioMexa2 = new UsuarioProxy(new Usuario("Juan Pablo Perez",
                        "caldodepollo",
                        "5553525251",
                        "Riva Palacio 4, La Merced, CDMX",
                        "Mexico",
                        30000,
                        99995,
                        chemsito));
    usuarioMexa1 = new UsuarioProxy(new Usuario("Helena Gonzalez",
                        "contrasenia",
                        "5556143112",
                        "Corona del Rosal Mz 25, Leon, Guanajuato",
                        "Mexico",
                        40000,
                        99303,
                        chemsito));
    usuarioEspa1 = new UsuarioProxy(new Usuario("Manuel de la Garza",
                        "password",
                        "3429527592",
                        "San Agustin 23, Madrid",
                        "Espania",
                        50000,
                        84445,
                        chemsito));
    usuarioEspa2 = new UsuarioProxy(new Usuario("Martina Bolzanon",
                        "jamonserrano",
                        "3429527592",
                        "Av Horacio Carvajal 312, Granada",
                        "Estados Unidos",
                        45000,
                        84048,
                        chemsito));
    usuarioEUA2 = new UsuarioProxy(new Usuario("John Smith",
                        "partyparty",
                        "8099237212",
                        "Av Siempre Viva 742, Springfield",
                        "Massachussetts",
                        20000,
                        13335,
                        chemsito));
    usuarioEUA1 = new UsuarioProxy(new Usuario("Catherine Paulson",
                        "oceans8",
                        "8021948562",
                        "Federal Hall 12, Brooklyn",
                        "Estados Unidos",
                        80000,
                        13853,
                        chemsito));
    
    Usuarios.add(usuarioMexa1);
    Usuarios.add(usuarioEspa1);
    Usuarios.add(usuarioEUA1);
    UsuariosBaneados.add(usuarioMexa2);
    UsuariosBaneados.add(usuarioEspa2);
    UsuariosBaneados.add(usuarioEUA2);
  }
    
    // Serialización
    public void serializacion(){
      // Serializacion usuarios activos  
      try {
        // archivo donde guardamos el arreglo de usuarios serializado
        FileOutputStream archivoSalidaUsuarios = new FileOutputStream("usuarios_serializado.ser");
        ObjectOutputStream salidaUsuarios = new ObjectOutputStream(archivoSalidaUsuarios);
        salidaUsuarios.writeObject(Usuarios); // enviamos el objeto Usuarios atraves del ObjectOutputStream
        salidaUsuarios.close();
        archivoSalidaUsuarios.close();
        System.out.println("Usuarios activos serializados y guardados en usuarios_serializado.ser");
      } catch (IOException e) {
          e.printStackTrace();
      }

      // Serializacion usuarios baneados
      try {
        // archivo donde guardamos el arreglo de usuarios baneados serializado
        FileOutputStream archivoSalidaBaneados = new FileOutputStream("baneados_serializado.ser");
        ObjectOutputStream salidaBaneados = new ObjectOutputStream(archivoSalidaBaneados);
        salidaBaneados.writeObject(Usuarios);
        salidaBaneados.close();
        archivoSalidaBaneados.close();
        System.out.println("Usuarios baneados serializados y guardados en baneados_serializado.ser");
      } catch (IOException e) {
          e.printStackTrace();
      }


    // Deserialización usuarios activos
      try {
        FileInputStream archivoEntradaUsuarios = new FileInputStream("usuarios_serializado.ser");
        ObjectInputStream entradaUsuarios = new ObjectInputStream(archivoEntradaUsuarios);
        ArrayList<UsuarioProxy> listaDeserializada = (ArrayList<UsuarioProxy>) entradaUsuarios.readObject();
        entradaUsuarios.close();
        archivoEntradaUsuarios.close();

        for (UsuarioProxy usuario : listaDeserializada) {
            // aqui verificamos que hacer con los usuarios ya obtenidos
        }

      } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
      }
      
      // Deserialización usuarios baneados
      try {
        FileInputStream archivoEntradaBaneados = new FileInputStream("usuarios_serializado.ser");
        ObjectInputStream entradaBaneados = new ObjectInputStream(archivoEntradaBaneados);
        ArrayList<UsuarioProxy> listaDeserializada = (ArrayList<UsuarioProxy>) entradaBaneados.readObject();
        entradaBaneados.close();
        archivoEntradaBaneados.close();

        for (UsuarioProxy usuario : listaDeserializada) {
            // aqui verificamos que hacer con los usuarios ya obtenidos
        }

      } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
      }
    }

    
}
