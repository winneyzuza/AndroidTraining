package winney.co.th.myexchange.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import winney.co.th.myexchange.R;

/**
 * Created by Dell on 1/6/2018.
 */

public class MainFragment extends Fragment{

    @Nullable
    @Override

    // method to create mask
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Mask
        View view = inflater.inflate(R.layout.fragment_main, container, false); // การนำ xml(fragment.xml) มาทำงานใน Java
        return view;
    }
} //main Class
