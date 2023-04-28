package domain;

import ENUMS.Trama;
import Exceptions.InicializacionFallidaException;
import java.util.Objects;

public class Prenda {

  private TipoPrenda tipo ;
  private Material material;
  private Color colorPrincipal;
  private Color colorSecundario;
  private Trama trama;

  public Prenda(TipoPrenda tipo, Material mat, Color color1, Trama trama){

    this.tipo = tipo;
    this.material = mat;
    this.colorPrincipal = color1;
    this.trama=trama;

  }

  public void setColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
  }
}
