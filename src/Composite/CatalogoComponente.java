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
  public String getNombre(){
    throw new UnsupportedOperationException();
  }
  public String getDescription(){
    throw new UnsupportedOperationException();
  }
  public void add(CatalogoComponente componente){
    throw new UnsupportedOperationException();
  } 
  public void remove(CatalogoComponente componente){
    throw new UnsupportedOperationException();
  }
  public CatalogoComponente getChild(int i){
    throw new UnsupportedOperationException();
  }
  public String toString(){
    throw new UnsupportedOperationException();
  }
  public void aplicarDescuento(int descuento){
    throw new UnsupportedOperationException();
  }
}
