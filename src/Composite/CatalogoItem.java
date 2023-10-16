package Composite; 

public class CatalogoItem extends CatalogoComponente{
  String nombre; 
  int codigo; 
  int precio; 
  String departamento;
  String descripcion;
  public CatalogoItem(String nombre, int codigo, int precio, String departamento, String descripcion){
    this.nombre = nombre; 
    this.codigo = codigo;
    this.precio = precio; 
    this.departamento = departamento;
    this.descripcion = descripcion;
  } 
  public String getDepartamento(){
    return this.departamento;
  }
  public int getCodigo(){
    return this.codigo;
  }
  public int getPrecio(){
    return this.precio;
  }
  public String getDescripcion(){
    return this.descripcion;
  }
  public String toString(){
    return "Nombre: " + this.nombre + '\n' +
    "Departamento: " + this.departamento + '\n' + 
    "Codigo de Barra: " + this.codigo + '\n' + 
    "Precio: " + this.precio + '\n' + 
    "Descripcion: " + this.descripcion;
  }
}
