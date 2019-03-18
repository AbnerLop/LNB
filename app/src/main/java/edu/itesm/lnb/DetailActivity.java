package edu.itesm.lnb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        textView = (TextView) findViewById(R.id.detailTV);

        String string = getIntent().getStringExtra("file");
        String file = "file";

        //Add
        textView.setText(string);
    }

}
