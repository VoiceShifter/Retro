package Interface

import Model.G
import android.graphics.Movie

import retrofit2.http.GET
import retrofit2.Call

interface RetrofitServices {
    @GET("marvel")
    fun getMovieList(): Call<MutableList<G>>
}