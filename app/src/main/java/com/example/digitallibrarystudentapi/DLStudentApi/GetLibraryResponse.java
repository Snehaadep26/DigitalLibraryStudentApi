package com.example.digitallibrarystudentapi.DLStudentApi;

import java.util.ArrayList;
import java.util.Date;

public class GetLibraryResponse {
    public ArrayList<TotalCount> totalCount;
    public int lastWeekLectureNotesCount;
    public int lastWeekVideoCount;
    public int lastWeekQuestionBankCount;
    public ArrayList<ContentGL> contents;

    public GetLibraryResponse(ArrayList<TotalCount> totalCount, int lastWeekLectureNotesCount, int lastWeekVideoCount, int lastWeekQuestionBankCount, ArrayList<ContentGL> contents) {
        this.totalCount = totalCount;
        this.lastWeekLectureNotesCount = lastWeekLectureNotesCount;
        this.lastWeekVideoCount = lastWeekVideoCount;
        this.lastWeekQuestionBankCount = lastWeekQuestionBankCount;
        this.contents = contents;
    }

    public ArrayList<TotalCount> getTotalCount() {
        return totalCount;
    }

    public int getLastWeekLectureNotesCount() {
        return lastWeekLectureNotesCount;
    }

    public int getLastWeekVideoCount() {
        return lastWeekVideoCount;
    }

    public int getLastWeekQuestionBankCount() {
        return lastWeekQuestionBankCount;
    }

    public ArrayList<ContentGL> getContents() {
        return contents;
    }
}

