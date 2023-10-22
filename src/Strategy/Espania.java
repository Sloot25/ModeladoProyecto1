package Strategy; 

public class Espania implements Idioma{
  public Espania(){}

  public String ofertas(){
    return "Pero madre mia Willy, estos ofertones estan que flipas chaval: ";
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
    return "Hasta aqui la compra de hoy chavales, no olviden suscribirse y picarle a la campanita, esssspero vuestro regreso para pillar nuestras cosillas";
  }

  public String completarCompra(){
    return "Le agradezzzco por su compra, si algun dia quiere pillar otras cosillas le agradeceria que pillara las nuestras";
  }

  @Override
  public String repeticionCatalogo() {
    return "Pero que me contas tio, que ya estas viendo el catalogo";
  }

  @Override
  public String cerrarSesion() {
    return "Cerrando sesión chaval, hasta la proxima";
  }

  @Override
  public String sesionIniciada() {  
    return "Pero que haceis tio, que ya iniciaste sesion";
  }

  @Override
  public String bienvenidaCompra() {
    return "Hey muy buenas a todos guapisimos, aqui CheemsMark777 en una nueva compra ¿que es lo vais a querer?";
  }

  @Override
  public String costo() {
    return "Estos productos estan que flipas tio, tendreis que pagar ";
  }

  @Override
  public String continuarCompra() {
    return "¿Queréis continuar con la compra chaval? (1. Si / 2. No)";
  }

  @Override
  public String escogeOpcion() {
    return "¿Pero que ha pasao? Elige una de las opciones";
  }

  @Override
  public String noEsNumero() {
    return "No fastidies tio, que ese ni es un numero";
  }

  @Override
  public String seguirComprando() {
    return "¿Queréis comprar algo mas? Os recomiendo aprovechar y llevaros algo mas";
  }

  @Override
  public String codigoIncorrecto() {
    return "No fastidies tio, ese codigo es incorrecto";
  }

  @Override
  public String iniciandoCompra() {
    return "Vale tio, ahora solo necesito que me deis vuestros datos de pago";
  }

  @Override
  public String compraFinalizada() {
    return "Se ha completado la compra chaval, os agradezco por vuestra compra";
  }

  @Override
  public String baneado() {
    return "NOOO LA CUENTA TIOOO QUE TE EQUIVOCASTE TRES VECES QUE TE EQUIVOCASTE TRES VECES, NO HAGAIS ESE ERROR, QUE TE BANEAMOS CHAVAL";
  }
}
