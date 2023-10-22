package Observer; 

import java.io.Serializable;
public interface RegionDescuento extends Serializable{
  public void registerObserver(Observer observer);
  public void removeObserver(Observer observer);
  public void notifyObserver();
}
