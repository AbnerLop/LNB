package edu.itesm.lnb.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import edu.itesm.lnb.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link SugerenciasFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link SugerenciasFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SugerenciasFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    private TextView respuestaApp1;
    private TextView respuestaApp2;
    private TextView respuestaApp3;
    private TextView respuestaApp4;
    private TextView respuestaApp5;
    private TextView respuestaApp6;
    private TextView respuestaApp7;
    private TextView respuestaApp8;
    private Button magia;
    private ArrayList<String> nutrimentosSugeridos;
    private boolean dietas;

    public SugerenciasFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SugerenciasFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SugerenciasFragment newInstance(String param1, String param2) {
        SugerenciasFragment fragment = new SugerenciasFragment();
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
        View view = inflater.inflate(R.layout.fragment_sugerencias, container, false);
        nutrimentosSugeridos = new ArrayList<String>();
        respuestaApp1 = view.findViewById(R.id.respuestaApp1);
        respuestaApp2 = view.findViewById(R.id.respuestaApp2);
        respuestaApp3 = view.findViewById(R.id.respuestaApp3);
        respuestaApp4 = view.findViewById(R.id.respuestaApp4);
        respuestaApp5 = view.findViewById(R.id.respuestaApp5);
        respuestaApp6 = view.findViewById(R.id.respuestaApp6);
        respuestaApp7 = view.findViewById(R.id.respuestaApp7);
        respuestaApp8 = view.findViewById(R.id.respuestaApp8);
        dietas = false;
        magia = view.findViewById(R.id.magia);

        String respuesta1_1 = view.getContext().getResources().getString(R.string.respuestaApp1_1);
        String respuesta1_2 = view.getContext().getResources().getString(R.string.respuestaApp1_2);
        String respuesta2_1 = view.getContext().getResources().getString(R.string.respuestaApp2_1);
        String respuesta2_2 = view.getContext().getResources().getString(R.string.respuestaApp2_2);
        String respuesta3_1 = view.getContext().getResources().getString(R.string.respuestaApp3_1);
        String respuesta3_2 = view.getContext().getResources().getString(R.string.respuestaApp3_2);
        String respuesta4_1 = view.getContext().getResources().getString(R.string.respuestaApp4_1);
        String respuesta4_2 = view.getContext().getResources().getString(R.string.respuestaApp4_2);
        String respuesta5_1 = view.getContext().getResources().getString(R.string.respuestaApp5_1);
        String respuesta5_2 = view.getContext().getResources().getString(R.string.respuestaApp5_2);
        String respuesta6_1 = view.getContext().getResources().getString(R.string.respuestaApp6_1);
        String respuesta6_2 = view.getContext().getResources().getString(R.string.respuestaApp6_2);
        String respuesta7_1 = view.getContext().getResources().getString(R.string.respuestaApp7_1);
        String respuesta7_2 = view.getContext().getResources().getString(R.string.respuestaApp7_2);
        String respuesta8_1 = view.getContext().getResources().getString(R.string.respuestaApp8_1);
        String respuesta8_2 = view.getContext().getResources().getString(R.string.respuestaApp8_2);

        if(getArguments().getBoolean("primerP")){
            respuestaApp1.setText(respuesta1_1);
        }else{
            respuestaApp1.setText(respuesta1_2);
        }

        if(getArguments().getBoolean("segundaP")){
            respuestaApp2.setText(respuesta2_1);
        }else{
            respuestaApp2.setText(respuesta2_2);
        }

        if(getArguments().getBoolean("terceraP")){
            respuestaApp3.setText(respuesta3_1);
        }else{
            respuestaApp3.setText(respuesta3_2);
            nutrimentosSugeridos.add("Zinc");
            dietas = true;
        }

        if(getArguments().getBoolean("cuartaP")){
            respuestaApp4.setText(respuesta4_1);
        }else{
            respuestaApp4.setText(respuesta4_2);
            nutrimentosSugeridos.add("Calcio");
            nutrimentosSugeridos.add("Fósforo");
            nutrimentosSugeridos.add("Vitamina D");
            dietas = true;
        }

        if(getArguments().getBoolean("quintaP")){
            respuestaApp5.setText(respuesta5_1);
        }else{
            respuestaApp5.setText(respuesta5_2);
            nutrimentosSugeridos.add("Hierro");
            nutrimentosSugeridos.add("Vitamina A");
            dietas = true;
        }

        if(getArguments().getBoolean("sextaP")){
            respuestaApp6.setText(respuesta6_1);
        }else{
            respuestaApp6.setText(respuesta6_2);
        }

        if(getArguments().getBoolean("septimaP")){
            respuestaApp7.setText(respuesta7_1);
        }else{
            respuestaApp7.setText(respuesta7_2);
        }

        if(getArguments().getBoolean("octavaP")){
            respuestaApp8.setText(respuesta8_1);
        }else{
            respuestaApp8.setText(respuesta8_2);
        }
        if(dietas){
            magia.setVisibility(View.VISIBLE);
        }

        magia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new FilteredFragment();
                Bundle args = new Bundle();
                args.putStringArrayList("nutrimentos", nutrimentosSugeridos);
                fragment.setArguments(args);
                getActivity().getSupportFragmentManager().beginTransaction().addToBackStack("TAG");
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.Container, fragment).commit();
            }
        });

        return view;
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
