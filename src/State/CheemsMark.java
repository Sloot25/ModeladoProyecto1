package State;

import Proxy.User;

public class CheemsMark {
  EstadoMark verCatalogo; 
  EstadoMark comprar; 
  EstadoMark compraSegura;
  EstadoMark iniciar;
  EstadoMark iniciarSesion;
  EstadoMark estadoActual;
  User usuario; 

  public CheemsMark(){
    this.verCatalogo = new Catalogo(this);
    this.comprar = new Comprar(this);
    this.compraSegura = new CompraSegura(this);
    this.iniciar = new Iniciar(this);
    this.iniciarSesion = new IniciarSesion(this);
    this.estadoActual = this.iniciar;
    
  }
  public User getUsuario(){ return this.usuario; }
  public EstadoMark getEstado(){ return this.estadoActual; }
  public EstadoMark getEstadoVerCatalogo(){ return this.verCatalogo; }
  public EstadoMark getEstadoComprar(){ return this.comprar; }
  public EstadoMark getEstadoCompraSegura(){ return this.compraSegura; }
  public EstadoMark getEstadoIniciar(){ return this.iniciar; }
  public EstadoMark getEstadoIniciarSesion(){ return this.iniciarSesion; }
  public void setEstado(EstadoMark estado){ this.estadoActual = estado; }
  public boolean inicializarEstado(){ return this.estadoActual.inicializarEstado(); }
  public void setUsuario(User usuario){ this.usuario = usuario;}
}
