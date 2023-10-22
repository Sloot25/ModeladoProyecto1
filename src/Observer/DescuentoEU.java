package Observer; 

import java.util.ArrayList;
import Composite.MenuDepartamental;
import State.CheemsMark; 

public class DescuentoEU extends RegionDescuento{
  ArrayList<Observer> lista; 
  MenuDepartamental menu;
  int descuento; 
  public DescuentoEU(CheemsMark cheemsMark){
    this.lista = new ArrayList<Observer>();
    menu = new MenuDepartamental(cheemsMark);
  }
  public void registerObserver(Observer observer){
    this.lista.add(observer); 
  }
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
  public String getProductos(){
    return menu.getDepartamentoElectronica().toString();
  }
}


