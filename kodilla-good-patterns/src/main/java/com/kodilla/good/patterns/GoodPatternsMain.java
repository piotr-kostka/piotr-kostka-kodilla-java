package com.kodilla.good.patterns;

import com.kodilla.good.patterns.challenges.MovieStore;

public class GoodPatternsMain {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        String movies = movieStore.printMovieTitles();
        System.out.println(movies);
    }
}
