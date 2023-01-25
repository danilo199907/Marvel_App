package com.example.marvelaplication.data.model.comic

import com.example.marvelaplication.data.model.ThumbnailModel
import com.google.gson.annotations.SerializedName

data class ComicModel(
    @SerializedName("id")
    val id : Int,

    @SerializedName("title")
    val title : String,

    @SerializedName("description")
    val description : String,

    @SerializedName("thumbnail")
    val thumbnailModel: ThumbnailModel
) : java.io.Serializable