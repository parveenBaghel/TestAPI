package pb.parveenbaghel.testapiapp.RetrofitApi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class API_Client {

    private static String BaseURL="https://jsonplaceholder.typicode.com";
private static Retrofit retrofit;
    public static Retrofit getAPI_Client() {
        if (retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BaseURL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }
    return retrofit;
    }

}
