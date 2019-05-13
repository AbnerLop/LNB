package edu.itesm.lnb.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.List;

import edu.itesm.lnb.Models.QuestionItem;
import edu.itesm.lnb.Models.RecetaItem;
import edu.itesm.lnb.R;

public class QAdapter extends RecyclerView.Adapter<QAdapter.QViewHolder>{

    private List<QuestionItem> listItems;
    private Context context;

    public QAdapter(List<QuestionItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @NonNull
    @Override
    public QViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_preguntas, viewGroup, false);
        return new QAdapter.QViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull QViewHolder qViewHolder, int i) {
        final QuestionItem questionItem = listItems.get(i);
        qViewHolder.question.setText(questionItem.getQuestion());
        qViewHolder.answer1.setText(questionItem.getAnswer1());
        qViewHolder.answer2.setText(questionItem.getAnswer2());
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class QViewHolder extends RecyclerView.ViewHolder{

        public TextView question;
        public RadioButton answer1;
        public RadioButton answer2;

        public QViewHolder(@NonNull View itemView) {
            super(itemView);

            question = itemView.findViewById(R.id.pregunta1);
            answer1 = itemView.findViewById(R.id.respuesta1_1);
            answer2 = itemView.findViewById(R.id.respuesta1_2);
        }
    }
}
