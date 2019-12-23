package com.jyami.wiingwiing_black.ui.help;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.jyami.wiingwiing_black.R;
import com.jyami.wiingwiing_black.RecordActivity;

public class HelpFragment extends Fragment {

    private HelpViewModel helpViewModel;
    Intent intent;
    public Button button = null;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        helpViewModel =
                ViewModelProviders.of(this).get(HelpViewModel.class);

        View root = inflater.inflate(R.layout.fragment_help, container, false);

        intent = new Intent(getActivity(), RecordActivity.class);
        button = (Button) root.findViewById(R.id.theButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(intent);
            }
        });

        return root;
    }


}