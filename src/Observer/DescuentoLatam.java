package Observer; 

import java.util.ArrayList;

public class DescuentoLatam implements RegionDescuento{
  ArrayList<Observer> lista; 
  public DescuentoLatam(){
    lista = new ArrayList<Observer>();
  }

  public void registerObserver(Observer observer){
    lista.add(observer);
  }

  public void removeObserver(Observer observer){
    lista.remove(observer);
  }

  public void notifyObserver(int descuento){
    System.out.println(descuento);
    for(Observer observer : lista)
      observer.actualizarDescuento(descuento);
  }
}
