package com.kopikode.themoviedb.service

import com.kopikode.themoviedb.model.TVResponse
import retrofit2.Call
import retrofit2.http.GET

interface TVApiInterface {
    @GET("/3/tv/popular?api_key=c3cb8374fc50dd27eb79b9f31c5bf29e")
    fun getTVList(): Call<TVResponse>
}