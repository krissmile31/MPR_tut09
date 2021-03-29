package com.example.mybookmarks;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BookmarksFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BookmarksFragment extends Fragment implements View.OnClickListener{

    public BookmarksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bookmarks, container, false);
        view.findViewById(R.id.zingmp3).setOnClickListener(this);
        view.findViewById(R.id.bluezone).setOnClickListener(this);
        view.findViewById(R.id.baomoi).setOnClickListener(this);
        view.findViewById(R.id.medium).setOnClickListener(this);
        view.findViewById(R.id.vnexpress).setOnClickListener(this);
        view.findViewById(R.id.shopee).setOnClickListener(this);
        return view;
    }

    public void onClick(View v) {
        FragmentManager manager = getFragmentManager();
        Fragment fragment = new WebViewFragment();
        Bundle args = new Bundle();

        switch (v.getId()) {
            case R.id.zingmp3:
                Toast.makeText(getActivity(), "Navigate to Zing MP3...", Toast.LENGTH_SHORT).show();
                args.putString("URL", "https://zingmp3.vn/");
                fragment.setArguments(args);
                manager.beginTransaction()
                        .replace(R.id.fragmentContainer, fragment)
                        .addToBackStack("Zing MP3")
                        .commit();
                break;

            case R.id.bluezone:
                Toast.makeText(getActivity(), "Navigate to Bluezone...", Toast.LENGTH_SHORT).show();
                args.putString("URL", "https://bluezone.gov.vn/");
                fragment.setArguments(args);
                manager.beginTransaction()
                        .replace(R.id.fragmentContainer, fragment)
                        .addToBackStack("Bluezone")
                        .commit();
                break;

            case R.id.baomoi:
                Toast.makeText(getActivity(), "Navigate to Báo Mới...", Toast.LENGTH_SHORT).show();
                args.putString("URL", "https://baomoi.com/");
                fragment.setArguments(args);
                manager.beginTransaction()
                        .replace(R.id.fragmentContainer, fragment)
                        .addToBackStack("Bao Moi")
                        .commit();
                break;

            case R.id.medium:
                Toast.makeText(getActivity(), "Navigate to Medium...", Toast.LENGTH_SHORT).show();
                args.putString("URL", "https://medium.com/");
                fragment.setArguments(args);
                manager.beginTransaction()
                        .replace(R.id.fragmentContainer, fragment)
                        .addToBackStack("Medium")
                        .commit();
                break;

            case R.id.vnexpress:
            Toast.makeText(getActivity(), "Navigate to VnExpress...", Toast.LENGTH_SHORT).show();
            args.putString("URL", "https://vnexpress.net/");
            fragment.setArguments(args);
            manager.beginTransaction()
                    .replace(R.id.fragmentContainer, fragment)
                    .addToBackStack("VnExpress")
                    .commit();
            break;

            case R.id.shopee:
            Toast.makeText(getActivity(), "Navigate to Shopee...", Toast.LENGTH_SHORT).show();
            args.putString("URL", "https://shopee.vn/");
            fragment.setArguments(args);
            manager.beginTransaction()
                    .replace(R.id.fragmentContainer, fragment)
                    .addToBackStack("Shopee")
                    .commit();
            break;

        }
    }
}