package edu.itesm.lnb.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

import edu.itesm.lnb.Models.IngredientCard;
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
        HostnameVerifier hostnameVerifier = org.apache.http.conn.ssl.SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER;


        Glide.with(context).load(listItems.get(i).getImgURL()).into(viewHolder.image);
        viewHolder.constraintLayoutReceta.setOnClickListener(new View.OnClickListener() {
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
        public ConstraintLayout constraintLayoutReceta;
        public ImageView image;

        public RecetaViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewTitulo = itemView.findViewById(R.id.Title);
            constraintLayoutReceta = itemView.findViewById(R.id.constraintLayoutReceta);
            image = itemView.findViewById(R.id.card);
        }
    }
}
