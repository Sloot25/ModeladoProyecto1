package Composite; 
import java.util.HashMap;

public class Departamento extends CatalogoComponente{
  private String nombre;
  private String descripcion; 
  private HashMap<Integer, CatalogoComponente> items;
  private int codigo;


  public Departamento(String nombre, String descripcion, int codigo){
    this.nombre = nombre;
    this.descripcion = descripcion; 
    this.codigo = codigo;
    items = new HashMap<Integer, CatalogoComponente>();
  }
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

  public void add(CatalogoComponente catalogo){
    items.put(catalogo.getCodigo(),catalogo);
  }
  public void remove(CatalogoComponente catalogo){
    items.remove(catalogo.getCodigo());
  }
  public CatalogoComponente getChild(int i) throws CodigoIncorrectoException{
    if(!items.containsKey(i))
      throw new CodigoIncorrectoException();
    return items.get(i);
  }
  public String print(String espaciado){
    String res = espaciado + "Nombre: " + getNombre() + '\n'  +
    espaciado + "Descripcion: " + getDescripcion() + '\n' + '\n';
    for(Integer numero : items.keySet())
      res+= items.get(numero).print(espaciado + "   ");
    return res + '\n' + '\n';
  }
  public void aplicarDescuento(int descuento){
    for(Integer numero : items.keySet()){
      items.get(numero).aplicarDescuento(descuento);
    } 
  }
}
