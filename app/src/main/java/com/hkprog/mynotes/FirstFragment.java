package com.hkprog.mynotes;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class FirstFragment extends Fragment {

    RecyclerView recyclerView;
    CoordinatorLayout coordinatorLayout;
    private View view;
    private Context context = null;
    FloatingActionButton fab;


    static FirstFragment fragment = new FirstFragment();

    public static FirstFragment getFragment() {
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_first, container, false);

        fab = root.findViewById(R.id.fab);
        androidx.appcompat.widget.Toolbar mToolbar = root.findViewById(R.id.toolbar);
        Toolbar.setToolbar(mToolbar, getActivity());
        setHasOptionsMenu(true);
        //fab.show();
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getChildFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.mainContent, SecondFragment.getFragment());
                fragmentTransaction.commitNow();
                fab.hide();
            }
        });

        return root;
    }

    @Override
    public void onResume() {
        super.onResume();
        if (!fab.isShown()) {
            fab.show();
        }
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        // Inflate the menu; this adds items to the action bar if it is present.
        super.onCreateOptionsMenu(menu, inflater);
        menu.clear();
    }

    public void showFloatingActionButton() {
        fab = view.findViewById(R.id.fab);
        fab.show();
    };

    public void hideFloatingActionButton() {
        fab = view.findViewById(R.id.fab);
        fab.hide();
    };
}
