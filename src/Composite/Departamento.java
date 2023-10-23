package Composite; 
import java.util.ArrayList;

public class Departamento extends CatalogoComponente{
  private String nombre;
  private String descripcion; 
  private ArrayList<CatalogoComponente> items = new ArrayList<CatalogoComponente>();


  public Departamento(String nombre, String descripcion){
    this.nombre = nombre;
    this.descripcion = descripcion; 
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
    items.add(catalogo);
  }
  public void remove(CatalogoComponente catalogo){
    items.remove(catalogo);
  }
  public CatalogoComponente getChild(int i){
    return items.get(i);
  }
  public String print(String espaciado){
    String res = espaciado + "Nombre: " + getNombre() + '\n' +
    espaciado + "Descripcion: " + getDescripcion() + '\n';
    for(CatalogoComponente cat : items)
      res+= cat.print(espaciado + "   ");
    return res;
  }
  public void aplicarDescuento(int descuento){
    for(CatalogoComponente cat : items){
      cat.aplicarDescuento(descuento);
    } 
  }
}
