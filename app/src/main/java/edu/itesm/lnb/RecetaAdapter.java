package edu.itesm.lnb;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.List;

public class RecetaAdapter extends RecyclerView.Adapter<RecetaAdapter.RecetaViewHolder> {

    private List<RecetaItem> listItems;
    private Context context;

    public RecetaAdapter(List<RecetaItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @NonNull
    @Override
    public RecetaAdapter.RecetaViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.receta_item, viewGroup, false);
        return new RecetaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecetaAdapter.RecetaViewHolder viewHolder, int i) {
        RecetaItem recetaItem = listItems.get(i);
        viewHolder.textViewTitulo.setText(recetaItem.getTitulo());
        //test
        viewHolder.textViewIngredientes.setText(recetaItem.niceString());
        viewHolder.textViewPreparacion.setText(recetaItem.getTitulo());
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public  class RecetaViewHolder extends RecyclerView.ViewHolder{

        public TextView textViewTitulo;
        public TextView textViewIngredientes;
        public TextView textViewPreparacion;

        public RecetaViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewTitulo = itemView.findViewById(R.id.id_titulo);
            textViewIngredientes = itemView.findViewById(R.id.id_ingredientes);
            textViewPreparacion = itemView.findViewById(R.id.preparacion);
        }
    }
}
