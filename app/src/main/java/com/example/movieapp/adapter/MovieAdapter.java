package com.example.movieapp.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

public class MovieAdapter extends RecyclerView.Adapter<moviesAdapter.MyViewHolder> {

    private Context mContext;
    private List<Movie> movieList
            public MoviesAdapter(Context mContext, List<Movies> movieList){
        this.mContext =mContext;
        this.movieList= movieList;
            }

            @Override
    public MoviesAdapter.MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i ){
                View view= layoutInflate.from (viewGroup.getContext())
                        inflater(R.layout.movie_card, viewGroup, false );
                return new MyViewHolder(view);


            }
            @Override
    public void onBinderViewHolder(final MovieAdapter.MyViewHolder viewHolder, int 1){
        viewhoder.title.setText(movieList.get(i).getOriginalTitle());
            }
    @Override
    public int getItemCourt (){
        return movieList.size();

    }
    public class MyViewHolder extends RecyclerView.viewHolder{
        public TextView title, userrating;
        public ImageView thumbnail;

        public MyViewHolder(View view){
            super(view);
            title=(TextView) view.findViewById(R.id.title)
                    userrating =(TextView) view.findViewById(R.Id.usertating);
            thumbnail=(ImageView) view.findViewById(R.Id.thumbnail)

        }


    }
}
