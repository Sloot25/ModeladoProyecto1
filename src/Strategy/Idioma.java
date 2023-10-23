package Strategy;

import java.io.Serializable;

public interface Idioma extends Serializable{
  public String ofertas();
  public String opciones();
  public String entrega();
  public String completarCompra();
  public String despedirse();
  public String saludar();
  public String repeticionCatalogo();
  public String cerrarSesion();
  public String sesionIniciada();
  public String bienvenidaCompra();
  public String costo();
  public String continuarCompra();
  public String escogeOpcion();
  public String noEsNumero();
  public String seguirComprando();
  public String codigoIncorrecto();
  public String iniciandoCompra();
  public String compraFinalizada();
  public String baneado();
  public String nombreTienda();
  public String descripcionTienda();
}
