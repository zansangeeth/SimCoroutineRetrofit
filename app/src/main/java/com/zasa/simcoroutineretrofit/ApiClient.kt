package com.zasa.simcoroutineretrofit

import retrofit2.Response
import retrofit2.http.GET

/**
 **@Project -> SimCoroutineRetrofit
 **@Author -> Sangeeth on 9/3/2022
 */
interface ApiClient {
    @GET("/api/breeds/image/random")
    suspend fun getRandomDogImage(): Response<DogImageModel>
}