package com.kopikode.themoviedb.service

import com.kopikode.themoviedb.model.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {
    @GET("/3/movie/popular?api_key=c3cb8374fc50dd27eb79b9f31c5bf29e")
    fun getMovieList(): Call<MovieResponse>
}