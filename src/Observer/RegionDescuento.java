package Observer;

import java.util.ArrayList;

public abstract class RegionDescuento{
  ArrayList<Observer> lista; 
  int descuento;

  public void registerObserver(Observer observer){
    lista.add(observer);
  }

  public void removeObserver(Observer observer){
    lista.remove(observer);
  }
  public void actualizarDescuento(int numero){
    this.descuento = numero;
  }
  
  public void notifyObserver(){
    for(Observer observer : lista)
      observer.actualizarDescuento(this.descuento);
  }
}
