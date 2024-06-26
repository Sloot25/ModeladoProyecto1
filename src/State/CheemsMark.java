package State;

import Proxy.User;
import Proxy.BDUsuarios;

public class CheemsMark {
  EstadoMark verCatalogo; 
  EstadoMark comprar; 
  EstadoMark compraSegura;
  EstadoMark iniciar;
  EstadoMark iniciarSesion;
  EstadoMark estadoActual;
  BDUsuarios baseUsuarios;
  User usuario; 

  /*Constructor de la clase, inicializa los atributos*/
  public CheemsMark(){
    this.verCatalogo = new Catalogo(this);
    this.comprar = new Comprar(this);
    this.compraSegura = new CompraSegura(this);
    this.iniciar = new Iniciar(this);
    this.iniciarSesion = new IniciarSesion(this);
    this.estadoActual = this.iniciar;
    
  }
  /* Setters y getters de la clase*/
  public void setBaseUsuarios(BDUsuarios baseUsuarios){ this.baseUsuarios = baseUsuarios; }
  public BDUsuarios getBaseUsuarios(){ return this.baseUsuarios; }
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
