package edu.itesm.lnb;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.List;

public class NutrimentAdapter extends RecyclerView.Adapter<NutrimentAdapter.ViewHolder> {

    private List<NutrimentItem> nutrimentItems;
    private Context context;

    public NutrimentAdapter(List<NutrimentItem> nutrimentItems, Context context) {
        this.nutrimentItems = nutrimentItems;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, viewGroup, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, int i) {
        final NutrimentItem nutrimentItem = nutrimentItems.get(i);

        viewHolder.textViewName.setText(nutrimentItem.getName());

        viewHolder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NutrimentItem nutriCard = nutrimentItems.get(viewHolder.getAdapterPosition());
                Toast.makeText(context, "", Toast.LENGTH_SHORT).show();
                Intent it = new Intent(context, NutriCard.class);
                it.putExtra("nutrimento", nutriCard);
                context.startActivity(it);
            }
        });
    }

    @Override
    public int getItemCount() {
        return nutrimentItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView textViewName;
        public LinearLayout linearLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewName = itemView.findViewById(R.id.textViewNutrimentName);
            linearLayout = itemView.findViewById(R.id.linearLayout);
        }
    }
}
