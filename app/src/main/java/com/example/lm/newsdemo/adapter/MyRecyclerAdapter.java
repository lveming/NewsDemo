package com.example.lm.newsdemo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lm.newsdemo.R;
import com.example.lm.newsdemo.bean.NewsBean;
import com.example.lm.newsdemo.util.GlideImageLoader;

import java.util.List;

/**
 * Created by Administrator on 2016/12/29.
 */
public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.MyViewHolder> {
    private Context mContext;
    private List<NewsBean> newsList;
    private int TYPE_LIST=1;
    private int ITEM_GRID=2;

    public MyRecyclerAdapter(Context mContext, List<NewsBean> newsList) {
        this.mContext = mContext;
        this.newsList = newsList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(mContext).inflate(R.layout.item_recycle,null);
        MyViewHolder myViewHolder=new MyViewHolder(view);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.content.setText(newsList.get(position).getContent());
        holder.time.setText(newsList.get(position).getTime());
        holder.title.setText(newsList.get(position).getTitle());
        new GlideImageLoader().displayImage(mContext,newsList.get(position).getImageUrl(),holder.mImageView);

    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        private ImageView mImageView;
        private TextView time;
        private TextView content;
        private TextView title;

        public MyViewHolder(View itemView) {
            super(itemView);
            mImageView= (ImageView) itemView.findViewById(R.id.id_item_ImageView);
            content= (TextView) itemView.findViewById(R.id.id_item_content);
            time= (TextView) itemView.findViewById(R.id.id_item_time);
            title= (TextView) itemView.findViewById(R.id.id_item_title);
        }
    }
}
