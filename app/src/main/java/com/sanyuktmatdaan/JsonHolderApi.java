
package com.sanyuktmatdaan;



import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


public interface JsonHolderApi {

        @GET("getAllCandidate")
        Call<List<CandidateModel>> getPosts();




    }

