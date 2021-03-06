package com.example.digitallibrarystudentapi.DLStudentApi;

import java.util.Date;

public class LectureNote {
    public int id;
    public String title;
    public Object link;
    public String file;
    public Object fileName;
    public int size;
    public String type;
    public String status;
    public Date publishDate;
    public String chapterName;
    public int chapterId;
    public int subjectId;
    public int standardId;
    public int topicId;
    public Date updatedAt;
    public Date createdAt;
    public Standard standard;
    public Subject subject;
    public Chapter chapter;
    public Topic topic;
}
