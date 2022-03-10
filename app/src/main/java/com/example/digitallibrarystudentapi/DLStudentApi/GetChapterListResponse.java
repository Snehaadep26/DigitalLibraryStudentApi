package com.example.digitallibrarystudentapi.DLStudentApi;

import java.util.ArrayList;

public class GetChapterListResponse {
        public int chapterCount;
        public ArrayList<Chapter> chapters;

    public GetChapterListResponse(int chapterCount, ArrayList<Chapter> chapters) {
        this.chapterCount = chapterCount;
        this.chapters = chapters;
    }

    public int getChapterCount() {
        return chapterCount;
    }

    public ArrayList<Chapter> getChapters() {
        return chapters;
    }
}



