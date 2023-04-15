package domain;

public class TipoPrenda {

  public Categoria categoria;

  public TipoPrenda(Categoria cat){
    this.categoria = cat;

  }

  public Categoria categoria(){
    return this.categoria;
  }

  enum Categoria {
    PARTE_SUPERIOR , ACCESORIOS , PARTE_INFERIOR , CALZADO
  }
}
