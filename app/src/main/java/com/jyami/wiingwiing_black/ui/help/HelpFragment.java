package com.jyami.wiingwiing_black.ui.help;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.jyami.wiingwiing_black.R;
import com.jyami.wiingwiing_black.RecordActivity;

public class HelpFragment extends Fragment {

    private HelpViewModel helpViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        helpViewModel =
                ViewModelProviders.of(this).get(HelpViewModel.class);

        View root = inflater.inflate(R.layout.fragment_help, container, false);

//        root.findViewById(R.id.recordButton).setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                startActivity(new Intent(getActivity(), RecordActivity.class));
//            }
//        });

        return root;
    }


}