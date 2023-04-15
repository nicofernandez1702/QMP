package domain;

import java.awt.*;

public class Prenda {

  public TipoPrenda tipo ;
  public Material material;
  public Color colorPrincipal;
  public Color colorSecundario;

  public Prenda(TipoPrenda tipo, Material mat, Color color1, Color color2){
    this.tipo = tipo;
    this.material = mat;
    this.colorPrincipal = color1;
    this.colorSecundario= color2;
  }
}
