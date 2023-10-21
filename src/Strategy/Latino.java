package Strategy; 

public class Latino implements Idioma{
  public Latino(){}

  public String ofertas(){
    return "Estas son las ofertas actuales: ";
  }

  public String opciones(){
    return "Aqui puedes ver algunas de las opciones dentro de nuestro catalogo: ";
  }

  public String entrega(){
    return "Estos son los articulos que has comprado: ";
  }

  public String saludar(){
    String result = "";
    result += "*******************************"
            + "*                             *"
            + "*      Sistema de compras     *"
            + "*                             *"
            + "*******************************\n";
    result +="Hola wey, eres bienvenido en este changarro.\nRecuerda hoy no fiamos, maniana si:\n";
    result += "1. Ver catalogo.\n"
            + "2. Realizar compra.\n"
            + "3. Cerrar sesión.\n" 
            + "4. Salir."; 
    return result;
  }

  public String despedirse(){
    return "Adios wey, que te lleve diosito";
  }

  public String completarCompra(){
    return "Gracias por tu compra wey, no tenemos garantia en articulos salidos de la tienda";
  }
}
