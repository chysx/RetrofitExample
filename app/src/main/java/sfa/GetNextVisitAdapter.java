package sfa;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by beiyong14 on 2016/3/23.
 */
public class GetNextVisitAdapter {
    private RestAdapter restAdapter;
    private GetNextVisitApi getNextVisitApi;
    public GetNextVisitAdapter(){
        restAdapter = new RestAdapter.Builder()
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .setEndpoint("http://180.166.98.86:8866/PriceService/Price.svc")
                .setErrorHandler(new NextVisitErrorHandler())
                .build();
        getNextVisitApi = restAdapter.create(GetNextVisitApi.class);
    }

    public void testApiBySync(){
        VisitDateEntity body = new VisitDateEntity("D000043605","0L11004760","20160324","","");
        VisitDateEntity vde = getNextVisitApi.getWeatherFromApiBySync(body);
        System.out.println(vde);
    }

    public void testApiByAsync(){
        VisitDateEntity body = new VisitDateEntity("D000043605","0L11004760","20160324","","");
        getNextVisitApi.getWeatherFromApiByAsync(body, new Callback<VisitDateEntity>() {
            @Override
            public void success(VisitDateEntity visitDateEntity, Response response) {
                System.out.println("success");
            }

            @Override
            public void failure(RetrofitError error) {
                System.out.println("failure");
            }
        });
    }
}
