package Composite; 
import Proxy.User;
import State.CheemsMark;

public class MenuDepartamental {
    User usuario;
    CatalogoComponente catalogo;
    
    public MenuDepartamental(User usuario){
      this.usuario = usuario;
      this.catalogo = new ConjuntoDepartamental(usuario.getIdioma().nombreTienda(), usuario.getIdioma().descripcionTienda());
      generarDepartamentos();
    }

    public String getMenu(){
      try {
        switch (usuario.getPais()) {
          case "Mexico":
            ((ConjuntoDepartamental)catalogo).getDepartamento(33).aplicarDescuento(usuario.getDescuento());
            break;
          case "Espania":
            ((ConjuntoDepartamental)catalogo).getDepartamento(55).aplicarDescuento(usuario.getDescuento());
            break; 
          case "Estados Unidos":
            ((ConjuntoDepartamental)catalogo).getDepartamento(15).aplicarDescuento(usuario.getDescuento());
            break;
        }
      }catch(Exception e){
        //System.err.println(usuario.getIdioma().errorAplicarDescuento());
      }
      return catalogo.print("");
    }

    public CatalogoComponente getChild(int i) throws CodigoIncorrectoException{
      return catalogo.getChild(i);
    }
    
    public void generarDepartamentos(){
      // Creamos los departamentos y el menu que almacenará a todos los departamentos
      CatalogoComponente departamentoElectrodomesticos = new Departamento("Electrodomesticos", "Todos los electrodomesticos y linea blanca.",55);
      CatalogoComponente departamentoElectronica = new Departamento("Electronica", "Todos los productos de electronica.",15);
      CatalogoComponente departamentoAlimentos = new Departamento("Alimentos", "Todos los productos de despensa y alimentos.",33);
      CatalogoComponente departamentoRopa = new Departamento("Ropa", "Todos los productos de ropa y accesorios",39);
      CatalogoComponente departamentoMascotas = new Departamento("Mascotas", "Todos los productos que tu bendicion necesita",57);
    

      // Agregando los productos
      departamentoElectrodomesticos.add(new CatalogoItem("Lavadora Whirpeel", 
                                                        563055,
                                                        14699, 
                                                        departamentoElectrodomesticos.getNombre(),
                                                        "La mejor lavadora del mercado y secadora del mercado."));
      departamentoElectrodomesticos.add(new CatalogoItem("Microondas Whirpeel", 
                                                        52355,
                                                        3299, 
                                                        departamentoElectrodomesticos.getNombre(),
                                                        "Super horno con campana extractora."));                                  
      departamentoElectrodomesticos.add(new CatalogoItem("Refrigerador Mebe", 
                                                        51255,
                                                        7899, 
                                                        departamentoElectrodomesticos.getNombre(),
                                                        "Refrigerador 10 pies con maquina generadora de hielo."));
      departamentoElectrodomesticos.add(new CatalogoItem("Estufa Whirpeel", 
                                                        58255,
                                                        5390, 
                                                        departamentoElectrodomesticos.getNombre(),
                                                        "Estufa grande con 6 quemadores y horno."));
        
      departamentoElectronica.add(new CatalogoItem("Pantalla 60 pulgadas LJ", 
                                                    42015,
                                                    17999, 
                                                    departamentoElectronica.getNombre(),
                                                    "Pantalla 4k de 60 pulgadas, HDR, Cristal UHD y todas esas cosas de las teles."));
      departamentoElectronica.add(new CatalogoItem("Lapot ASIR", 
                                                    41615,
                                                    15000, 
                                                    departamentoElectronica.getNombre(),
                                                    "Laptop de 15.6 pulgadas, Ryzen 5 3500U, 500 Gb SSD, 16 Gb RAM."));                                  
      departamentoElectronica.add(new CatalogoItem("Poly Station 5", 
                                                    479415,
                                                    10999, 
                                                    departamentoElectronica.getNombre(),
                                                    "Por si no te alcanza para el play station original, esta bien prro caro."));
      departamentoElectronica.add(new CatalogoItem("Nientiendo Switch", 
                                                    41215,
                                                    6000, 
                                                    departamentoElectronica.getNombre(),
                                                    "Ahora tu tia tendra la razon al decir que dejes ese Nientiendo con esta consola."));
      departamentoAlimentos.add(new CatalogoItem("Nutelle",
                                                309133,
                                                45,
                                                departamentoAlimentos.getNombre(), 
                                                "Ahora con mas chocolate que avellana."));
      departamentoAlimentos.add(new CatalogoItem("Arroz del Cerro",
                                                364433,
                                                32,
                                                departamentoAlimentos.getNombre(), 
                                                "1 kg de arroz. Y ya."));
      departamentoAlimentos.add(new CatalogoItem("Cornfleis",
                                                30233,
                                                75,
                                                departamentoAlimentos.getNombre(), 
                                                "Ricas hojuelas de maiz endulzadas con miel."));
      departamentoAlimentos.add(new CatalogoItem("Pasta Antigua",
                                                369133,
                                                18,
                                                departamentoAlimentos.getNombre(), 
                                                "Pasta linguini de 400 g."));
      departamentoMascotas.add(new CatalogoItem("Croquetas Campeon",
                                                29639,
                                                1299,
                                                departamentoMascotas.getNombre(),
                                                "Bulto de 25 kg de croquetas de cordero. Aiuda aun no nos avala PROFECO."));
      departamentoMascotas.add(new CatalogoItem("Juguete Chillon",
                                                28639,
                                                200,
                                                departamentoMascotas.getNombre(),
                                                "Juguete chillon en forma de hueso resistente."));
      departamentoMascotas.add(new CatalogoItem("Collar de picos",
                                                12639,
                                                300,
                                                departamentoMascotas.getNombre(),
                                                "Correa resistente e imponente. Ideal para tu pitbull de 40 kilos al que le dices Princesa."));
      departamentoMascotas.add(new CatalogoItem("Shampoo tio Pancho",
                                                29639,
                                                400,
                                                departamentoMascotas.getNombre(),
                                                "Shampoo ideal contra la caida del pelo."));
      departamentoRopa.add(new CatalogoItem("Playera basica",
                                            12857,
                                            150,
                                            departamentoRopa.getNombre(),
                                            "Playera basica ideal para este verano."));
      departamentoRopa.add(new CatalogoItem("Pantalon basico",
                                            11057,
                                            350,
                                            departamentoRopa.getNombre(),
                                            "Pantalon basico agujereado, ideal para este verano."));
      departamentoRopa.add(new CatalogoItem("Blazer",
                                            129457,
                                            650,
                                            departamentoRopa.getNombre(),
                                            "Blazer monocromatico que te hara lucir aesthetic."));
      departamentoRopa.add(new CatalogoItem("Chaqueta",
                                            176257,
                                            550,
                                            departamentoRopa.getNombre(),
                                            "Chaqueta ligera de diseño clasico."));

      catalogo.add(departamentoElectrodomesticos);
      catalogo.add(departamentoElectronica);
      catalogo.add(departamentoAlimentos);
      catalogo.add(departamentoRopa);
      catalogo.add(departamentoMascotas);
                    
    }
}
