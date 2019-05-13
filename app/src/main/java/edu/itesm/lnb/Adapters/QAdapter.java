package edu.itesm.lnb.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.List;

import edu.itesm.lnb.Models.QuestionItem;
import edu.itesm.lnb.Models.RecetaItem;
import edu.itesm.lnb.R;

public class QAdapter extends RecyclerView.Adapter<QAdapter.QViewHolder>{

    private List<QuestionItem> listItems;
    private Context context;
    private boolean primera;
    private boolean segunda;
    private boolean tercera;
    private boolean cuarta;
    private boolean quinta;
    private boolean sexta;
    private boolean septima;
    private boolean octava;

    public boolean isPrimera() {
        return primera;
    }

    public boolean isSegunda() {
        return segunda;
    }

    public boolean isTercera() {
        return tercera;
    }

    public boolean isCuarta() {
        return cuarta;
    }

    public boolean isQuinta() {
        return quinta;
    }

    public boolean isSexta() {
        return sexta;
    }

    public boolean isSeptima() {
        return septima;
    }

    public boolean isOctava() {
        return octava;
    }

    public QAdapter(List<QuestionItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
        this.primera = true;
        this.segunda = false;
        this.tercera = true;
        this.cuarta = true;
        this.quinta = true;
        this.sexta = true;
        this.septima = true;
        this.octava = true;
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
        switch (i){
            case 0:
                qViewHolder.radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch (checkedId){
                            case R.id.respuesta1_1:
                                primera = true;
                                break;
                            case R.id.respuesta1_2:
                                primera = false;
                                break;
                        }
                    }
                });
                break;
            case 1:
                qViewHolder.radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch (checkedId){
                            case R.id.respuesta1_1:
                                segunda = true;
                                break;
                            case R.id.respuesta1_2:
                                segunda = false;
                                break;
                        }
                    }
                });
                break;
            case 2:
                qViewHolder.radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch (checkedId){
                            case R.id.respuesta1_1:
                                tercera = true;
                                break;
                            case R.id.respuesta1_2:
                                tercera = false;
                                break;
                        }
                    }
                });
                break;
            case 3:
                qViewHolder.radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch (checkedId){
                            case R.id.respuesta1_1:
                                cuarta = true;
                                break;
                            case R.id.respuesta1_2:
                                cuarta = false;
                                break;
                        }
                    }
                });
                break;
            case 4:
                qViewHolder.radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch (checkedId){
                            case R.id.respuesta1_1:
                                quinta = true;
                                break;
                            case R.id.respuesta1_2:
                                quinta = false;
                                break;
                        }
                    }
                });
                break;
            case 5:
                qViewHolder.radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch (checkedId){
                            case R.id.respuesta1_1:
                                sexta = true;
                                break;
                            case R.id.respuesta1_2:
                                sexta = false;
                                break;
                        }
                    }
                });
                break;
            case 6:
                qViewHolder.radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch (checkedId){
                            case R.id.respuesta1_1:
                                septima = true;
                                break;
                            case R.id.respuesta1_2:
                                septima = false;
                                break;
                        }
                    }
                });
                break;
            case 7:
                qViewHolder.radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch (checkedId){
                            case R.id.respuesta1_1:
                                octava = true;
                                break;
                            case R.id.respuesta1_2:
                                octava = false;
                                break;
                        }
                    }
                });
                break;
        }

    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class QViewHolder extends RecyclerView.ViewHolder{

        public TextView question;
        public RadioButton answer1;
        public RadioButton answer2;
        private RadioGroup radioGroup;
        private Button evaluarBtn;

        public QViewHolder(@NonNull View itemView) {
            super(itemView);

            question = itemView.findViewById(R.id.pregunta1);
            answer1 = itemView.findViewById(R.id.respuesta1_1);
            answer2 = itemView.findViewById(R.id.respuesta1_2);
            radioGroup = itemView.findViewById(R.id.respuestas1);
        }
    }
}
