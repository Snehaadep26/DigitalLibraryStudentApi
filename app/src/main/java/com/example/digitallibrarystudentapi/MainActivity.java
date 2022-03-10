package com.example.digitallibrarystudentapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.digitallibrarystudentapi.DLStudentApi.ApiClient;
import com.example.digitallibrarystudentapi.DLStudentApi.Chapter;
import com.example.digitallibrarystudentapi.DLStudentApi.ContentGL;
import com.example.digitallibrarystudentapi.DLStudentApi.GetChapterListResponse;
import com.example.digitallibrarystudentapi.DLStudentApi.GetLibraryResponse;
import com.example.digitallibrarystudentapi.DLStudentApi.GetStudentHomePageResponse;
import com.example.digitallibrarystudentapi.DLStudentApi.GetTopicsResponse;
import com.example.digitallibrarystudentapi.DLStudentApi.LogInService;
import com.example.digitallibrarystudentapi.DLStudentApi.Topic;
import com.example.digitallibrarystudentapi.DLStudentApi.TotalCount;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    GetStudentHomePageResponse getStudentHomePageResponse;
    GetChapterListResponse getChapterListResponse;
    List<GetTopicsResponse> getTopicsResponse;
    GetLibraryResponse getLibraryResponse;
    Retrofit retrofit;
    LogInService logInService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apiInIt();
        getStudHomeP();
        getChapter();
        getTopics();
        getLibrary();
    }
    public void apiInIt()
    {
        retrofit= ApiClient.getRetrofit();
        logInService=ApiClient.getLoginService();
    }
    public void getStudHomeP()
    {
        Call<GetStudentHomePageResponse> call=logInService.getStudHomeCall();
        call.enqueue(new Callback<GetStudentHomePageResponse>() {
            @Override
            public void onResponse(Call<GetStudentHomePageResponse> call, Response<GetStudentHomePageResponse> response) {
                if(!response.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_LONG).show();
                }
                getStudentHomePageResponse=response.body();
                List<TotalCount> totalCount=getStudentHomePageResponse.totalCount;
                for (TotalCount tc:
                     totalCount) {
                    Toast.makeText(getApplicationContext(), String.valueOf(tc.notesCount), Toast.LENGTH_LONG).show();
                }
            }
            @Override
            public void onFailure(Call<GetStudentHomePageResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Error fail in home page", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void getChapter()
    {
        Call<GetChapterListResponse> call=logInService.getChapterCall(33);
        call.enqueue(new Callback<GetChapterListResponse>() {
            @Override
            public void onResponse(Call<GetChapterListResponse> call, Response<GetChapterListResponse> response) {
                if(!response.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_LONG).show();
                }
                getChapterListResponse=response.body();
                List<Chapter> chapters=getChapterListResponse.chapters;
                for(Chapter ch:
                     chapters) {
                    Toast.makeText(getApplicationContext(), String.valueOf(ch.chapterName), Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<GetChapterListResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Error in get chapter", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void getTopics()
    {
        Call<List<GetTopicsResponse>> call=logInService.getTopicsCall(24,33);
        call.enqueue(new Callback<List<GetTopicsResponse>>() {
            @Override
            public void onResponse(Call<List<GetTopicsResponse>> call, Response<List<GetTopicsResponse>> response) {
                if(!response.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_LONG).show();
                }
                getTopicsResponse=response.body();
                GetTopicsResponse response1=getTopicsResponse.get(3);
                Toast.makeText(getApplicationContext(), response1.topicName, Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(Call<List<GetTopicsResponse>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Error in get topic", Toast.LENGTH_SHORT).show();

            }
        });
    }
    public void getLibrary(){
        Call<GetLibraryResponse> call=logInService.getLibraryCall(214,24);
        call.enqueue(new Callback<GetLibraryResponse>() {
            @Override
            public void onResponse(Call<GetLibraryResponse> call, Response<GetLibraryResponse> response) {
                if(!response.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_SHORT).show();
                }
                getLibraryResponse=response.body();
                List<ContentGL> contentGL=getLibraryResponse.contents;
                for(ContentGL chg:
                     contentGL) {
                    Toast.makeText(getApplicationContext(), String.valueOf(chg.title), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<GetLibraryResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "error in get library", Toast.LENGTH_SHORT).show();
            }
        });
    }
}