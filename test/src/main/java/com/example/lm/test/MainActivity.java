package com.example.lm.test;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;

    private List<View> viewList;
    String[] urlStr={
            "http://p8.qhimg.com/dmfd/182_136_/t0133afa66dde8ddf7c.jpg",
            "http://p0.qhimg.com/dmfd/182_136_/t01fca6d258a7cfba94.jpg",
            "http://p7.qhimg.com/dmfd/182_136_/t01fee72e8b43080c52.jpg"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
        MyPagerAdapter myPagerAdapter=new MyPagerAdapter(this,viewList);
        mViewPager.setAdapter(myPagerAdapter);
    }

    private void initView() {

        viewList=new ArrayList<>();
        mViewPager= (ViewPager) findViewById(R.id.id_viewPager);


    }

    private void initData() {

        for (int i = 0; i < urlStr.length; i++) {
            View view=  LayoutInflater.from(this).inflate(R.layout.item,null,false);
            ImageView imageView= (ImageView) view.findViewById(R.id.id_item_image);
            Glide.with(getApplicationContext()).load(urlStr[i]).crossFade().into(imageView);
            viewList.add(imageView);
        }
    }
}
