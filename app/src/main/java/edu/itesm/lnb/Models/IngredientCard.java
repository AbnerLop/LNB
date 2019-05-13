package edu.itesm.lnb.Models;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import edu.itesm.lnb.Adapters.IngredientAdapter;
import edu.itesm.lnb.Adapters.RecetaAdapter;
import edu.itesm.lnb.R;

public class IngredientCard extends AppCompatActivity {

    private RecyclerView recyclerView;
    private TextView title;
    private TextView prep;
    private RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receta_card);
        RecetaItem recetaCard = (RecetaItem) getIntent().getSerializableExtra("receta");

        recyclerView = findViewById(R.id.recyclerView);
        title = findViewById(R.id.id_titulo);
        prep = findViewById(R.id.prep);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        loadRecyclerViewData(recetaCard);


    }

    private void loadRecyclerViewData(RecetaItem recetaItem) {
        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Loading data");
        progressDialog.show();

        progressDialog.dismiss();
        adapter = new IngredientAdapter(recetaItem.getIngredientes(), getApplicationContext(), recetaItem.getTitulo());
        recyclerView.setAdapter(adapter);
        title.setText(recetaItem.getTitulo());
        prep.setText(recetaItem.getPreparacion());

    }

}
