package State;

import Proxy.User;

public class CheemsMark {
  EstadoMark iniciar;  
  EstadoMark iniciarSesion; 
  EstadoMark verCatalogo; 
  EstadoMark comprar;
  EstadoMark compraSegura;  
  EstadoMark cerrarSesion;
  EstadoMark salir; 
  EstadoMark estadoActual;
  User usuario; 
/* 
  public CheemsMark(User usuario){ this.usuario = usuario; }
  public User getUsuario(){ return this.usuario; }
  public EstadoMark getEstado(){ return this.estadoActual; }
  public EstadoMark getEstadoIngresar(){ return this.ingresar; }
  public EstadoMark getEstadoVerCatalogo(){ return this.verCatalogo; }
  public EstadoMark getEstadoSalir(){ return this.salir; }
  public EstadoMark getEstadoCerrarSesion(){ return this.cerrarSesion; }
  public EstadoMark getEstadoComprar(){ return this.comprar; }
  public void setEstado(EstadoMark estado){ this.estadoActual = estado; }
  public void inicializarEstado(){ this.estadoActual.inicializarEstado(); }
*/

  /* 
   * Metodo constructor
   */
  public CheemsMark(User usuario){
    this.usuario = usuario;
    this.estadoActual = iniciar; 
  }

  /*
  * Metodos getters y setters
  */
  public EstadoMark getEstado(){
    return this.estadoActual;
  }
  public void setEstado(EstadoMark estado){
    this.estadoActual = estado;
  }
  public User getUsuario(){
    return this.usuario;
  }
  /*
  * Metodos getters de cada EstadoMark. Se utilizan en las subclases de EstadoMark 
  * junto con el metodo setEstado() para actualizar el estado de la tienda..
  * 
  * @return: el nuevo estado instanciado
  */
  public EstadoMark getEstadoIniciar(){
    return this.iniciar;
  }
  public EstadoMark getEstadoVerCatalogo(){
    return this.verCatalogo;
  }
  public EstadoMark getEstadoComprar(){
    return this.comprar;
  }
  public EstadoMark getEstadoCompraSegura(){
    return this.compraSegura;
  }
  public EstadoMark getEstadoIniciarSesion(){
    return this.iniciarSesion;
  }
  public EstadoMark getEstadoCerrarSesion(){
    return this.cerrarSesion;
  }
  
 /*
  * Metodos que se encargaran de realizar la accion marcada dependiendo del estado actual del robot.
  */ 
  public void verCatalogo(){
    getEstado().verCatalogo();
  }
  public void comprar(){
    getEstado().comprar();
  }
  public void cerrarSesion(){
    getEstado().cerrarSesion();
  }
  public void salir(){
    getEstado().salir();
  }
  public void inicializarEstado(){
    getEstado().inicializarEstado();
  } 
}

