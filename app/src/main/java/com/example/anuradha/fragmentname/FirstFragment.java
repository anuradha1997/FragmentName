package com.example.anuradha.fragmentname;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {
    EditText E1;
    Button b1;


    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_first2, container, false);
        b1= (Button) v.findViewById(R.id.bgg);
        final EditText e1= (EditText) v.findViewById(R.id.eg);
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String data=e1.getText().toString();
                SecondFragment sec=new SecondFragment();
                Bundle b=new Bundle();
                b.putString("name_key",data);
                sec.setArguments(b);

                FragmentManager fm=getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();

                ft.replace(R.id.my_layout,new SecondFragment());
                ft.addToBackStack(null);
                ft.commit();
            }
        });




        return v;
    }

}

