package edu.itesm.lnb.Models;

import java.io.Serializable;
import java.util.List;

public class IngredientItem implements Serializable {

    private String name;
    private String preparacion;

    public IngredientItem(String name, String preparacion) {
        this.name = name;
        this.preparacion = preparacion;
    }

    public String getIngredientes() {
        return name;
    }

    public String getPreparacion() {
        return preparacion;
    }

}
