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
    return "Hola wey, eres bienvenido en este changarro, hoy no fiamos, maniana si: ";
  }

  public String despedirse(){
    return "Adios wey, que te lleve diosito";
  }

  public String completaCompra(){
    return "Gracias por tu compra wey, no tenemos garantia en articulos salidos de la tienda";
  }
}
