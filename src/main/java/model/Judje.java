package model;

import java.util.Objects;

public class Judje {
    private long jId;
    private String jSubject;
    private long jType;
    private String optionA;
    private String optionB;
    private String jAnswer;
    private String jNote;
    private TopicType topicType;

    public long getjId() {
        return jId;
    }

    public void setjId(long jId) {
        this.jId = jId;
    }

    public String getjSubject() {
        return jSubject;
    }

    public void setjSubject(String jSubject) {
        this.jSubject = jSubject;
    }

    public long getjType() {
        return jType;
    }

    public void setjType(long jType) {
        this.jType = jType;
    }

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getjAnswer() {
        return jAnswer;
    }

    public void setjAnswer(String jAnswer) {
        this.jAnswer = jAnswer;
    }

    public String getjNote() {
        return jNote;
    }

    public void setjNote(String jNote) {
        this.jNote = jNote;
    }

    public TopicType getTopicType() {
        return topicType;
    }

    public void setTopicType(TopicType topicType) {
        this.topicType = topicType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Judje judje = (Judje) o;
        return jId == judje.jId &&
                jType == judje.jType &&
                Objects.equals(jSubject, judje.jSubject) &&
                Objects.equals(optionA, judje.optionA) &&
                Objects.equals(optionB, judje.optionB) &&
                Objects.equals(jAnswer, judje.jAnswer) &&
                Objects.equals(jNote, judje.jNote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jId, jSubject, jType, optionA, optionB, jAnswer, jNote);
    }
}
