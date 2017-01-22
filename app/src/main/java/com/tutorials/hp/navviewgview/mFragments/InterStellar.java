package com.tutorials.hp.navviewgview.mFragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import com.tutorials.hp.navviewgview.R;


/**
 * Created by Hp on 3/22/2016.
 */
public class InterStellar extends Fragment {

    private GridView gv;
    private static String[] spacecrafts={"Kepler","Hubble","Rosetter","Discovery","Endeavor"};

    public static InterStellar newInstance()
    {
        return new InterStellar();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.interstellar,null);


        //REFERENCE
        gv= (GridView) rootView.findViewById(R.id.interstellar_GV);

        //ADAPTER
        gv.setAdapter(new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,spacecrafts));

        //ITEM CLICKS
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getActivity(), spacecrafts[i], Toast.LENGTH_SHORT).show();
            }
        });

        return rootView;
    }

    @Override
    public String toString() {
        return "InterStellar";
    }
}
