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

  public String getProductos(){
    return menu.getDepartamentoElectronica().toString();
  }
}


