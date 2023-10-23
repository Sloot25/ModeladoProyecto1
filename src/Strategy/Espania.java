package Strategy; 

public class Espania implements Idioma{
  public Espania(){}
  
  /*  Metodo encargado de Informar de las ofertas disponibles, este metodo esta seteado en Electrodomesticos 
   *  debido a los requisitos del proyecto (Puede ser alterado mas adelante)
   *  
   *  @return Cadena de ofertas correspondiente al idioma
   * */

  public String ofertas(){
    return "Pero madre mia Willy, Tenemos tremendos ofertones en Electrodomesticos del ";
  }

  /*  Metodo que informa de las opciones disponibles en la tienda 
   *
   *  @return String opciones disponibles
   * */

  public String opciones(){
    return "1. Ver catalogo de la ostia.\n"
            + "2. Realizar compra tio.\n"
            + "3. Cerrar sesión tio. \n"
            + "4. Salir " +  '\n' + 
            "que opcion desea uste': \n";
  }
  
  /*  Metrodo que informa sobre los articulos seleccionados
   *
   *  @return String Cadena en el idioma correspondiente 
   * */
  public String entrega(){
    return "Ostiones, estos son los artilugios que has pillado: ";
  }

  /* Metodo que da la bienvenida a la tienda
   * 
   * @return String cadena en el idioma correspondiente
   * */

  public String saludar(){
    String result = "";
    result += "*******************************"
            + "*                             *"
            + "*      Sistema de compras     *"
            + "*                             *"
            + "*******************************\n";
    result +="Buenos dias Chavalin, Andamos a todo gas \n";

    return result;
  }

  /* Metodo que se despide el usuario
   *
   * @String cadena en el idioma correspondiente 
   * */
  public String despedirse(){
    return "Hasta aqui la compra de hoy chavales, no olviden suscribirse y picarle a la campanita, esssspero vuestro regreso para pillar nuestras cosillas";
  }

  /*  Metodo que agradece la compra
   *
   * @return String cadena en el idioma correspondiente 
   * */

  public String completarCompra(){
    return "Le agradezzzco por su compra, si algun dia quiere pillar otras cosillas le agradeceria que pillara las nuestras";
  }

  /* Metodo que advierte de la repeticion del catalogo 
   *
   * @return String cadena en el idioma correspondiente
   * */
  @Override
  public String repeticionCatalogo() {
    return "Pero que me contas tio, que ya estas viendo el catalogo";
  }

  /*  Metodo que se despide al cerrar sesion 
   *
   *  @return String cadena en el idioma correspondiente
   * */
  @Override
  public String cerrarSesion() {
    return "Cerrando sesión chaval, hasta la proxima";
  }

  /*  Metodo que advierte de la sesion ya esta iniciada 
   *
   *  @return String en el idioma correspondiente
   * */
  @Override
  public String sesionIniciada() {  
    return "Pero que haceis tio, que ya iniciaste sesion";
  }

  /*  Metodo que da la bienvenida a la compra 
   *
   *  @return String cadena en el idioma correspondiente
   * */
  @Override
  public String bienvenidaCompra() {
    return "Hey muy buenas a todos guapisimos, aqui CheemsMark777 en una nueva compra ¿que es lo vais a querer?";
  }

  /*  Metodo que advierte del costo de la compra 
   *
   *  @return String cadena en el idioma correspondiente
   * */
  @Override
  public String costo() {
    return "Estos productos estan que flipas tio, tendreis que pagar ";
  }

  /* Metodo da opciones en la compra del producto 
   *
   *  @return String cadena en el idioma correspondiente
   * */
  @Override
  public String continuarCompra() {
    return "Decide de una vez tio: " + '\n'
    + "1. Pagar todo a la voz chaval " + '\n' 
    + "2. Todavia tengo artilugios por comprar" + '\n'
    + "3. Tio, tus precios se elevan como las funas de los latinos";
  }

  /*  Metodo que advierte que la opcion fue mal elegida
   *
   *  @return String cadena en el idioma correspondiente
   * */
  @Override
  public String escogeOpcion() {
    return "¿Pero que ha pasao? Elige una de las opciones";
  }
  /*  Metodo que advierte que lo ingresado no es un numero 
   *
   *  @return String cadena en el idioma correspondiente
   * */
  @Override
  public String noEsNumero() {
    return "No fastidies tio, que ese ni es un numero";
  }

  /*  Metodo que advierte de las opciones al comprar
   *
   *  @return String en el idioma correspondiente
   * */
  @Override
  public String seguirComprando() {
    return "¿Queréis comprar algo mas? Os recomiendo aprovechar y llevaros algo mas o elige 1 para irte con lo que tienes";
  }

  /*  Metodo que advierte que el codigo es incorrecto
   *
   *  @return String en el idioma correspondiente
   * */
  @Override
  public String codigoIncorrecto() {
    return "Pero que haceis tio, ese codigo es incorrecto";
  }

  /*  Metodo que advierte que se esta iniciando el proceso de pago
   *
   *  @return String en el idioma correspondiente
   * */
  @Override
  public String iniciandoCompra() {
    return "Vale tio, ahora solo necesito que me deis vuestros datos de pago";
  }

  /*  Metodo que advierte sobre la finalizacion correctamente de la compra
   *
   *  @return String en el idioma correspondiente
   * */
  @Override
  public String compraFinalizada() {
    return "Se ha completado la compra chaval, os agradezco por vuestra compra";
  }

  /*  Metodo que advierte sobre un Ban en el Proyecto
   *
   *  @rturn String en el idioma correspondiente
   * */
  @Override
  public String baneado() {
    return "NOOO LA CUENTA TIOOO QUE TE EQUIVOCASTE TRES VECES QUE TE EQUIVOCASTE TRES VECES, NO HAGAIS ESE ERROR, QUE TE BANEAMOS CHAVAL";
  }
  
  /* Metodo que recuenrda el nombre de la tienda 
   *
   *  @return String en el idioma correspondiente
   * */
  public String nombreTienda(){
    return "Bienvenido al mercadito de Cheems, Tio";
  }

  /* Metodo que describe la tienda 
   *
   * @return String en el idioma correspondiente
   * */
  public String descripcionTienda(){
    return "Ala tio, que aqui podeis conseguir todo lo que buscais";
  }

  /*
   * Metodo que informa de falta de dinero
   *
   * @return String en el idioma correspondiente
   */
  public String noHayDinero() {
    return "Fua chaval, pero si no teneis ni pasta para pagar, ¿en que estais pensando?";
  }
}
