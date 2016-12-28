package com.example.lm.newsdemo.frament;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.lm.newsdemo.R;
import com.example.lm.newsdemo.adapter.NewsFPAadapter;
import com.example.lm.newsdemo.global.AppConstants;

public class NewsFragment extends Fragment {

  private ViewPager mViewPager;
  private TabLayout mTabLayout;
  String[] titles={
          AppConstants.XIN_WEN__REDIAN,
          AppConstants.XIN_WEN__SHEHUI,
          AppConstants.XIN_WEN__JUNBSHI,
          AppConstants.XIN_WEN__TIYU,
          AppConstants.XIN_WEN__YULE
  };

  public static NewsFragment newInstance(String param1) {
    NewsFragment fragment = new NewsFragment();
    Bundle args = new Bundle();
    args.putString("agrs1", param1);
    fragment.setArguments(args);
    return fragment;
  }

  public NewsFragment() {
 
  }
 
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_news, container, false);
    Bundle bundle = getArguments();
    String agrs1 = bundle.getString("agrs1");
    TextView tv = (TextView)view.findViewById(R.id.id_fragment_news_textView);
    tv.setText(agrs1);

    mViewPager= (ViewPager) view.findViewById(R.id.id_fragment_news_ViewPager);
    mTabLayout= (TabLayout) view.findViewById(R.id.id_fragment_news_TabLayout);

    return view;
  }

  @Override
  public void onActivityCreated(Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);

    mViewPager.setAdapter(new NewsFPAadapter(getChildFragmentManager(),titles));
    mTabLayout.setupWithViewPager(mViewPager);

  }
}