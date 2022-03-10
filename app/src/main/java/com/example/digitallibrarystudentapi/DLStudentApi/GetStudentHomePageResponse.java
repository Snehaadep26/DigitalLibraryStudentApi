package com.example.digitallibrarystudentapi.DLStudentApi;

import java.util.ArrayList;
import java.util.Date;
public class GetStudentHomePageResponse {
        public boolean showLibrary;
        public ArrayList<TotalCount> totalCount;
        public int lastWeekLectureNotesCount;
        public int lastWeekVideoCount;
        public int lastWeekQuestionBankCount;
        public ArrayList<Subject> subjects;
        public ArrayList<QuestionBank> questionBank;
        public ArrayList<Video> video;
        public ArrayList<LectureNote> lectureNotes;

    public GetStudentHomePageResponse(boolean showLibrary, ArrayList<TotalCount> totalCount, int lastWeekLectureNotesCount, int lastWeekVideoCount, int lastWeekQuestionBankCount, ArrayList<Subject> subjects, ArrayList<QuestionBank> questionBank, ArrayList<Video> video, ArrayList<LectureNote> lectureNotes) {
        this.showLibrary = showLibrary;
        this.totalCount = totalCount;
        this.lastWeekLectureNotesCount = lastWeekLectureNotesCount;
        this.lastWeekVideoCount = lastWeekVideoCount;
        this.lastWeekQuestionBankCount = lastWeekQuestionBankCount;
        this.subjects = subjects;
        this.questionBank = questionBank;
        this.video = video;
        this.lectureNotes = lectureNotes;
    }

    public boolean isShowLibrary() {
        return showLibrary;
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

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public ArrayList<QuestionBank> getQuestionBank() {
        return questionBank;
    }

    public ArrayList<Video> getVideo() {
        return video;
    }

    public ArrayList<LectureNote> getLectureNotes() {
        return lectureNotes;
    }
}



