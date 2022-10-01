package com.example.myapplication;



public  class ViewHolder extends RecyclerView.ViewHolder {


    public ViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public View $(int id){
        return (View)itemView.findViewById(id);
    }

    public ViewHolder setText(int id,String msg){
        TextView tv=(TextView)$(id);
        tv.setText(msg);
        return this;
    };


    public ViewHolder setImg(int id,int resId){
       ImageView iv=(ImageView)$(id);
       iv.setImageResource(resId);
        return this;
    };


    public ViewHolder setVisible(int id,int visible){
        $(id).setVisibility(visible);
        return this;
    }


    public ViewHolder setListener(int id, View.OnClickListener onClickListener){
        $(id).setOnClickListener(onClickListener);
        return this;
    }



}
