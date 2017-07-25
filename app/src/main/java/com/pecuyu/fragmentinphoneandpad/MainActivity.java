package com.pecuyu.fragmentinphoneandpad;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ListFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListFragment listFragment =ListFragment.newInstance(getInfos());
        getSupportFragmentManager().beginTransaction().replace(R.id.id_fragment_list_container, listFragment).commit();

    }

    public List<Info> getInfos() {
        List<Info> infos = new ArrayList<>();
        Info info;
        for (int i=0;i<20;i++) {
            info = new Info(i, i, "name" + i);
            infos.add(info);
        }
        return infos;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
