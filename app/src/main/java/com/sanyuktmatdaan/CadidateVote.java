package com.sanyuktmatdaan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CadidateVote extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CandidateAdapter castAdapter;
    private List<CandidateModel> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_candidate_vote);

        recyclerView = findViewById(R.id.recyclerCastVote);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        itemList = new ArrayList<>();
        castAdapter = new CandidateAdapter(itemList);
        recyclerView.setAdapter(castAdapter);


        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("http:192.168.130.210:8383/api/candidate/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        JsonHolderApi jsonHolderApi = retrofit.create(JsonHolderApi.class);
        Call<List<CandidateModel>> call = jsonHolderApi.getPosts();
        call.enqueue(new Callback<List<CandidateModel>>() {
            @Override
            public void onResponse(Call<List<CandidateModel>> call, Response<List<CandidateModel>> response) {
                if(!response.isSuccessful()){

                    return;

                }
                itemList.clear(); // Clear existing data
                itemList.addAll(response.body()); // Add new data
                castAdapter.notifyDataSetChanged();

            }

            @Override
            public void onFailure(Call<List<CandidateModel>> call, Throwable t) {

                return;
            }
        });
    }


}
