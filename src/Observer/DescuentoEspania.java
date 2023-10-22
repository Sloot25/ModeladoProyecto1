package Observer; 

import java.util.ArrayList;

import Composite.MenuDepartamental;
import State.CheemsMark; 

public class DescuentoEspania extends RegionDescuento{
  ArrayList<Observer> lista; 
  int descuento;
  MenuDepartamental menu;

  public DescuentoEspania(CheemsMark cheemsMark){
    lista = new ArrayList<Observer>();
    menu = new MenuDepartamental(cheemsMark);
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
  public String getProductos(){
    return menu.getDepartamentoElectrodomesticos().toString();
  }
}
