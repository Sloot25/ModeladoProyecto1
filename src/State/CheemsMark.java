package State; 

public class CheemsMark {
  EstadoMark ingresar; 
  EstadoMark verCatalogo; 
  EstadoMark comprar; 
  EstadoMark cerrarSesion; 
  EstadoMark salir; 
  EstadoMark estadoActual;
  User user; 

  public CheemsMark(User usuario){ this.usuario = usuario; }
  public User getUsuario(){ return this.usuario; }
  public EstadoMark getEstado(){ return this.estado; }
  public EstadoMark getEstadoIngresar(){ return this.ingresar; }
  public EstadoMark getEstadoVerCatalogo(){ return this.verCatalogo; }
  public EstadoMark getEstadoSalir(){ return this.salir; }
  public EstadoMark getEstadoCerrarSesion(){ return this.cerrarSesion; }
  public EstadoMark getEstadoComprar(){ return this.comprar; }
}
