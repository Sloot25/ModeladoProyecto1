package State;

import Proxy.User;

public class CheemsMark {
  EstadoMark ingresar; 
  EstadoMark verCatalogo; 
  EstadoMark comprar; 
  EstadoMark compraSegura;
  EstadoMark iniciar;
  EstadoMark iniciarSesion;
  EstadoMark cerrarSesion; 
  EstadoMark salir; 
  EstadoMark estadoActual;
  User usuario; 

  public CheemsMark(User usuario){ this.usuario = usuario; }
  public User getUsuario(){ return this.usuario; }
  public EstadoMark getEstado(){ return this.estadoActual; }
  public EstadoMark getEstadoIngresar(){ return this.ingresar; }
  public EstadoMark getEstadoVerCatalogo(){ return this.verCatalogo; }
  public EstadoMark getEstadoSalir(){ return this.salir; }
  public EstadoMark getEstadoCerrarSesion(){ return this.cerrarSesion; }
  public EstadoMark getEstadoComprar(){ return this.comprar; }
  public EstadoMark getEstadoCompraSegura(){ return this.compraSegura; }
  public EstadoMark getEstadoIniciar(){ return this.iniciar; }
  public EstadoMark getEstadoIniciarSesion(){ return this.iniciarSesion; }
  public void setEstado(EstadoMark estado){ this.estadoActual = estado; }
  public void inicializarEstado(){ this.estadoActual.inicializarEstado(); }
}
