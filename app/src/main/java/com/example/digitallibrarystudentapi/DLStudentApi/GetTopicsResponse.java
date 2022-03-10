package com.example.digitallibrarystudentapi.DLStudentApi;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
public class GetTopicsResponse {
    public int topicId;
    public String topicName;
    public String notesCount;
    public String videoCount;
    public String quesBankCount;

    public GetTopicsResponse(int topicId, String topicName, String notesCount, String videoCount, String quesBankCount) {
        this.topicId = topicId;
        this.topicName = topicName;
        this.notesCount = notesCount;
        this.videoCount = videoCount;
        this.quesBankCount = quesBankCount;
    }

    public int getTopicId() {
        return topicId;
    }

    public String getTopicName() {
        return topicName;
    }

    public String getNotesCount() {
        return notesCount;
    }

    public String getVideoCount() {
        return videoCount;
    }

    public String getQuesBankCount() {
        return quesBankCount;
    }
}

