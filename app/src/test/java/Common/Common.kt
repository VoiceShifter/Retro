package Common

import Interface.RetrofitServices
import Retrofit.RetrofitClient


object Common {
    private val BASE_URL = "https://json.link/EPyAf2QZ4S"
    val retrofitService: RetrofitServices
        get() = RetrofitClient.getClient(BASE_URL).create(RetrofitServices::class.java)
}