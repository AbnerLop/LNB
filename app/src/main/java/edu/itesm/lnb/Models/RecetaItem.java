package edu.itesm.lnb.Models;

import java.io.Serializable;
import java.util.List;

public class RecetaItem implements Serializable {
    private String titulo;
    private List<String> ingredientes;
    private String preparacion;

    public RecetaItem(String titulo, List<String> ingredientes, String preparacion) {
        this.titulo = titulo;
        this.ingredientes = ingredientes;
        this.preparacion = preparacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public String niceString() {
        String niceIngredientes = "";
        for (int i = 0; i < this.ingredientes.size(); i++){
            niceIngredientes = niceIngredientes + ", " + this.ingredientes.get(i);
        }
        return niceIngredientes;
    }
}
