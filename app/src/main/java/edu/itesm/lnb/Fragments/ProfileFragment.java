package edu.itesm.lnb.Fragments;

import android.app.ProgressDialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import edu.itesm.lnb.Adapters.NutrimentAdapter;
import edu.itesm.lnb.Adapters.QAdapter;
import edu.itesm.lnb.Models.NutrimentItem;
import edu.itesm.lnb.Models.QuestionItem;
import edu.itesm.lnb.R;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ProfileFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ProfileFragment#newInstance} factory method to
 * create an instance of this fragment.
 */


public class ProfileFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;
    private ListView preguntas;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    private List<QuestionItem> listItems;

    public ProfileFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ProfileFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ProfileFragment newInstance(String param1, String param2) {
        ProfileFragment fragment = new ProfileFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //preguntas = (ListView)getView().findViewById(R.id.preguntas);

        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        listItems = new ArrayList<>();

        loadRecyclerViewData(view);

        return view;
    }

    private void loadRecyclerViewData(View view) {
        final ProgressDialog progressDialog = new ProgressDialog(getActivity());
        progressDialog.setMessage("Loading data");
        progressDialog.show();

        QuestionItem question1 = new QuestionItem(
                view.getContext().getResources().getString(R.string.pregunta1),
                view.getContext().getResources().getString(R.string.respuesta1_1),
                view.getContext().getResources().getString(R.string.respuesta1_2)

        );
        listItems.add(question1);

        QuestionItem question2 = new QuestionItem(
                view.getContext().getResources().getString(R.string.pregunta2),
                view.getContext().getResources().getString(R.string.respuesta2_1),
                view.getContext().getResources().getString(R.string.respuesta1_2)

        );
        listItems.add(question2);

        QuestionItem question3 = new QuestionItem(
                view.getContext().getResources().getString(R.string.pregunta3),
                view.getContext().getResources().getString(R.string.respuesta3_1),
                view.getContext().getResources().getString(R.string.respuesta3_2)

        );
        listItems.add(question3);

        QuestionItem question4 = new QuestionItem(
                view.getContext().getResources().getString(R.string.pregunta4),
                view.getContext().getResources().getString(R.string.respuesta4_1),
                view.getContext().getResources().getString(R.string.respuesta4_2)

        );
        listItems.add(question4);

        QuestionItem question5 = new QuestionItem(
                view.getContext().getResources().getString(R.string.pregunta5),
                view.getContext().getResources().getString(R.string.respuesta5_1),
                view.getContext().getResources().getString(R.string.respuesta5_2)

        );
        listItems.add(question5);

        QuestionItem question6 = new QuestionItem(
                view.getContext().getResources().getString(R.string.pregunta6),
                view.getContext().getResources().getString(R.string.respuesta6_1),
                view.getContext().getResources().getString(R.string.respuesta6_2)

        );
        listItems.add(question6);

        QuestionItem question7 = new QuestionItem(
                view.getContext().getResources().getString(R.string.pregunta7),
                view.getContext().getResources().getString(R.string.respuesta7_1),
                view.getContext().getResources().getString(R.string.respuesta7_2)

        );
        listItems.add(question7);

        QuestionItem question8 = new QuestionItem(
                view.getContext().getResources().getString(R.string.pregunta8),
                view.getContext().getResources().getString(R.string.respuesta8_1),
                view.getContext().getResources().getString(R.string.respuesta8_2)

        );
        listItems.add(question8);

        adapter = new QAdapter(listItems, getActivity());
        recyclerView.setAdapter(adapter);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
