package domain;

import java.awt.*;
import java.util.Objects;

public class Prenda {

  public TipoPrenda tipo ;
  public Material material;
  public Color colorPrincipal;
  public Color colorSecundario;

  public Prenda(TipoPrenda tipo, Material mat, Color color1){
    if(tipo == null){
      throw new InicializacionFallidaException("Tipo de prenda nulo");
    }
    if(mat == null){
      throw new InicializacionFallidaException("Material de prenda nulo");
    }
    if(color1 == null){
      throw new InicializacionFallidaException("Color de prenda nulo");
    }
    this.tipo = Objects.requireNonNull(tipo);
    this.material = Objects.requireNonNull(mat);
    this.colorPrincipal = Objects.requireNonNull(color1);

  }

  public void setColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
  }
}
