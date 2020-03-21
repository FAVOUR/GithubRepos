package com.example.githubrepos.api

import com.example.githubrepos.model.Repo
import com.google.gson.annotations.SerializedName

class RepoSearchResponse (
    @SerializedName("total_count") val total: Int = 0,
    @SerializedName("items") val items: List<Repo> = emptyList(),
    val nextPage: Int? = null
)