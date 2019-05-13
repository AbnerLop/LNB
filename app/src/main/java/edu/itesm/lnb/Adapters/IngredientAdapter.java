package edu.itesm.lnb.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import edu.itesm.lnb.Models.IngredientItem;
import edu.itesm.lnb.R;
import edu.itesm.lnb.Models.RecetaItem;

public class IngredientAdapter extends RecyclerView.Adapter<IngredientAdapter.IngredientViewHolder> {

    private List<String> listItems;
    private Context context;
    private String titulo;

    public IngredientAdapter(List<String> listItems, Context context, String titulo) {
        this.listItems = listItems;
        this.context = context;
        this.titulo = titulo;
    }

    @NonNull
    @Override
    public IngredientAdapter.IngredientViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ingredient_item, viewGroup, false);
        return new IngredientAdapter.IngredientViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull IngredientAdapter.IngredientViewHolder recetaViewHolder, int i) {
        String recetaItem = listItems.get(i);

        //recetaViewHolder.textViewTitulo.setText(titulo);
        recetaViewHolder.textViewIngredientes.setText(recetaItem);
        //recetaViewHolder.textViewIngredientes.setText(listItems);
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }
    public  class IngredientViewHolder extends RecyclerView.ViewHolder{

        public TextView textViewTitulo;
        public TextView textViewIngredientes;
        public TextView textViewPreparacion;

        public IngredientViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewTitulo = itemView.findViewById(R.id.Title);
            textViewIngredientes = itemView.findViewById(R.id.id_ingrediente);
            textViewPreparacion = itemView.findViewById(R.id.preparacion);
        }
    }

}
