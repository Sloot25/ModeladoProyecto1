package Observer; 

import java.util.ArrayList;

import Composite.MenuDepartamental;
import State.CheemsMark;

public class DescuentoLatam extends RegionDescuento{
  ArrayList<Observer> lista; 
  int descuento;
  MenuDepartamental menu;
  public DescuentoLatam(CheemsMark cheemsMark){
    lista = new ArrayList<Observer>();
    menu = new MenuDepartamental(cheemsMark);
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
  public String getProductos(){
    return menu.getDepartamentoAlimentos().toString();
  }
}
