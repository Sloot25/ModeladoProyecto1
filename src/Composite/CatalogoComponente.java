package Composite; 

public abstract class CatalogoComponente{
  public String getDepartamento(){
    throw new UnSupportedOperationException();
  }
  public int getCodigo(){
    throw new UnSupportedOperationException();
  }
  public int getPrecio(){
    throw new UnSupportedOperationException();
  }
  public String getNombre(){
    throw new UnSupportedOperationException();
  }
  public String getDEscription(){
    throw new UnSupportedOperationException();
  }
  public void add(CatalogoComponente componente){
    throw new UnSupportedOperationException();
  } 
  public void remove(CatalogoComponente componente){
    throw new UnSupportedOperationException();
  }
  public CatalogoComponente getChild(int i){
    throw new UnSupportedOperationException();
  }
  public String toString(){
    throw new UnSupportedOperationException();
  }
}
