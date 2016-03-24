package sfa;

import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
import retrofit.http.Part;

/**
 * Created by beiyong14 on 2016/3/23.
 */
public interface GetNextVisitApi {
    @POST("/GetNextVisitDate")
    VisitDateEntity getWeatherFromApiBySync(@Body VisitDateEntity vde);

    @POST("/GetNextVisitDate")
    void getWeatherFromApiByAsync(
            @Body VisitDateEntity vde,
            Callback<VisitDateEntity> callback);
}
