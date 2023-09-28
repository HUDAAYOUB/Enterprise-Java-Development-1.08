package com.lab3.Q3;

public class MainMovie {
    public static void main(String[] args) {


        TvSeries tvSeries = new TvSeries("The 100", 45, 62);
      Movies movie = new Movies("Howles Moving Castle", 142, 9.3);

        System.out.println("TV SERIES:" + tvSeries.getInfo());

        System.out.println("MOVIE:" + movie.getInfo());
    }
}
