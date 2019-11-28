package com.jyami.wiingwiing_black.ui.optimizing_memory;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.jyami.wiingwiing_black.R;

public class OptimizingMemoryFragment extends Fragment {

    private OptimizingMemoryViewModel optimizingMemoryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        optimizingMemoryViewModel =
                ViewModelProviders.of(this).get(OptimizingMemoryViewModel.class);

        View root = inflater.inflate(R.layout.fragment_optimize_memory, container, false);

        return root;
    }
}