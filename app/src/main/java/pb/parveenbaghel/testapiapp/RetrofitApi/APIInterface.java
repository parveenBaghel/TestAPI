package pb.parveenbaghel.testapiapp.RetrofitApi;

import java.util.List;

import pb.parveenbaghel.testapiapp.POJO.UserItems;
import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {

    @GET("/posts")
    Call<List<UserItems>> getUserItem();

}
