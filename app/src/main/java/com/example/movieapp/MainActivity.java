package com.example.movieapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.movieapp.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MoviesAdapter adapter;
    private List<Movie> movieList;
    ProgressDialog pd;
    private SwipeRefreshLayout swipeContainer;
    public static final String LOG_TAG= MoviesAdapter.class.getName();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
      public Activity gotActivity() {
          Context context = this;
          while (context instanceof ContextWrapper){
              if (context instanceof  Activity){
                  return (Activity) context;

              }
              context = ((ContextWrapper) context).getBaseContext();
          }

          return null;


        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        swipeContainer=(SwipeRefreshLayout) findViewById(R.id.main_content)
       swipeContainer.setColorSchemeResources(android.R.color.holo_orange_dark);
        swipeContainer.setOnRefreshListener(new SwipefreshLayout.OnRefreshListener(){

            @Override
            public void onRefresh (){
                Toast.makeText(MainActivity.this."Movies Refreshed", Toast.LENGTH_SHORT).show();
            }



        });
        }
    }
    private  void initView(){

    pd = new ProgressDialog(this);
    pd.setMessage("Fetching movies....");
    pd.setCancelable(false);
    pd.show();

    recyclerView= (Recyclerview) findViewById(R.id.recycler_view);
    movieList =new ArrayList<>();
    adapter = new MoviesAdapter(this.movieList);
    if(getActivity().getResources ().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
        recyclerView.setLayoutManger(new GridLayout(this,2));

    }else{
        recyclerView.setLayout(new GridLayout(this, 4));
    }
    recyclerView.setItemAnimator(new DefaultItemAnimator());
    recyclerView.setAdapter(adapter);
    adapter.notifyDataSetChanged();
    loadJSON();
}}
    private void loadJSON {


        }


