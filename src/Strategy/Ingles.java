package Strategy; 

public class Ingles implements Idioma{
  public Ingles(){}

  /*  Metodo encargado de Informar de las ofertas disponibles, este metodo esta seteado en Electrodomesticos 
   *  debido a los requisitos del proyecto (Puede ser alterado mas adelante)
   *  
   *  @return Cadena de ofertas correspondiente al idioma
   * */
  public String ofertas(){
    return "Check out our best deals and discounts in electronic, around ";
  }

  /*  Metodo que informa de las opciones disponibles en la tienda 
   *
   *  @return String opciones disponibles
   * */

  public String opciones(){
    return "1. See catalog.\n"
            + "2. Make a purchase.\n"
            + "3. Log out.\n" 
            + "4. Exit." + '\n' + 
            "Please chose one of our options: ";
  }

  /*  Metrodo que informa sobre los articulos seleccionados
   *
   *  @return String Cadena en el idioma correspondiente 
   * */
  public String entrega(){
    return "These are the items on your list";
  }

  /* Metodo que da la bienvenida a la tienda
   * 
   * @return String cadena en el idioma correspondiente
   * */
  public String saludar(){
    String result = "";
    result += "*******************************"
            + "*                             *"
            + "*       Purchase system       *"
            + "*                             *"
            + "*******************************\n";
    result +="Hello, welcome to the Cheems store, where you can buy anything at an affordable price:\n";

    return result;
  }

  /* Metodo que se despide el usuario
   *
   * @String cadena en el idioma correspondiente 
   * */
  public String despedirse(){
    return "Goodbye my dear friend, come back later.";
  }

  /*  Metodo que agradece la compra
   *
   * @return String cadena en el idioma correspondiente 
   * */
  public String completarCompra(){
    return "Thank you for your preference";
  }

  /* Metodo que advierte de la repeticion del catalogo 
   *
   * @return String cadena en el idioma correspondiente
   * */
  @Override
  public String repeticionCatalogo() {
    return "You ARE looking at the catalogue right now";
  }

  /*  Metodo que se despide al cerrar sesion 
   *
   *  @return String cadena en el idioma correspondiente
   * */
  @Override
  public String cerrarSesion() {
    return "Alright bro, you're logged out, come back later";
  }

    /*  Metodo que advierte de la sesion ya esta iniciada 
   *
   *  @return String en el idioma correspondiente
   * */
  @Override
  public String sesionIniciada() {
    return "You're already logged in bro";
  }

  /*  Metodo que da la bienvenida a la compra 
   *
   *  @return String cadena en el idioma correspondiente
   * */
  @Override
  public String bienvenidaCompra() {
    return "Welcome bro, here are our products";
  }

  /*  Metodo que advierte del costo de la compra 
   *
   *  @return String cadena en el idioma correspondiente
   * */
  @Override
  public String costo() {
    return "You're gonna pay for this...\n It will be ";
  }
  
  /* Metodo da opciones en la compra del producto 
   *
   *  @return String cadena en el idioma correspondiente
   * */
  @Override
  public String continuarCompra() {
    return "So, do you want to continue your purchase?" + '\n' + "1. pay for items" + '\n' + "2. buy more items" 
    + '\n' + "3. get out of here";
  }

  /*  Metodo que advierte que la opcion fue mal elegida
   *
   *  @return String cadena en el idioma correspondiente
   * */
  @Override
  public String escogeOpcion() {
    return "Please, just chose one of the available options";
  }

  /*  Metodo que advierte que lo ingresado no es un numero 
   *
   *  @return String cadena en el idioma correspondiente
   * */
  @Override
  public String noEsNumero() {
    return "That ain't a number bro, try again";
  }

  /*  Metodo que advierte de las opciones al comprar
   *
   *  @return String en el idioma correspondiente
   * */ 
  @Override
  public String seguirComprando() {
    return "Wanna buy something else bro? (press 1 to pay for those)" ;
  }

  /*  Metodo que advierte que el codigo es incorrecto
   *
   *  @return String en el idioma correspondiente
   * */
  @Override
  public String codigoIncorrecto() {
    return "This code doesn't look right my friend";
  }

  /*  Metodo que advierte que se esta iniciando el proceso de pago
   *
   *  @return String en el idioma correspondiente
   * */
  @Override
  public String iniciandoCompra() {
    return "Alright, lets pay for this, gimme your payment info";
  }

  /*  Metodo que advierte sobre la finalizacion correctamente de la compra
   *
   *  @return String en el idioma correspondiente
   * */
  @Override
  public String compraFinalizada() {
    return "Your purchase is done, thank you for your preference";
  }

  @Override
  public String baneado() {
    return "FBI OPEN UP!!! YOU'RE GETTING BANNED FOR THIS!";
  }

  public String nombreTienda(){
    return "Welcome to CheemsMark";
  }
  public String descripcionTienda(){
    return "In CheemsMark you can found whatever you want"; 
  }

  /*
   * Metodo que informa de falta de dinero
   *
   * @return String en el idioma correspondiente
   */
  public String noHayDinero() {
    return "Sorry bro, you aint got no money to pay for this";
  }
}
