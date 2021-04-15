package com.talib.matrix;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<SalesModel> list = new ArrayList<>();
        list.add(new SalesModel("https://images.unsplash.com/photo-1542291026-7eec264c27ff?ixid=MXwxMjA3fDB8MHxzZWFyY2h8Mnx8c2hvZXN8ZW58MHx8MHw%3D&ixlib=rb-1.2.1&w=1000&q=80",
                "Super Flash Sale 50% Off","08"));
        list.add(new SalesModel("https://images.unsplash.com/photo-1460353581641-37baddab0fa2?ixid=MXwxMjA3fDB8MHxzZWFyY2h8M3x8c2hvZXN8ZW58MHx8MHw%3D&ixlib=rb-1.2.1&w=1000&q=80",
                "Super Flash Sale 50% Off","08"));
        list.add(new SalesModel("https://wallpaperaccess.com/full/680070.jpg",
                "Super Flash Sale 50% Off","08"));



        ViewPager viewPager = findViewById(R.id.viewPager);
        TabLayout tabLayout = findViewById(R.id.indicator);
        RecyclerView categoryRecylcer = findViewById(R.id.categoryRecylcer);

        ItemPagerAdapter itemPagerAdapter = new ItemPagerAdapter(list);

        viewPager.setAdapter(itemPagerAdapter);

        tabLayout.setupWithViewPager(viewPager);

        List<String> titleList = new ArrayList<>();

        List<Integer> iconList = new ArrayList<>();



        titleList.add("Man Shirt");
        titleList.add("Dress");
        titleList.add("Man Work Equipment");
        titleList.add("Woman Bag");

        iconList.add(R.drawable.ic_group);
        iconList.add(R.drawable.ic_group2);
        iconList.add(R.drawable.ic_group);
        iconList.add(R.drawable.ic_group2);

        MyRecyclerAdapter adapter = new MyRecyclerAdapter(titleList,iconList);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false);
        categoryRecylcer.setLayoutManager(gridLayoutManager);
        categoryRecylcer.setAdapter(adapter);

    }

}