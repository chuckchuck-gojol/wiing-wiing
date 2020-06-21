package com.jyami.wiingwiing_black.ui.checking_connection;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.google.android.material.tabs.TabLayout;
import com.jyami.wiingwiing_black.R;

public class CheckingConnectionFragment extends Fragment {

    private CheckingConnectionViewModel checkingConnectionViewModel;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        checkingConnectionViewModel =
                ViewModelProviders.of(this).get(CheckingConnectionViewModel.class);

        View root = inflater.inflate(R.layout.fragment_connection, container, false);

//        root.findViewById(R.id.recordButton).setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                startActivity(new Intent(getActivity(), RecordActivity.class));
//            }
//        });

        return root;
    }


}