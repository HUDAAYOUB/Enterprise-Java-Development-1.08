package com.lab3.Q3;

public class Movies extends Video{
    private double rating;


    public Movies(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }
    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\n" + "Rating" + getRating();
    }

}
