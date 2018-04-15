package com.example.rafaj.fragmentapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by rafaj on 8/4/2018.
 */

public class FragmentViewer extends Fragment {
    TextView text;
    TextView text2;
    ImageView image;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.viewer_fragment, container, false);



        int[] Imagenes = new int[9];
        Imagenes[0] = R.drawable.sol;
        Imagenes[1] = R.drawable.mercurio;
        Imagenes[2] = R.drawable.venus;
        Imagenes[3] = R.drawable.tierra;
        Imagenes[4] = R.drawable.marte;
        Imagenes[5] = R.drawable.jupiter;
        Imagenes[6] = R.drawable.saturno;
        Imagenes[7] = R.drawable.urano;
        Imagenes[8] = R.drawable.neptuno;


        text = view.findViewById(R.id.textId);
        Bundle bundle = this.getArguments();

        text2 = view.findViewById(R.id.infoId);
        Bundle bundle2 = this.getArguments();

        image = view.findViewById(R.id.imagesId);
        Bundle bundle3 = this.getArguments();



        if(bundle != null){
            Toast.makeText(getActivity(), "Item: " + bundle.getString("KEY"), Toast.LENGTH_SHORT).show();

            text.setText(bundle.getString("KEY"));

        }
        else if(bundle2 !=null){
            Toast.makeText(getActivity(), "Item: " + bundle.getString("KEY"), Toast.LENGTH_SHORT).show();

            text2.setText(bundle.getStringArray("KEY"));
        }
        else if(bundle3 != null){
            Toast.makeText(getActivity(), "Item: " + bundle.getIntegerArrayList("KEY"), Toast.LENGTH_SHORT).show();

            image.setImageDrawable(bundle.getIntegerArrayList("KEY"));
        }



        return view;
    }


}

