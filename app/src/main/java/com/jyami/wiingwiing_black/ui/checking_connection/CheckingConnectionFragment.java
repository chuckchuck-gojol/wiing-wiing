package com.jyami.wiingwiing_black.ui.checking_connection;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.jyami.wiingwiing_black.R;
import com.jyami.wiingwiing_black.model.StoreData;

public class CheckingConnectionFragment extends Fragment {

    private CheckingConnectionViewModel checkingConnectionViewModel;

    @SuppressLint("ResourceAsColor")
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        checkingConnectionViewModel =
                ViewModelProviders.of(this).get(CheckingConnectionViewModel.class);
        View root = inflater.inflate(R.layout.fragment_check_connection, container, false);

        TextView connectionText = root.findViewById(R.id.connection_text);
        ImageButton connectionButton = root.findViewById(R.id.connection_button);
        TextView soundAroundText = root.findViewById(R.id.sound_around_text);

        if (checkingConnectionViewModel.getConnection().getValue()) {
            connectionText.setText("이어폰이 연결되지 않았습니다");
            connectionButton.setImageResource(R.drawable.connection_text_button);
            soundAroundText.setText("이어폰 및 인터넷 연결 상태를 확인해주세요!");
            soundAroundText.setTextColor(R.color.textRed);
            return root;
        }

        connectionText.setText("이어폰이 연결되었습니다");
        connectionButton.setImageResource(R.drawable.connection_info);
        String name = "<font color=\"#f1c40f\">민정</font>";
        String contents = "님의 주변소리를 듣고 있습니다!";
        soundAroundText.setText(Html.fromHtml(name + contents));
        return root;
    }
}