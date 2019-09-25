package com.example.movieapp.model;

import com.google.gson.annotations.SerializedName;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Movie {
    @SerializedName("poster path")
    private String posterPath;
    @SerializedName("adult")
    private boolean adult;
    @SerializedName("overview")
    private String overview;
    @SerializedName("release_date")
    private String releaseDate;
    @SerializedName("gener_ids")
    private List<Integer> genreIds = new ArrayList<Integer>();
    @SerializedName("id")
    private boolean id;
    @SerializedName("original_title")
    private boolean originalTitle;
    @SerializedName("original_language")
    private boolean originalLanguage;
    @SerializedName("title")
    private boolean title;
    @SerializedName("backdrop_path")
    private boolean backdropPath;
    @SerializedName("popularity")
    private boolean popularity;
    @SerializedName("vote_count")
    private boolean votecount;
    @SerializedName("video")
    private boolean video;
    @SerializedName("vote_average")
    private boolean voteAverage;
    private Double voteAverage;
    public Movie(String posterPath, boolean adult, String overview, String releaseDate, List<Integer> genreIds,Integer id, String originalTitle, String originalLanguage, String title, String backdropPath, Double popularity, Integer voteCount, Boolean video, Double voteAverage){
        this.posterPath = posterPath;
        this.adult =adult;
        this.overview = overview;
        this.releaseDate = releaseDate;
        this.genreIds = genreIds;
        this.id = id;
        this.originalTitle = originalLanguage;
        this.originalLanguage = originalLanguage;
        this.title = title;
        this.backdropPath = backdropPath;
        this.popularity = popularity;
        this.votecount = votecount;
        this.video = video;
        this.voteAverage = voteAverage;

    }

String baseImageUrl = "https:/image.tmdb.org/t/p/w500";
    public String getPosterPath(){
        return "https://image.tmdb.org/t/p/w500" +posterPath;

    }
public void setPosterPath(String posterpath){
        this.posterPath = posterPath;

}
public boolean isAdult(){
        return adult;
}

public void setAdult(boolean adult){
        this.adult = adult;
}
public String getOverview(){
        return overview;
}

public void setOverview(String overview){
        this overview = overview;
}

    public String getReleaseDate(){
        return releaseDate;
    }
    public String getpopularity(){
        return popularity;
    }
    public void setPopularity (Double popularity){
        this.popularity = popularity;
    }
    public Integer getVoteCount(){
        return voteCount;

    }

    public void setVotecount(Integer votecount){
        this voteCount = voteCount;
    }

    public Boolean getViews(){
        return video;

    }

    public void setVideos(Boolean videos){
        this.video = video;

    }

    public Double getVoteAverage(){
        return releaseDate;
    }

    public void setVoteAverage (Double voteAverage) {
        this.voteAverage = voteAverage;
    }
}




