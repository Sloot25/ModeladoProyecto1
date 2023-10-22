package Observer; 

import java.util.ArrayList; 

public class DescuentoEU implements RegionDescuento{
  ArrayList<Observer> lista; 
  public DescuentoEU(){
    this.lista = new ArrayList<Observer>();
  }
  public void registerObserver(Observer observer){ this.lista.add(observer); }
  public void removeObserver(Observer observer){
    this.lista.remove(observer);
  }
  public void notifyObserver(int descuento){
    for(Observer observer : lista)
      observer.actualizarDescuento(descuento);
  }
}


