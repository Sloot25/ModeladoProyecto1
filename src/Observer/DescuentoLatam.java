package Observer; 

import java.util.ArrayList;

public class DescuentoLatam implements RegionDescuento{
  ArrayList<Observer> lista; 
  int descuento;
  public DescuentoLatam(){
    lista = new ArrayList<Observer>();
  }

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
