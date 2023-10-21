package Strategy; 

public class Espania implements Idioma{
  public Espania(){}

  public String ofertas(){
    return "Venga Tio, Os traigo estos offertones: ";
  }
  public String opciones(){
    return "Venga Tio, Te muestro vuestras opciones en el catalogo: ";
  }
  public String entrega(){
    return "Ostiones, estos son los artilugios que has pillado: ";
  }
  public String saludar(){
    String result = "";
    result += "*******************************"
            + "*                             *"
            + "*      Sistema de compras     *"
            + "*                             *"
            + "*******************************\n";
    result +="Buenos dias Chavalin, que opcion desea uste': \n";
    result += "1. Ver catalogo de la ostia.\n"
            + "2. Realizar compra tio.\n"
            + "3. Cerrar sesión tio. \n"
            + "4. Salir."; 
    return result;
  }

  public String despedirse(){
    return "Hasta luego Chavalin, esssspero vuestro regreso para pillar nuestras cosillas";
  }

  public String completarCompra(){
    return "Le agradezzzco por su compra, si algun dia quiere pillar otras cosillas le agradeceria que pillara las nuestras";
  }
}
