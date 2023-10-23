package Observer; 

import java.util.ArrayList; 

public class DescuentoEU implements RegionDescuento{
  ArrayList<Observer> lista; 
  /*Constructor de la clase*/
  public DescuentoEU(){
    this.lista = new ArrayList<Observer>();
  }
  /*Aniade nuevos observer a la lista 
   *
   * @param Observer observer a anaidir
   * */
  public void registerObserver(Observer observer){ this.lista.add(observer); }

  /* Remueve observer de la lista  
   *
   *  @param Observer a remover
   * */
  public void removeObserver(Observer observer){
    this.lista.remove(observer);
  }

  /*Nofitica a los Observer sobre un nuevo valor de descuento 
   *
   *  @param int descuento
   * */
  public void notifyObserver(int descuento){
    for(Observer observer : lista)
      observer.actualizarDescuento(descuento);
  }
}


