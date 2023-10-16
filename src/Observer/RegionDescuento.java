package Observer; 

public interface RegionDescuento{
  public void registerObserver(Observer observer);
  public void removeObserver(Observer observer);
  public void notifyObserver(Observer observer);
}
