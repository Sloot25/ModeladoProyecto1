package Strategy; 

public class Ingles implements Idioma{
  public Ingles(){}

  public String ofertas(){
    return "Those are the offers actually";
  }
  public String opciones(){
    return "These are some options in catalogue";
  }
  public String entrega(){
    return "Those are your items";
  }
  public String saludar(){
    String result = "";
    result += "*******************************"
            + "*                             *"
            + "*       Purchase system       *"
            + "*                             *"
            + "*******************************\n";
    result +="Hello, welcome to Cheems store, where you can buy anything and everything:\n";
    result += "1. See catalog.\n"
            + "2. Make a purchase.\n"
            + "3. Sign off.\n" 
            + "4. Exit."; 
    return result;
  }
  public String despedirse(){
    return "Good bye my dear friend, come back late.";
  }
  public String completarCompra(){
    return "Thank you for your buy";
  }
}
