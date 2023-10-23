package Composite; 

public abstract class CatalogoComponente{
  
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
  public void add(CatalogoComponente catalogo){
    throw new UnsupportedOperationException();
  } 
  public void remove(CatalogoComponente catalogo){
    throw new UnsupportedOperationException();
  }
  public CatalogoComponente getChild(int i) throws CodigoIncorrectoException{
    throw new UnsupportedOperationException();
  }
  public String print(String espaciado){
    throw new UnsupportedOperationException();
  }
  public void aplicarDescuento(int descuento){
    throw new UnsupportedOperationException();
  }
}
