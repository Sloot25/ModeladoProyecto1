package Strategy; 

public class Ingles implements Idioma{
  public Ingles(){}

  public String ofertas(){
    return "Check out our best deals and discounts";
  }
  public String opciones(){
    return "These are some options in catalogue";
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
    result += "1. See catalog.\n"
            + "2. Make a purchase.\n"
            + "3. Sign off.\n" 
            + "4. Exit."; 
    return result;
  }
  public String despedirse(){
    return "Goodbye my dear friend, come back later.";
  }
  public String completarCompra(){
    return "Thank you for your preference";
  }
}
