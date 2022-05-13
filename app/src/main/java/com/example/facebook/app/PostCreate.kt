package com.example.facebook.app

import com.example.facebook.app.dto.ReqResData
import com.example.facebook.app.dto.User
import retrofit2.Call
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface PostCreate {
    @POST("users")
    fun getResources(@Query("user") page:Int):Call<ReqResData<List<User>>>
}