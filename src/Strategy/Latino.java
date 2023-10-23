package Strategy; 

public class Latino implements Idioma{
  public Latino(){}

  public String ofertas(){
    return "Weyes, tenemos tremendas ofertas en alimentos al chaz chaz, descuentos del ";
  }

  public String opciones(){
    return "Aqui puedes ver algunas de las opciones: " + '\n'
            + "1. Ver catalogo.\n"
            + "2. Realizar compra.\n"
            + "3. Cerrar sesión.\n" 
            + "4. Salir."; 
  }

  public String entrega(){
    return "Estos son los articulos que has comprado: ";
  }

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

  public String despedirse(){
    return "Adios wey, que te lleve diosito";
  }

  public String completarCompra(){
    return "Gracias por tu compra wey, no tenemos garantia en articulos salidos de la tienda";
  }

  @Override
  public String repeticionCatalogo() {
      return "Ya estas viendo el catalgo wey";
  }

  @Override
  public String cerrarSesion() {
    return "Ta bueno, cerrando tu sesión";
  }

  @Override
  public String sesionIniciada() {
    return "Pero si ya iniciaste sesión wey, ¿para que quieres hacerlo de nuevo?";
  }

  @Override
  public String bienvenidaCompra() {
    return "Bienvenido carnal, Estas son las talachitas que tenemos a la venta: ";
  }

  @Override
  public String costo() {
    return "Mira carnal, ya te la sabes, nos vas a tener que pagar: ";
  }

  @Override
  public String continuarCompra() {
    return "1. Pagame antes de irte wey" + '\n'
    + "2. Aqui tenemos mas cosas guerito/a" + '\n'
    + "3. No hay problema wey, regresa pronto";
  }

  @Override
  public String escogeOpcion() {
    return "Porfa wey, elige una de las opciones";
  }

  @Override
  public String noEsNumero() {
    return "No mames wey, eso ni es un numero";
  }

  @Override
  public String seguirComprando() {
    return "¿Quieres comprar otra cosa carnalito?" + '\n' 
    + "Ingresa el codigo o 1 para irte a tangamandapio";
  }

  @Override
  public String codigoIncorrecto() {
    return "Mira werito, la neta este codigo esta incorrecto";
  }

  @Override
  public String iniciandoCompra() {
    return "Vas, pasame tu datos para pagar";
  }

  @Override
  public String compraFinalizada() {
    return "Muchas gracias, carnal, ya completaste tu compra";
  }

  @Override
  public String baneado() {
    return "Hermano cayo la ley, esta rodeada tu casa \n Bromita, no vamos a llamar a la policia, pero ya te baneamos";
  }

  public String nombreTienda(){
    return "Bienvenido al Tianguis CheemsMark";
  }
  public String descripcionTienda(){
    return "Aqui tenemos de todo guerito/a, todo lo que desee lo tenemos esta a su alcance ";
  }
}
