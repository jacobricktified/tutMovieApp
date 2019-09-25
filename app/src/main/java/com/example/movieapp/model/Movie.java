package com.example.movieapp.model;

import com.google.gson.annotations.SerializedName;

import java.nio.file.Path;
import java.util.ArrayList;

public class Movie {
    @SerializedName("poster path")
    private String posterPath;
    @SerializedName("adult")
    private boolean adult;
    @SerializedName("overview")
    private boolean overview;
    @SerializedName("release_date")
    private boolean releaseDate;
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






}
