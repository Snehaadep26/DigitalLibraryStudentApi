package com.example.digitallibrarystudentapi.DLStudentApi;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface LogInService {
    @Headers({"Authorization:Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6NDMyLCJwaG9uZSI6IjIwMzk0OTk4NTIiLCJ1cmwiOiJ0ZXN0LnRoZWNsYXNzcm9vbS5iaXoiLCJvcmdJZCI6IjRjYjI1MDlkLTcwZjUtNDM1ZS04NzkyLWQyNDkzNzc0M2I1MyIsImJyb3dzZXJMb2dpbkNvZGUiOiIyMDM5NDk5ODUyNDMyYjUzOWVjZTItMGZjMS00ZDFkLTg3ZDYtMzc5ZTRlZWZiY2VhIiwiZGV2aWNlTG9naW5Db2RlIjpudWxsLCJpYXQiOjE2NDY4ODQ2NTN9.4E5jQCOm0iNDv-PnoOdrXwu66mqruV69sKGO9Uwhg0c",
            "orgurl:brigosha.classroom.digital"})
    @GET("admin-library/standardById")
    Call<GetStudentHomePageResponse> getStudHomeCall();

    @Headers({"Authorization:Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6NDMyLCJwaG9uZSI6IjIwMzk0OTk4NTIiLCJ1cmwiOiJ0ZXN0LnRoZWNsYXNzcm9vbS5iaXoiLCJvcmdJZCI6IjRjYjI1MDlkLTcwZjUtNDM1ZS04NzkyLWQyNDkzNzc0M2I1MyIsImJyb3dzZXJMb2dpbkNvZGUiOiIyMDM5NDk5ODUyNDMyYjUzOWVjZTItMGZjMS00ZDFkLTg3ZDYtMzc5ZTRlZWZiY2VhIiwiZGV2aWNlTG9naW5Db2RlIjpudWxsLCJpYXQiOjE2NDY4ODQ2NTN9.4E5jQCOm0iNDv-PnoOdrXwu66mqruV69sKGO9Uwhg0c",
            "orgurl:brigosha.classroom.digital"})
    @GET(" admin-library/chapter-list")
    Call<GetChapterListResponse> getChapterCall(@Query("subjectId") int subjectId);

    @Headers({"Authorization:Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6NDMyLCJwaG9uZSI6IjIwMzk0OTk4NTIiLCJ1cmwiOiJ0ZXN0LnRoZWNsYXNzcm9vbS5iaXoiLCJvcmdJZCI6IjRjYjI1MDlkLTcwZjUtNDM1ZS04NzkyLWQyNDkzNzc0M2I1MyIsImJyb3dzZXJMb2dpbkNvZGUiOiIyMDM5NDk5ODUyNDMyYjUzOWVjZTItMGZjMS00ZDFkLTg3ZDYtMzc5ZTRlZWZiY2VhIiwiZGV2aWNlTG9naW5Db2RlIjpudWxsLCJpYXQiOjE2NDY4ODQ2NTN9.4E5jQCOm0iNDv-PnoOdrXwu66mqruV69sKGO9Uwhg0c",
            "orgurl:brigosha.classroom.digital"})
    @GET(" admin-library/topic-list-by-chapterId")
    Call<List<GetTopicsResponse>> getTopicsCall(@Query("chapterId") int chapterId, @Query("subjectId") int subjectId);


    @Headers({"Authorization:Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6NDMyLCJwaG9uZSI6IjIwMzk0OTk4NTIiLCJ1cmwiOiJ0ZXN0LnRoZWNsYXNzcm9vbS5iaXoiLCJvcmdJZCI6IjRjYjI1MDlkLTcwZjUtNDM1ZS04NzkyLWQyNDkzNzc0M2I1MyIsImJyb3dzZXJMb2dpbkNvZGUiOiIyMDM5NDk5ODUyNDMyYjUzOWVjZTItMGZjMS00ZDFkLTg3ZDYtMzc5ZTRlZWZiY2VhIiwiZGV2aWNlTG9naW5Db2RlIjpudWxsLCJpYXQiOjE2NDY4ODQ2NTN9.4E5jQCOm0iNDv-PnoOdrXwu66mqruV69sKGO9Uwhg0c",
            "orgurl:brigosha.classroom.digital"})
    @GET(" admin-library/library-contents")
    Call<GetLibraryResponse> getLibraryCall(@Query("topicId") int topicId, @Query("chapterId") int chapterId);

}
