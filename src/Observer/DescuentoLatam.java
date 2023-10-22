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

  public String getProductos(){
    return menu.getDepartamentoAlimentos().toString();
  }
}
