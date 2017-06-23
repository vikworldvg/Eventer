package xebia.ismail.e_learning.fragment;


import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.location.Location;
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



import xebia.ismail.e_learning.Main2Activity;
import xebia.ismail.e_learning.R;


/**
 * Created by Admin on 5/25/2016.
 */
public class TabGeometry extends Fragment implements OnMapReadyCallback  {


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
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(48.5344975, 35.8755467))
                .snippet("ул. Харьковская, 65")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.museum))
                .title("Театр Имени Б.Е. Захавы"));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(48.5281472, 35.8714028))
                .snippet("ул. Днепровская, 77")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.dk))
                .title("к-т Мир"));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(48.5283348, 35.8680565))
                .snippet("ул. Горького")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.cinema))
                .title("Олимпия"));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(48.53177867, 35.87065099))
                .snippet("ул. Соборная")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.park))
                .title("Соборная площадь"));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(48.4939197, 35.940131))
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.eat))
                .snippet("ул. Соборная, 93Б")
                .title("Піца Челентано"));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(48.5451912, 35.8608464))
                .snippet("ул. Карла Маркса, 1А")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.gym))
                .title("Территория Fitness"));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(48.553209, 35.8441776))
                .snippet("ул. Заводська, 22А")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.gym))
                .title("ВСК Юність"));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(48.5324518, 35.8712223))
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.eat))
                .snippet("ул. Соборна, 91")
                .title("Burger Club"));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(48.4932773, 35.9335156))
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.eat))
                .snippet("ул. Гагаріна, 7")
                .title("Спорт-бар Бомбардир"));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(48.5346258, 35.8711338))
                .snippet("ул. Ганни Світличної, 63")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.library))
                .title("Колледж"));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(48.534386, 35.862304))
                .snippet("ул. Полтавская, 96")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.dk))
                .title("ДК Гагарина"));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(48.52992077, 35.8685106))
                .snippet("фыв")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.market))
                .title("ТЦ Гуливер"));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(48.533434, 35.8828229))
                .snippet("ул Соборная")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.park))
                .title("Станция Юных Натуралистов"));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(48.5356319, 35.8640256))
                .snippet("ул Озерная")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.club))
                .title("Империал"));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(48.53303974, 35.86952984))
                .snippet("Полтавская 96")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.dk))
                .title("ДК Кирова"));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(48.5306455, 35.8657828))
                .snippet("ул. Музейная")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.museum))
                .title("Музей"));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(48.53443931, 35.86822093))
                .snippet("ул. Интернациональная")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.eat))
                .title("Норма"));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(48.52956552, 35.85668206))
                .snippet("парк")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.park))
                .title("Парк"));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(48.52952999, 35.85929453))
                .snippet("топлесс")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.club))
                .title("Топлесс"));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(48.49885553, 35.93673795))
                .snippet("ул. Комарова")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.club))
                .title("Каспий"));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(48.4989111, 35.9451993))
                .snippet("кафе")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.eat))
                .title("Дионис"));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(48.4976967, 35.94959915))
                .snippet("Днепровская")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.dk))
                .title("ДК Машиностроителей"));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(48.52992, 35.859358))
                .snippet("Днепровская 77")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.cinema))
                .title("КиноПарк"));
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(48.5287058, 35.8490076))
                .snippet("Днепровская 49")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.eat))
                .title("Смерекова Хата"));


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


}

