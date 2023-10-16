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
    return "Buenos dias Chavalin, que artilugio desea uste': ";
  }

  public String despedirse(){
    return "Hasta luego Chavalin, esssspero vuestro regreso para pillar nuestras cosillas";
  }

  public String completaCompra(){
    return "Le agradezzzco por su compra, si algun dia quiere pillar otras cosillas le agradeceria que pillara las nuestras";
  }
}
