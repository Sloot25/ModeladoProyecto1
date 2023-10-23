package Composite; 

public abstract class CatalogoComponente{
  
  /* getters de la clase */
  public String getDepartamento(){
    throw new UnsupportedOperationException();
  }
  public int getCodigo(){
    throw new UnsupportedOperationException();
  }
  public int getPrecio(){
    throw new UnsupportedOperationException();
  }
  public int getDescuento(){
    throw new UnsupportedOperationException();
  }
  public String getNombre(){
    throw new UnsupportedOperationException();
  }
  public String getDescription(){
    throw new UnsupportedOperationException();
  }
  /* Aniade un nuevo CatalogoComponente a la clase*/
  public void add(CatalogoComponente catalogo){
    throw new UnsupportedOperationException();
  } 
  /* Remueve un CatalogoComponente a la clase*/
  public void remove(CatalogoComponente catalogo){
    throw new UnsupportedOperationException();
  }
  /* getter de un CatalogoComponente perteneciente a la clase 
   *
   *  @throws CodigoIncorrectoException en caso de que el valor recibido sea incorrecto
   * */
  public CatalogoComponente getChild(int i) throws CodigoIncorrectoException{
    throw new UnsupportedOperationException();
  }
  /* Imprime la clase con un espaciado determinado
   *
   * */
  public String print(String espaciado){
    throw new UnsupportedOperationException();
  }

  /*Aplica el descuento en la clase*/
  public void aplicarDescuento(int descuento){
    throw new UnsupportedOperationException();
  }
}
