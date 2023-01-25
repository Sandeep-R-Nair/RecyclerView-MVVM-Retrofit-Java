package com.brogrammer.mvvmsample.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MoviesResponse
{
    @SerializedName("Marvel Cinematic Universe")
    @Expose
    private List<MarvelCinematicUniverse> marvelCinematicUniverse = null;

    public List<MarvelCinematicUniverse> getMarvelCinematicUniverse() {
        return marvelCinematicUniverse;
    }

    public void setMarvelCinematicUniverse(List<MarvelCinematicUniverse> marvelCinematicUniverse) {
        this.marvelCinematicUniverse = marvelCinematicUniverse;
    }

    public class MarvelCinematicUniverse {

        @SerializedName("movie_id")
        @Expose
        private int movieId;
        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("phase")
        @Expose
        private String phase;
        @SerializedName("category_name")
        @Expose
        private String categoryName;
        @SerializedName("release_year")
        @Expose
        private int releaseYear;
        @SerializedName("running_time")
        @Expose
        private int runningTime;
        @SerializedName("rating_name")
        @Expose
        private String ratingName;
        @SerializedName("disc_format_name")
        @Expose
        private String discFormatName;
        @SerializedName("number_discs")
        @Expose
        private int numberDiscs;
        @SerializedName("viewing_format_name")
        @Expose
        private String viewingFormatName;
        @SerializedName("aspect_ratio_name")
        @Expose
        private String aspectRatioName;
        @SerializedName("status")
        @Expose
        private int status;
        @SerializedName("release_date")
        @Expose
        private String releaseDate;
        @SerializedName("budget")
        @Expose
        private String budget;
        @SerializedName("gross")
        @Expose
        private String gross;
        @SerializedName("time_stamp")
        @Expose
        private String timeStamp;
        @SerializedName("edition")
        @Expose
        private String edition;

        public int getMovieId() {
            return movieId;
        }

        public void setMovieId(int movieId) {
            this.movieId = movieId;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getPhase() {
            return phase;
        }

        public void setPhase(String phase) {
            this.phase = phase;
        }

        public String getCategoryName() {
            return categoryName;
        }

        public void setCategoryName(String categoryName) {
            this.categoryName = categoryName;
        }

        public int getReleaseYear() {
            return releaseYear;
        }

        public void setReleaseYear(int releaseYear) {
            this.releaseYear = releaseYear;
        }

        public int getRunningTime() {
            return runningTime;
        }

        public void setRunningTime(int runningTime) {
            this.runningTime = runningTime;
        }

        public String getRatingName() {
            return ratingName;
        }

        public void setRatingName(String ratingName) {
            this.ratingName = ratingName;
        }

        public String getDiscFormatName() {
            return discFormatName;
        }

        public void setDiscFormatName(String discFormatName) {
            this.discFormatName = discFormatName;
        }

        public int getNumberDiscs() {
            return numberDiscs;
        }

        public void setNumberDiscs(int numberDiscs) {
            this.numberDiscs = numberDiscs;
        }

        public String getViewingFormatName() {
            return viewingFormatName;
        }

        public void setViewingFormatName(String viewingFormatName) {
            this.viewingFormatName = viewingFormatName;
        }

        public String getAspectRatioName() {
            return aspectRatioName;
        }

        public void setAspectRatioName(String aspectRatioName) {
            this.aspectRatioName = aspectRatioName;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getReleaseDate() {
            return releaseDate;
        }

        public void setReleaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
        }

        public String getBudget() {
            return budget;
        }

        public void setBudget(String budget) {
            this.budget = budget;
        }

        public String getGross() {
            return gross;
        }

        public void setGross(String gross) {
            this.gross = gross;
        }

        public String getTimeStamp() {
            return timeStamp;
        }

        public void setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
        }

        public String getEdition() {
            return edition;
        }

        public void setEdition(String edition) {
            this.edition = edition;
        }

    }
}

