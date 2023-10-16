import java.util.ArrayList;

package Composite; 

public class Departamento extends CatalogoComponente{
  String nombre;
  String departamento;
  String descripcion; 
  ArrayList<CatalogoComponente> items; 

  public Departamento(String nombre ,String departamento, String descripcion){
    this.departamento = departamento;
    this.descripcion = descripcion; 
    this.items = new ArrayList<CatalogoComponente>();
  }
  public String getDepartamento(){
    return this.departamento; 
  }
  public int getCodigo(){
    return this.codigo;
  }
  public String getDescripcion(){
    return this.descripcion;
  }
  public void add(CatalogoComponente catalogo){
    if(!catalogo.getDepartamento.equals(this.departamento))
      throw new UnsupportedOperationException();
    items.add(catalogo);
  }
  public void remove(CatalogoComponente catalogo){
    items.remove(catalogo);
  }
  public CatalogoComponente getChild(int i){
    return items.get(i);
  }
  public String toString(){
    String res = "Nombre: " + this.nombre + '\n' +
    "Departamento: " + this.departamento + '\n' + 
    "Codigo: " + this.codigo + '\n' + 
    "Descripcion: " + this.descripcion + '\n';
    for(CatalogoComponente cat : items)
      res+= " " + cat.toString();
    return res;
  }
  public void aplicarDescuento(int descuento){
  }
  
}
