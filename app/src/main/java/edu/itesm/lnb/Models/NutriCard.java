package edu.itesm.lnb.Models;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import edu.itesm.lnb.R;
import edu.itesm.lnb.Adapters.RecetaAdapter;

public class NutriCard extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    private List<RecetaItem> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutri_card);
        NutrimentItem nutriCard = (NutrimentItem) getIntent().getSerializableExtra("nutrimento");
        //loadNutrimento(nutriCard);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listItems = new ArrayList<>();

        loadRecyclerViewData(nutriCard);


    }

    private void loadRecyclerViewData(NutrimentItem nutriCard) {
        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Loading data");
        progressDialog.show();
        for (int i = 0; i < nutriCard.getRecetas().size(); i++){

            RecetaItem item = new RecetaItem(
                    nutriCard.getRecetas().get(i).getTitulo(),
                    nutriCard.getRecetas().get(i).getIngredientes(),
                    nutriCard.getRecetas().get(i).getPreparacion(),
                    nutriCard.getRecetas().get(i).getImgURL()
            );
            listItems.add(item);
        }

        progressDialog.dismiss();
        adapter = new RecetaAdapter(listItems, getApplicationContext());
        recyclerView.setAdapter(adapter);
    }

}
