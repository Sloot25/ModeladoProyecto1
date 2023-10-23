package Composite; 

public class CatalogoItem extends CatalogoComponente{
  private String nombre; 
  private int codigo; 
  private int precio; 
  private int descuento;
  private String departamento;
  private String descripcion;

  /*Constructo de la clase, inicializa los atributis 
   *
   *  @param String nombre 
   *         int codigo
   *         int precio 
   *         String departamento
   *         String descripcion
   *
   * */
  public CatalogoItem(String nombre, int codigo, int precio, String departamento, String descripcion){
    this.nombre = nombre; 
    this.codigo = codigo;
    this.precio = precio; 
    this.departamento = departamento;
    this.descripcion = descripcion;
  } 
  
  /*getters de la clase*/
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

  /* Regresa un String de la clase correspondiente a los atributos de la misma 
   *
   *  @param String espaciado para iterar
   *  
   *  @return String atributos de la clase en formma de String
   * */
  public String print(String espaciado){
    return espaciado + "Nombre: " + getNombre() + '\n' +
    espaciado + "Departamento: " + getDepartamento() + '\n' + 
    espaciado + "Codigo de Barra: " + getCodigo() + '\n' + 
    espaciado + "Precio: " + (getPrecio() - (getPrecio()*getDescuento())/100) + '\n' + 
    espaciado + "Descripcion: " + getDescripcion() + '\n' + '\n';
  }

  /*Modifica el precio de acuerdo al descuento recibido
   *
   *  @param int descuento
   * */
  public void aplicarDescuento(int descuento){
    this.precio = (int)precio*(descuento)/100;
  }
}
