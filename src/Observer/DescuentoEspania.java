package Observer; 

import java.util.ArrayList; 

public class DescuentoEspania implements RegionDescuento{
  ArrayList<Observer> lista; 
  int descuento;

  public DescuentoEspania(){
    lista = new ArrayList<Observer>();
  }
  public void registerObserver(Observer observer){
    lista.add(observer);
  }
  public void removeObserver(Observer observer){
    lista.remove(observer);
  }
  public void notifyObserver(){
    for(Observer observer : lista)
      observer.actualizarDescuento(this.descuento);
  }
  public void actualizarDescuento(int descuento){
    this.descuento = descuento;
  }
}
