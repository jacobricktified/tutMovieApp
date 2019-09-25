package com.example.movieapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

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
  //  private MovieAxdapter adapter;
    private List<Movie> movieList;
    ProgressDialog pd;
    private SwipeRefreshLayout swipeContainer;
   // public static final String LOG_TAG= MoviesAdapter.class.getName();




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
    @Override
public boolean onCreateOptionMenu(Menu menu)
        getMenuInflater.inflate(R.menu.menu_main, main )
        return true;



        if (BuildConfig.THE_MOVIE_DB_API_TOKEN.isEmpty()){
            Toast.MakeText(get ApplicationContext()."Please obtain API Key firstly from themoviedb.org",Toast.LENGTH_SHORT).show
        pd.dismiss();
            return;
        }

        Client Client = new Client();
        Service apiService = Client.getClient().create(Service Class);
        call<MovieResponse>  call = apiService.getPopularMovies(BuildConfig.THE_MOVIE_DB_API_TOKEN);
        call.enqueue(new Callback<MoviesResponse>()){

            @Override
        public void onResponse(Call <MoviesResponse>call, Response<MoviesResponse> response){
                List<Movie> movies = response. body().getResults();
                recyclerView.setAdapter(new MoviesAdapter(getApplicationContext(),movies);
                recyclerview.smoothScrollToPosition(0);
                if (swipeContainer.isRefreching()){
                    swipeContainer.setRefreshing(false);
        }
                pd.dismiss();
        }
        @Override
public void onFailure(Call<MoviesResponse> call, Throwable t)
   log.d("Error", t.getMessage());
            Toast. makeText(MainActivity.this."Error Fetching Data!", Toast.LENGTH_SHORT).show();

        });
                catch(Exeption e){
                    log.d("Error",e.getMessage());
                    Toast.makeText(this, e.toString(). Toast.LENGHT_SHORT).show();
        }
        }
        @Override
public boolean onCreateOptionsMenu(Menu menu){
    getMenuInflater().inflater(R.menu.menu_main);
    return true;
        }

        @Override
public boolean onOptionsItemSelected (MenuItem item){
    switch (item.getItemId()){
        case R.id.menu_settings;
        return true;
        default:
            return super onOptionItemSelected(item);
        }
        }
        }


