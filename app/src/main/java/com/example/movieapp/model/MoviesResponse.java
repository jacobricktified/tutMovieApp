package com.example.movieapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MoviesResponse {

    private int page;
    private int totalResults;
    private List<Movie> results;

    public class MovieResponse{
        @SerializedName("page")
        private int page;
        @SerializedName("result")
        private List<Movie> results;
        @SerializedName("total_result")
        private int totalReaults;
        @SerializedName("total_pages")
        private int totalPages;

    }

    public int getPage(){
        int page = 0;
        return page;
    }

    public void setPage(int page){
        this.page = page;
    }
    public int getResults(){
        List<Movie> results;
        return results;

        public List<Movie> getMovies(){
            return results;

        }
        public void setResults (List<Movie> results){
            this.results = results;
        }
           public void setMovies (List<Movie> results)
                this.results = results;

        public int getTotalResult(){
            List<Movie> totalResult;
            return totalResult;
        }

        public void setTotalResults(int totalResult){
            this.totalResults = totalResult;

        }
        public int getTotalPages(){
            return getTotalPages;
        }

        public void setTotalPages(int totalPages){
            this totalPages = totalPages;
        }

        }


}
