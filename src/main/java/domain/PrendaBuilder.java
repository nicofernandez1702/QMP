package domain;

import ENUMS.Trama;
import Exceptions.InicializacionFallidaException;

public class PrendaBuilder {

  private TipoPrenda tipoDePrenda;
  private Material mat ;
  private Color colorPrincipal;
  private Trama tramaTela = Trama.LISA;

  public Prenda buildPrenda(){
    //validacion
    if(tipoDePrenda == null){
      throw new InicializacionFallidaException("Tipo de prenda nulo");
    }
    if(mat == null){
      throw new InicializacionFallidaException("Material de prenda nulo");
    }
    if(colorPrincipal == null){
      throw new InicializacionFallidaException("Color de prenda nulo");
    }

    return new Prenda(tipoDePrenda,mat,colorPrincipal,tramaTela);
  }
  public void seleccionarTipo(TipoPrenda tipo){
    this.tipoDePrenda = tipo;

  }
  public void seleccionarMaterial(Material material){
    this.mat = material;

  }
  public void seleccionarColorPrincipal(Color color){
    this.colorPrincipal = color;

  }

  public void seleccionarTrama(Trama trama){
    this.tramaTela = trama;

  }

}
