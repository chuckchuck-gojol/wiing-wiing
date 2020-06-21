package com.jyami.wiingwiing_black.ui.about_us;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.jyami.wiingwiing_black.R;

public class QnAFragment extends Fragment {

    private QnAViewModel qnAViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        qnAViewModel =
                ViewModelProviders.of(this).get(QnAViewModel.class);

        View root = inflater.inflate(R.layout.fragment_qna, container, false);

        return root;
    }
}