package sfa;

import retrofit.ErrorHandler;
import retrofit.RetrofitError;

/**
 * Created by beiyong14 on 2016/3/23.
 */
public class NextVisitErrorHandler implements ErrorHandler{
    @Override
    public Throwable handleError(RetrofitError cause) {
        System.out.println("status = " + cause.getResponse().getStatus());
        return cause;
    }
}
