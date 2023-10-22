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
  
  public String getProductos(){
    return menu.getDepartamentoElectrodomesticos().toString();
  }
}
