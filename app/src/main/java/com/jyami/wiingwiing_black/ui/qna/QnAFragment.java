package com.jyami.wiingwiing_black.ui.qna;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

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

        Button imageLogo = root.findViewById(R.id.button_web);
        imageLogo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String url = "https://github.com/chuckchuck-gojol";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        return root;
    }
}