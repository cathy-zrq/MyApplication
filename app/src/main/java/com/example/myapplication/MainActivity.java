package com.example.myapplication;


import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseAcivity {

    private RecyclerView rView;
    private List<String> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
    }

    @Override
    public int bindLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        rView=findViewById(R.id.rView);
        mList=new ArrayList<>();
        rView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        rView.setAdapter(new MyAdapter());
    }

    @Override
    public void initData() {
        for(int i=1;i<20;i++){
            mList.add("第"+i+"条测试数据");
        }
    }

    @Override
    public void initEvent() {

    }

    @Override
    public View bindView(int resId) {
        View view = findViewById(resId);
        return (View) view;
    }


    class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{
        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new ViewHolder(getLayoutInflater().from(MainActivity.this).inflate(R.layout.item_layout,parent,false));
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            holder.tvText.setText(mList.get(position)+"");
        }

        @Override
        public int getItemCount() {
            return mList.size();
        }

        class ViewHolder extends RecyclerView.ViewHolder{
            TextView tvText;
            public ViewHolder(@NonNull View v) {
                super(v);
                tvText=v.findViewById(R.id.tvText);
            }
        }
    }

}
