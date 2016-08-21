package com.example.sanyam.ui_basic;

import android.app.ActionBar;
import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.animation.Animation;
import android.widget.ProgressBar;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

//    private static final String[] CITIES = new String[] {
//            "Delhi", "Goa", "Mumbai", "ahmedabad", "Kerala","Dehradun"
//    };
    //ArrayList<Category> data=new ArrayList<>();

    private DrawerLayout mDrawer;
    private Toolbar toolbar;
    private Toolbar toolbar_tabs;
    private ActionBar action_bar;
    private ActionBarDrawerToggle mDrawerToggle;
    private static final int NUM_PAGES = 5;
    private ViewPager mPager;
    private PagerAdapter mPagerAdapter;
    private ViewPager TabPager1;
    private PagerAdapter TabPagerAdapter1;
    int currentPage=0;
    ProgressBar progressBar;
    FragmentManager fm;
    String cityName="Delhi";
    private Boolean isFabOpen = false;
    private FloatingActionButton fab,fab1,fab2;
    private Animation fab_open,fab_close,rotate_forward,rotate_backward;
    TabLayout tabLayout;
    Spinner spinner;

//    @Override
//    public void Restaurant_clicked(Restaurant_Item item) {
//        Intent i=new Intent();
//        i.setAction(Intent.ACTION_VIEW);
//        i.setData(Uri.parse(item.getRestaurant().getUrl()));
//        startActivity(i);
//
//    }

    private NavigationView nvDrawer;
    private ActionBarDrawerToggle drawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
