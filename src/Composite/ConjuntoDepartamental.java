package Composite; 
import java.util.HashMap; 

public class ConjuntoDepartamental extends CatalogoComponente{
  private String nombre; 
  private String descripcion;
  private HashMap<Integer, CatalogoComponente> items;

  public ConjuntoDepartamental(String nombre, String descripcion){
    this.nombre = nombre; 
    this.descripcion = descripcion;
    items = new HashMap<Integer, CatalogoComponente>();
  }

  public String getNombre(){ return this.nombre; }
  public String getDescripcion(){ return this.descripcion; }
  public void add(CatalogoComponente catalogo){
    items.put(catalogo.getCodigo(), catalogo);
  }
  public void remove(CatalogoComponente catalogo){
    items.remove(catalogo.getCodigo());
  }
  public CatalogoComponente getChild(int i) throws CodigoIncorrectoException{
    int n = i % 100;
    if(!items.containsKey(n))
      throw new CodigoIncorrectoException();
    return items.get(n).getChild(i);
  }
  public String print(String espaciado){
    String res = espaciado + this.nombre + '\n' 
    + espaciado + this.descripcion + '\n' + '\n';
    for(Integer numero :items.keySet())
      res += items.get(numero).print(espaciado + "   ");
    return res;
  }
  public CatalogoComponente getDepartamento(int codigo){
    return items.get(codigo);
  }
}
