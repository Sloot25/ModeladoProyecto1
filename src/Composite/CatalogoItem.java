package Composite; 

public class CatalogoItem extends CatalogoComponente{
  private String nombre; 
  private int codigo; 
  private int precio; 
  private int descuento;
  private String departamento;
  private String descripcion;
  public CatalogoItem(String nombre, int codigo, int precio, String departamento, String descripcion){
    this.nombre = nombre; 
    this.codigo = codigo;
    this.precio = precio; 
    this.departamento = departamento;
    this.descripcion = descripcion;
  } 
  
  public String getNombre(){
    return this.nombre;
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
  public int getDescuento(){
    return this.descuento;
  }

  public String toString(){
    return "Nombre: " + getNombre() + '\n' +
    "Departamento: " + getDepartamento() + '\n' + 
    "Codigo de Barra: " + getCodigo() + '\n' + 
    "Precio: " + (getPrecio() - (getPrecio()*getDescuento())/100) + '\n' + 
    "Descripcion: " + getDescripcion();
  }
  public void aplicarDescuento(int descuento){
    this.descuento = descuento;
  }
}
