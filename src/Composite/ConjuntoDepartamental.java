package Composite; 
import java.util.HashMap; 

public class ConjuntoDepartamental extends CatalogoComponente{
  private String nombre; 
  private String descripcion;
  private HashMap<Integer, CatalogoComponente> items;

  /*Constructor de la clase, inicializa los atributos
   *
   *  @param String nombre 
   *         String descripcion
   * */
  public ConjuntoDepartamental(String nombre, String descripcion){
    this.nombre = nombre; 
    this.descripcion = descripcion;
    items = new HashMap<Integer, CatalogoComponente>();
  }

  /*getters de la clase*/
  public String getNombre(){ return this.nombre; }
  public String getDescripcion(){ return this.descripcion; }

  /*Aniade un CatalocoComponente a la estructura de datos a partir de su codigo 
   *
   *   @param CatalogoComponente objeto a aniadir
   * */
  public void add(CatalogoComponente catalogo){
    items.put(catalogo.getCodigo(), catalogo);
  }

  /* Remueve un catalogo componente de la estructura a partir de su codigo
   *
   *  @param CatalocoComponente obtejo a remover
   * */
  public void remove(CatalogoComponente catalogo){
    items.remove(catalogo.getCodigo());
  }

  /* getter de un objeto de la Estructura a partir de un codigo dado, usando solo los ultimos dos digitos del codigo
   * debido a que se busca almacenar Departamentos, de ahi en el departamento almacenado se regresa su propio getChild
   *
   *  @param int codigo el cual sera buscado
   *
   *  @throws CodigoIncorrectoException si el codigo ingresado no se ensuentra 
   * */
  public CatalogoComponente getChild(int i) throws CodigoIncorrectoException{
    int n = i % 100;
    if(!items.containsKey(n))
      throw new CodigoIncorrectoException();
    return items.get(n).getChild(i);
  }

  /* Imprime los atributos de la clase, incluyendo la estructura de datos
   * Los elementos de la estructura seran iterador e impresos 
   *  
   * @param String espaciado usado para la iteracion 
   *
   * @return String correspondiente a ver la clase como un String
   * */
  public String print(String espaciado){
    String res = espaciado + this.nombre + '\n' 
    + espaciado + this.descripcion + '\n' + '\n';
    for(Integer numero :items.keySet())
      res += items.get(numero).print(espaciado + "   ");
    return res;
  }

  /* getter Departamento 
   * Al contrario de getChild, este regresa el departamento a ser visitado
   * 
   * @param int codigo del departamento
   *
   * @return CatalogoComponente departamento
   * */
  public CatalogoComponente getDepartamento(int codigo){
    codigo = codigo%100;
    return items.get(codigo);
  }
}
