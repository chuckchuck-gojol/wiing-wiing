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

        checkingConnectionViewModel = ViewModelProviders.of(this).get(CheckingConnectionViewModel.class);

        View root = inflater.inflate(R.layout.fragment_connection, container, false);

//        TabLayout tabLayout =(TabLayout) root.findViewById(R.id.tab);
//        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//                int pos = tab.getPosition() ;
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//                // TODO : tab의 상태가 선택되지 않음으로 변경.
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//                // TODO : 이미 선택된 tab이 다시
//            }
//        });

        return root;
    }




}