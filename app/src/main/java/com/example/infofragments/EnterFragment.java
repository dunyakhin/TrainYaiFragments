package com.example.infofragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class EnterFragment extends Fragment {
Button ok;
EditText name, secondname, phone;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       View enter=inflater.inflate(R.layout.fragment_enter, container,false);
       name=enter.findViewById(R.id.editName);
       secondname=enter.findViewById(R.id.editSecondName);
       phone=enter.findViewById(R.id.editPhoneNumber);
       ok=enter.findViewById(R.id.buttonOk);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if (name.getText().toString().isEmpty() || secondname.getText().toString().isEmpty()||phone.getText().toString().isEmpty()){
                   Toast.makeText(enter.getContext(), "Обязательное поле не заполнено", Toast.LENGTH_LONG).show();
               }else{
                   Bundle result=new Bundle();
               result.putString("data", name.getText().toString()+" "+secondname.getText().toString()+" "+phone.getText().toString());
               getParentFragmentManager().setFragmentResult("result_ok", result);

                FragmentManager fm=getActivity().getSupportFragmentManager();
                fm.popBackStack();}
            }
        });
        return enter;
    }

}