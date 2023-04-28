package domain;

import ENUMS.Categoria;

public class TipoPrenda {

  public Categoria categoria;

  public TipoPrenda(Categoria cat){
    this.categoria = cat;

  }

  public Categoria categoria(){
    return this.categoria;
  }




}
