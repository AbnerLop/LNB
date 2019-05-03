package edu.itesm.lnb;

import java.io.Serializable;
import java.util.List;

public class NutrimentItem implements Serializable {
    private String Name;
    private List<RecetaItem> recetas;

    public NutrimentItem(String name, List<RecetaItem> recetas) {
        Name = name;
        this.recetas = recetas;
    }

    public String getName() {
        return Name;
    }

    public List<RecetaItem> getRecetas() {
        return recetas;
    }
}
