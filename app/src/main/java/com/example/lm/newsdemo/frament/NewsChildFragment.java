package com.example.lm.newsdemo.frament;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.lm.newsdemo.R;

public class NewsChildFragment extends Fragment {



  public static NewsChildFragment newInstance(String param1) {
    NewsChildFragment fragment = new NewsChildFragment();
    Bundle args = new Bundle();
    args.putString("agrs1", param1);
    fragment.setArguments(args);
    return fragment;
  }

  public NewsChildFragment() {
 
  }
 
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_news_child, container, false);
    Bundle bundle = getArguments();
    String agrs1 = bundle.getString("agrs1");
    TextView tv = (TextView)view.findViewById(R.id.id_fragment_news_Child_textView);
    tv.setText(agrs1);

    return view;
  }
 

 
}