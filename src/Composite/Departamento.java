package Composite; 
import java.util.HashMap;

public class Departamento extends CatalogoComponente{
  private String nombre;
  private String descripcion; 
  private HashMap<Integer, CatalogoComponente> items;
  private int codigo;


  /*Constructor de la clase
   *
   * @param String nombre
   *        String descripcion
   *        int codigo
   * */
  public Departamento(String nombre, String descripcion, int codigo){
    this.nombre = nombre;
    this.descripcion = descripcion; 
    this.codigo = codigo;
    items = new HashMap<Integer, CatalogoComponente>();
  }

  /*getters de la clase*/
  public int getCodigo(){
    return this.codigo;
  }
  public String getNombre(){
    return this.nombre;
  }
  public String getDepartamento(){
    return this.nombre;
  }
  public String getDescripcion(){
    return this.descripcion;
  }

  /*Aniade un CatalocoComponente a la estructura de datos a partir de su codigo 
   *
   *   @param CatalogoComponente objeto a aniadir
   * */
  public void add(CatalogoComponente catalogo){
    items.put(catalogo.getCodigo(),catalogo);
  }

  /* Remueve un catalogo componente de la estructura a partir de su codigo
   *
   *  @param CatalocoComponente obtejo a remover
   * */
  public void remove(CatalogoComponente catalogo){
    items.remove(catalogo.getCodigo());
  }

  /* getter objeto dentro de la estructura a partir de un codigo dado
   *
   *  @throws CodicoIncorrectoException si el codigo no se encuentra en la estructura 
   *
   *  @return CatalogoComponente correspondiente al codigo ingresado
   * */
  public CatalogoComponente getChild(int i) throws CodigoIncorrectoException{
    if(!items.containsKey(i))
      throw new CodigoIncorrectoException();
    return items.get(i);
  }

  /* Imprime los atributos de la clase, incluyendo la estructura de datos
   * Los elementos de la estructura seran iterador e impresos 
   *  
   * @param String espaciado usado para la iteracion 
   *
   * @return String correspondiente a ver la clase como un String
   * */
  public String print(String espaciado){
    String res = espaciado + "Nombre: " + getNombre() + '\n'  +
    espaciado + "Descripcion: " + getDescripcion() + '\n' + '\n';
    for(Integer numero : items.keySet())
      res+= items.get(numero).print(espaciado + "   ");
    return res + '\n' + '\n';
  }

  /*Aplica los descuentos a cada uno de los CatalogoComponente dentro de la estructura 
   * iterando sobre ellos 
   *
   *  @param int descuento a aplicar
   * */
  public void aplicarDescuento(int descuento){
    for(Integer numero : items.keySet()){
      items.get(numero).aplicarDescuento(descuento);
    } 
  }
}
