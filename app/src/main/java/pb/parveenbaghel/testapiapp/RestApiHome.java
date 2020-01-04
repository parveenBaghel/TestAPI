package pb.parveenbaghel.testapiapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.List;

import pb.parveenbaghel.testapiapp.RetrofitApi.APIInterface;
import pb.parveenbaghel.testapiapp.RetrofitApi.API_Client;
import pb.parveenbaghel.testapiapp.POJO.UserItems;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RestApiHome extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RetroAPI_Adapters retroAPIAdapters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restapihome);


        APIInterface apiInterface= API_Client.getAPI_Client().create(APIInterface.class);
        Call<List<UserItems>> call=apiInterface.getUserItem();

        call.enqueue(new Callback<List<UserItems>>() {
            @Override
            public void onResponse(Call<List<UserItems>> call, Response<List<UserItems>> response) {
                genratedlistview(response.body());
            }

            @Override
            public void onFailure(Call<List<UserItems>> call, Throwable throwable) {
                Toast.makeText(getApplicationContext(),"sorry"+throwable,Toast.LENGTH_SHORT).show();

            }
        });

    }

    private void genratedlistview(List<UserItems> userItems){

        recyclerView = findViewById(R.id.Recyclerview);
        retroAPIAdapters=new RetroAPI_Adapters(this,userItems);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(RestApiHome.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(retroAPIAdapters);
    }
}
