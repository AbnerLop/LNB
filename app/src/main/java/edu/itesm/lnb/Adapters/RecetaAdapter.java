package edu.itesm.lnb.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import edu.itesm.lnb.Models.IngredientCard;
import edu.itesm.lnb.Models.NutriCard;
import edu.itesm.lnb.Models.NutrimentItem;
import edu.itesm.lnb.R;
import edu.itesm.lnb.Models.RecetaItem;

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
    public void onBindViewHolder(@NonNull final RecetaAdapter.RecetaViewHolder viewHolder, int i) {
        final RecetaItem recetaItem = listItems.get(i);
        viewHolder.textViewTitulo.setText(recetaItem.getTitulo());

        viewHolder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RecetaItem recetaCard = listItems.get(viewHolder.getAdapterPosition());
                Intent it = new Intent(context, IngredientCard.class);
                it.putExtra("receta", recetaCard);
                context.startActivity(it);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public  class RecetaViewHolder extends RecyclerView.ViewHolder{

        public TextView textViewTitulo;
        public LinearLayout linearLayout;

        public RecetaViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewTitulo = itemView.findViewById(R.id.Title);
            linearLayout = itemView.findViewById(R.id.linearLayoutReceta);
        }
    }
}
