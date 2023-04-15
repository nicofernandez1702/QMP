package domain;

import java.awt.*;
import java.util.Objects;

public class Prenda {

  public TipoPrenda tipo ;
  public Material material;
  public Color colorPrincipal;
  public Color colorSecundario;

  public Prenda(TipoPrenda tipo, Material mat, Color color1, Color color2){
    this.tipo = Objects.requireNonNull(tipo);
    this.material = Objects.requireNonNull(mat);
    this.colorPrincipal = Objects.requireNonNull(color1);
    this.colorSecundario= Objects.requireNonNull(color2);
  }
}
