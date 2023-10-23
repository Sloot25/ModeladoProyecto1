package Observer; 

import java.util.ArrayList; 

public class DescuentoEspania implements RegionDescuento{
  ArrayList<Observer> lista; 

  /*Constructor de la clase*/
  public DescuentoEspania(){
    lista = new ArrayList<Observer>();
  }
  /*Aniade nuevos observer a la lista 
   *
   * @param Observer observer a anaidir
   * */
  public void registerObserver(Observer observer){
    lista.add(observer);
  }
  /* Remueve observer de la lista  
   *
   *  @param Observer a remover
   * */
  public void removeObserver(Observer observer){
    lista.remove(observer);
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
