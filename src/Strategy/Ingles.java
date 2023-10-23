package Strategy; 

public class Ingles implements Idioma{
  public Ingles(){}

  public String ofertas(){
    return "Check out our best deals and discounts in electronic, around ";
  }
  public String opciones(){
    return "1. See catalog.\n"
            + "2. Make a purchase.\n"
            + "3. Sign off.\n" 
            + "4. Exit." + '\n' + 
            "Please chose one of our options: ";
  }
  public String entrega(){
    return "These are the items on your list";
  }
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
  public String despedirse(){
    return "Goodbye my dear friend, come back later.";
  }
  public String completarCompra(){
    return "Thank you for your preference";
  }

  @Override
  public String repeticionCatalogo() {
    return "You ARE looking at the catalogue right now";
  }

  @Override
  public String cerrarSesion() {
    return "Alright bro, you're logged out, come back later";
  }

  @Override
  public String sesionIniciada() {
    return "You're already logged in bro";
  }

  @Override
  public String bienvenidaCompra() {
    return "Welcome bro, here are our products";
  }

  @Override
  public String costo() {
    return "You're gonna pay for this...\n It will be ";
  }

  @Override
  public String continuarCompra() {
    return "So, do you want to continue your purchase? (1. Si/ 2. No)";
  }

  @Override
  public String escogeOpcion() {
    return "Please, just chose one of the available options";
  }

  @Override
  public String noEsNumero() {
    return "That ain't a number bro, try again";
  }

  @Override
  public String seguirComprando() {
    return "Wanna buy something else bro?";
  }

  @Override
  public String codigoIncorrecto() {
    return "This code doesn't look right my friend";
  }

  @Override
  public String iniciandoCompra() {
    return "Alright, lets pay for this, gimme your payment info";
  }

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
}
