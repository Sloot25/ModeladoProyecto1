package Observer; 

import java.util.ArrayList; 

public class DescuentoEU implements RegionDescuento{
  ArrayList<Observer> lista; 
  int descuento; 
  public DescuentoEU(){
    this.lista = new ArrayList<Observer>();
  }
  public void registerObserver(Observer observer){ this.lista.add(observer); }
  public void removeObserver(Observer observer){
    this.lista.remove(observer);
  }
  public void notifyObserver(){
    for(Observer observer : lista)
      observer.actualizarDescuento(this.descuento);
  }
  public void actualizarDescuento(int descuento){
    this.descuento = descuento;
  }
}


