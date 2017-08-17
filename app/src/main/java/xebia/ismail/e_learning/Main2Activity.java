package xebia.ismail.e_learning;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import xebia.ismail.e_learning.fragment.TabEvents;
import xebia.ismail.e_learning.fragment.TabInfo;
import xebia.ismail.e_learning.recycler.aadapter;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        ActionBar ab = getSupportActionBar();
        if (ab != null) {
            ab.setTitle(R.string.nav_info);
            ab.setDisplayHomeAsUpEnabled(true);
        }
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().add(R.id.containerinfo, new Info()).commit();
        }
    }
    public static class Info extends Fragment {
        public static String name = "";
        public static String info ="";
        public static String id = "";
        public static int num;
        private ImageView mImageView;
        public aadapter adapter;
        private static ViewPager mPager;
        private TabLayout mTabLayout;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View v = inflater.inflate(R.layout.content_main2, container, false);
            String packageName = getActivity().getPackageName();
            String translator = getResources().getString(R.string.translator);
            SharedPreferences prefs = getContext().getSharedPreferences(packageName + "_preferences", MODE_PRIVATE);
            mPager = (ViewPager) v.findViewById(R.id.pager);
            mTabLayout = (TabLayout) v.findViewById(R.id.tab_layout);

            mPager.setAdapter(new TabsAdapter(getChildFragmentManager()));
            mTabLayout.setupWithViewPager(mPager);

            setHasOptionsMenu(true);

            mImageView = (ImageView) v.findViewById(R.id.imagee);
            switch (num) {
                case 0:   mImageView.setImageResource(R.drawable.a0);
                    break;
                case 1:  mImageView.setImageResource(R.drawable.a1);
                    break;
                case 2:  mImageView.setImageResource(R.drawable.a2);
                    break;
                case 3:  mImageView.setImageResource(R.drawable.a3);
                    break;
                case 4:  mImageView.setImageResource(R.drawable.a4);
                    break;
                case 5:  mImageView.setImageResource(R.drawable.a5);
                    break;
                case 6:  mImageView.setImageResource(R.drawable.a6);
                    break;
                case 7:  mImageView.setImageResource(R.drawable.a7);
                    break;
                case 8:  mImageView.setImageResource(R.drawable.a8);
                    break;
                case 9: mImageView.setImageResource(R.drawable.a9);
                    break;
                case 10:  mImageView.setImageResource(R.drawable.a10);
                    break;
                case 11:         mImageView.setImageResource(R.drawable.a11);
                    break;
                case 12:         mImageView.setImageResource(R.drawable.a12);
                    break;
                case 13:         mImageView.setImageResource(R.drawable.a13);
                    break;
                case 14:         mImageView.setImageResource(R.drawable.a14);
                    break;
                case 15:         mImageView.setImageResource(R.drawable.a15);
                    break;
                case 16:         mImageView.setImageResource(R.drawable.a16);
                    break;
                case 17:         mImageView.setImageResource(R.drawable.a17);
                    break;
                case 18:         mImageView.setImageResource(R.drawable.a18);
                    break;
                case 19:         mImageView.setImageResource(R.drawable.a19);
                    break;
                case 20:         mImageView.setImageResource(R.drawable.a20);
                    break;
                case 21:         mImageView.setImageResource(R.drawable.a21);
                    break;
                case 22:         mImageView.setImageResource(R.drawable.a22);
                    break;
                case 23:         mImageView.setImageResource(R.drawable.a23);
                    break;}

            return v;
        }

        class TabsAdapter extends FragmentPagerAdapter {

            public TabsAdapter(FragmentManager fm) {
                super(fm);
            }

            @Override
            public int getCount() {
                return 2;
            }

            @Override
            public Fragment getItem(int i) {
                switch (i) {
                    case 0:
                        return new TabInfo();
                    case 1:
                        return new TabEvents();
                }
                return null;
            }

            @Override
            public CharSequence getPageTitle(int position) {
                switch (position) {
                    case 0:
                        return "Информация";
                    case 1:
                        return "События";
                }
                return "";
            }
        }

    }

}
