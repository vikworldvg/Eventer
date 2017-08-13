package xebia.ismail.e_learning.fragment;

import android.app.DownloadManager;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import android.support.v4.view.PagerAdapter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import xebia.ismail.e_learning.R;
import xebia.ismail.e_learning.helper.FragmentHelper.GridWithTilesAdapter;
import xebia.ismail.e_learning.helper.FragmentHelper.GridWithTilesData;
import xebia.ismail.e_learning.news.CardAdapter;
import xebia.ismail.e_learning.news.NatureItem;
import xebia.ismail.e_learning.recycler.Itemlist;
import xebia.ismail.e_learning.recycler.RecyclerItem;
import xebia.ismail.e_learning.recycler.ViewPagerAdapter;
import xebia.ismail.e_learning.recycler.aadapter;

/**
 * Created by Admin on 3/13/2017.
 */
public class HomeFragment extends Fragment {


    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setHasOptionsMenu(true);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tab_maps, container, false);
        setupUI(v);


        return v;
    }
    private void setupUI(View rootView) {
        recyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view);
        layoutManager = new GridLayoutManager(getActivity(), 2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new GridWithTilesAdapter(getActivity(), createFakeData()));
    }

    private List<GridWithTilesData> createFakeData() {
        List<GridWithTilesData> data = new ArrayList<>();
        data.add(new GridWithTilesData(R.drawable.food, "Доставка еды"));
        data.add(new GridWithTilesData(R.drawable.service,"Услуги"));
        data.add(new GridWithTilesData(R.drawable.dosug,"Досуг"));
        data.add(new GridWithTilesData(R.drawable.sport,"Спорт"));
        return data;
    }












}

