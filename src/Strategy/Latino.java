package Strategy; 

public class Latino implements Idioma{
  public Latino(){}

  /*  Metodo encargado de Informar de las ofertas disponibles, este metodo esta seteado en Electrodomesticos 
   *  debido a los requisitos del proyecto (Puede ser alterado mas adelante)
   *  
   *  @return Cadena de ofertas correspondiente al idioma
   * */
  public String ofertas(){
    return "Weyes, tenemos tremendas ofertas en alimentos al chaz chaz, descuentos del ";
  }

  /*  Metodo que informa de las opciones disponibles en la tienda 
   *
   *  @return String opciones disponibles
   * */

  public String opciones(){
    return "Aqui puedes ver algunas de las opciones: " + '\n'
            + "1. Ver catalogo.\n"
            + "2. Realizar compra.\n"
            + "3. Cerrar sesión.\n" 
            + "4. Salir."; 
  }

  /*  Metrodo que informa sobre los articulos seleccionados
   *
   *  @return String Cadena en el idioma correspondiente 
   * */
  public String entrega(){
    return "Estos son los articulos que has comprado: ";
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
    result +="Hola wey, eres bienvenido en este changarro.\nRecuerda hoy no fiamos, maniana si\n";

    return result;
  }

  /* Metodo que se despide el usuario
   *
   * @String cadena en el idioma correspondiente 
   * */
  public String despedirse(){
    return "Adios wey, que te lleve diosito";
  }

  /*  Metodo que agradece la compra
   *
   * @return String cadena en el idioma correspondiente 
   * */
  public String completarCompra(){
    return "Gracias por tu compra wey, no tenemos garantia en articulos salidos de la tienda";
  }

  /* Metodo que advierte de la repeticion del catalogo 
   *
   * @return String cadena en el idioma correspondiente
   * */
  @Override
  public String repeticionCatalogo() {
      return "Ya estas viendo el catalgo wey";
  }

  /*  Metodo que se despide al cerrar sesion 
   *
   *  @return String cadena en el idioma correspondiente
   * */
  @Override
  public String cerrarSesion() {
    return "Ta bueno, cerrando tu sesión";
  }

  /*  Metodo que advierte de la sesion ya esta iniciada 
   *
   *  @return String en el idioma correspondiente
   * */
  @Override
  public String sesionIniciada() {
    return "Pero si ya iniciaste sesión wey, ¿para que quieres hacerlo de nuevo?";
  }

  /*  Metodo que da la bienvenida a la compra 
   *
   *  @return String cadena en el idioma correspondiente
   * */
  @Override
  public String bienvenidaCompra() {
    return "Bienvenido carnal, Estas son las talachitas que tenemos a la venta: ";
  }

  /*  Metodo que advierte del costo de la compra 
   *
   *  @return String cadena en el idioma correspondiente
   * */
  @Override
  public String costo() {
    return "Mira carnal, ya te la sabes, nos vas a tener que pagar: ";
  }

  /* Metodo da opciones en la compra del producto 
   *
   *  @return String cadena en el idioma correspondiente
   * */
  @Override
  public String continuarCompra() {
    return "1. Pagame antes de irte wey" + '\n'
    + "2. Aqui tenemos mas cosas guerito/a" + '\n'
    + "3. No hay problema wey, regresa pronto";
  }

  /*  Metodo que advierte que la opcion fue mal elegida
   *
   *  @return String cadena en el idioma correspondiente
   * */
  @Override
  public String escogeOpcion() {
    return "Porfa wey, elige una de las opciones";
  }

  /*  Metodo que advierte que lo ingresado no es un numero 
   *
   *  @return String cadena en el idioma correspondiente
   * */
  @Override
  public String noEsNumero() {
    return "No mames wey, eso ni es un numero";
  }

  /*  Metodo que advierte de las opciones al comprar
   *
   *  @return String en el idioma correspondiente
   * */
  @Override
  public String seguirComprando() {
    return "¿Quieres comprar otra cosa carnalito?" + '\n' 
    + "Ingresa el codigo o 1 para irte a tangamandapio";
  }

  /*  Metodo que advierte que el codigo es incorrecto
   *
   *  @return String en el idioma correspondiente
   * */
  @Override
  public String codigoIncorrecto() {
    return "Mira werito, la neta este codigo esta incorrecto";
  }

  /*  Metodo que advierte que se esta iniciando el proceso de pago
   *
   *  @return String en el idioma correspondiente
   * */
  @Override
  public String iniciandoCompra() {
    return "Vas, pasame tu datos para pagar";
  }

  /*  Metodo que advierte sobre la finalizacion correctamente de la compra
   *
   *  @return String en el idioma correspondiente
   * */
  @Override
  public String compraFinalizada() {
    return "Muchas gracias, carnal, ya completaste tu compra";
  }

  /*  Metodo que advierte sobre un Ban en el Proyecto
   *
   *  @rturn String en el idioma correspondiente
   * */
  @Override
  public String baneado() {
    return "Hermano cayo la ley, esta rodeada tu casa \n Bromita, no vamos a llamar a la policia, pero ya te baneamos";
  }

  /* Metodo que recuenrda el nombre de la tienda 
   *
   *  @return String en el idioma correspondiente
   * */
  public String nombreTienda(){
    return "Bienvenido al Tianguis CheemsMark";
  }

  /* Metodo que describe la tienda 
   *
   * @return String en el idioma correspondiente
   * */
  public String descripcionTienda(){
    return "Aqui tenemos de todo guerito/a, todo lo que desee lo tenemos esta a su alcance ";
  }
}
