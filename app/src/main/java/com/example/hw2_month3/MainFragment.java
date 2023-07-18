package com.example.hw2_month3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MainFragment extends Fragment {

    private Button btn_plus;
    private Button btn_minus;
    private TextView tv_zero;
    private int counter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        findById();
        initListener();
    }

    void findById() {
        btn_plus = requireActivity().findViewById(R.id.PlusOne);
        btn_minus = requireActivity().findViewById(R.id.MinusOne);
        tv_zero = requireActivity().findViewById(R.id.tv_zero);
    }

    void initListener() {
        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                tv_zero.setText(String.valueOf(counter));
            }
        });

        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter--;
                tv_zero.setText(String.valueOf(counter));
            }


        });
    }
}