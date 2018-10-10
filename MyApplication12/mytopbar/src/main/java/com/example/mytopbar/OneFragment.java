package com.example.mytopbar;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class OneFragment extends Fragment {

    private ImageButton btn;
    private ImageButton btn1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_one, container, false);

        btn = (ImageButton) view.findViewById(R.id.imageButton2);
        btn.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getActivity(),
                        "今日签到成功 ! ",
                        Toast.LENGTH_SHORT).show();
            }

        });

        btn1 = (ImageButton) view.findViewById(R.id.imageButton3);
        btn1.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getActivity(),
                        "开启你的训练计划吧 ! ",
                        Toast.LENGTH_SHORT).show();
            }

        });


        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_one, container, false);
        return view;
    }


}