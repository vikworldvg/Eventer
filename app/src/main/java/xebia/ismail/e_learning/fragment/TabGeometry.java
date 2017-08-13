package xebia.ismail.e_learning.fragment;


import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.location.Location;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.pixplicity.fontview.FontAppCompatTextView;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import xebia.ismail.e_learning.IntroVideo.VideoActivity;
import xebia.ismail.e_learning.Main2Activity;
import xebia.ismail.e_learning.R;
import xebia.ismail.e_learning.recycler.Itemlist;


/**
 * Created by Admin on 5/25/2016.
 */
public class TabGeometry extends Fragment implements OnMapReadyCallback  {

    public static ArrayList<Points> itemlist;



    @Override
     public  View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.geometry_cube, container, false);

        SupportMapFragment mapFragment = (SupportMapFragment) getChildFragmentManager()
                .findFragmentById(R.id.mapFragment);
        mapFragment.getMapAsync(this);

        return v;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
               CameraPosition cameraPosition = new CameraPosition.Builder()
                    .target(new LatLng(48.531711, 35.870047))
                   .zoom(15)
                    .bearing(45)
                   .tilt(20)
                    .build();
            CameraUpdate cameraUpdate = CameraUpdateFactory.newCameraPosition(cameraPosition);
            googleMap.animateCamera(cameraUpdate);
        googleMap.setMinZoomPreference(13f);


        for (int i =0; i<itemlist.size();i++){
            Points item = itemlist.get(i);
//            int mrk = R.drawable.museum;
            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(Double.valueOf(item.getPosx()), Double.valueOf(item.getPosy())))
                    .snippet(item.getDescription())
                    .icon(BitmapDescriptorFactory.fromResource(MarkerChange(item.getType())))
                    .title(item.getName()));

        }


        googleMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
            @Override
            public void onInfoWindowClick(Marker marker) {
                Intent intent = new Intent(getActivity(), Main2Activity.class);
                Main2Activity.Info.name = marker.getTitle();
                Main2Activity.Info.id = marker.getId();
                Main2Activity.Info.info = marker.getSnippet();
                TabInfo.name = marker.getTitle();
                TabInfo.id = marker.getId();
                TabInfo.info = marker.getSnippet();
                for (int i = 0;i<24;i++ ){
                    if (marker.getId().equals("m"+i)){ Main2Activity.Info.num=i;TabInfo.num=i;TabEvents.num=i;}
                }
                TabGeometry.this.startActivity(intent);


            }
        });
        MapStyleOptions style = MapStyleOptions.loadRawResourceStyle(this.getContext(), R.raw.style_json);
        googleMap.setMapStyle(style);


    }
    private int MarkerChange(String type){
        int a = R.drawable.museum;
        switch (type) {
            case "museum":
                a = R.drawable.museum;
            break;
            case "eat":
                a =  R.drawable.eat;
            break;
            case "dk":
                a =  R.drawable.dk;
            break;
            case "park":
                a =  R.drawable.park;
            break;
            case "gym":
                a =  R.drawable.gym;
            break;
            case "library":
                a =  R.drawable.library;
            break;
            case "market":
                a =  R.drawable.market;
            break;
            case "club":
                a =  R.drawable.club;
            break;
            case "cinema":
                a =  R.drawable.cinema;
            break;
        }
        return a;
    }




}

