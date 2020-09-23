package samir.com.abdotestfr.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import samir.com.abdotestfr.MainActivity;
import samir.com.abdotestfr.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeF extends Fragment {

    public HomeF() {
        // Required empty public constructor
    }
    EditText editText;
    Button button;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_home, container, false);
editText=view.findViewById(R.id.Fedit);
button =view.findViewById(R.id.send);

button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Bundle bundle=new Bundle();
        bundle.putString("masg",editText.getText().toString());
        Intent intent=new Intent(getActivity(), MainActivity.class);

        intent.putExtras(bundle);
        startActivity(intent);

    }
});



        return view;
    }
}
