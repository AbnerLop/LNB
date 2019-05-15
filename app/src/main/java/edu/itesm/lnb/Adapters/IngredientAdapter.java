package edu.itesm.lnb.Adapters;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import edu.itesm.lnb.R;

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
        /*CardView cardView = v.findViewById(R.id.card);

        List<String> colors;

        colors= new ArrayList<>();

        colors.add("#5E97F6");
        colors.add("#9CCC65");
        colors.add("#FF8A65");
        colors.add("#9E9E9E");
        colors.add("#9FA8DA");
        colors.add("#90A4AE");
        colors.add("#AED581");
        colors.add("#F6BF26");
        colors.add("#FFA726");
        colors.add("#4DD0E1");
        colors.add("#BA68C8");
        colors.add("#A1887F");

        Random r = new Random();
        int i1 = r.nextInt(11- 0) + 0;

        GradientDrawable draw = new GradientDrawable();
        draw.setColor(Color.parseColor(colors.get(i1)));

        cardView.setBackground(draw);*/

        return new IngredientAdapter.IngredientViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull IngredientAdapter.IngredientViewHolder recetaViewHolder, int i) {
        String recetaItem = listItems.get(i);
        recetaViewHolder.textViewIngredientes.setText(recetaItem);
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
        }
    }

}
