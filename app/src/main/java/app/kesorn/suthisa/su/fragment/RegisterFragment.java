package app.kesorn.suthisa.su.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import app.kesorn.suthisa.su.R;

/**
 * Created by suthisa on 10/10/2017.
 */

public class RegisterFragment extends Fragment  {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view=inflater.inflate(R.layout.fragment_register,container,false);
        return view;

    }
}
