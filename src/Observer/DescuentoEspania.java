package Observer; 

import java.util.ArrayList; 

public class DescuentoEspania implements RegionDescuento{
  ArrayList<Observer> lista; 

  public DescuentoEspania(){
    lista = new ArrayList<Observer>();
  }
  public void registerObserver(Observer observer){
    lista.add(observer);
  }
  public void removeObserver(Observer observer){
    lista.remove(observer);
  }
  public void notifyObserver(int descuento){
    for(Observer observer : lista)
      observer.actualizarDescuento(descuento);
  }
}
