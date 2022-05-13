package com.example.facebook.app.dto

import com.google.gson.annotations.SerializedName

//"page": 2,
//    "per_page": 6,
//    "total": 12,
//    "total_pages": 2,

data class User(
    val id: Long?,
    val email: String?,
    @SerializedName("first_name")
    val firstName: String?,
    @SerializedName("last_name")
    val lastName: String?,
    val avatar: String?


)

data class ReqResData<T> (
    val page: Int?,
    @SerializedName("per_page")
    val perPage: Int,
    val total: Int,
    @SerializedName("total_pages")
    val totalPages: Int,
    val data: T?,
)

data class Resource(
    val id: Long?,
    val name: String?,
    val year: Int?,
    val color: String?,
    @SerializedName("pantone_value")
    val pantonevalue: String?


)

data class ResourceData<T> (
    val page: Int?,
    @SerializedName("per_page")
    val perPage: Int,
    val total: Int,
    @SerializedName("total_pages")
    val totalPages: Int,
    val data: T?,
)

data class Create(
    val name: String?,
    val job: Int?,
    val id: Long?,
    val createdAt: String?
)