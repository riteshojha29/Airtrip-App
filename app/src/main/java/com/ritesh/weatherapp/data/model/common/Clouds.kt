package com.ritesh.weatherapp.data.model.common

import com.google.gson.annotations.SerializedName

data class Clouds (
	@SerializedName("all") val all : Int
)