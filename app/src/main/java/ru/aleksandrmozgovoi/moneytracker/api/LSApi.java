package ru.aleksandrmozgovoi.moneytracker.api;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;
import ru.aleksandrmozgovoi.moneytracker.Item;

/**
 * Created by AleksandrMozgovoy on 03.07.2017.
 */

public interface LSApi {

    @Headers("Content-Type: application/json")
    @GET("items")
    Call<List<Item>> items(@Query("type") String type);

    @POST("items/add")
    Call<AddResult> add(@Query("name") String name, @Query("price") int price, @Query("type") String type);

}
