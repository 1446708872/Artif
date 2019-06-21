package model;

import java.util.Objects;

public class Choice {
    private long cId;
    private String cSubject;
    private long cType;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private String cAnswer;
    private String cNote;
    private TopicType topicType;

    public long getcId() {
        return cId;
    }

    public void setcId(long cId) {
        this.cId = cId;
    }

    public String getcSubject() {
        return cSubject;
    }

    public void setcSubject(String cSubject) {
        this.cSubject = cSubject;
    }

    public long getcType() {
        return cType;
    }

    public void setcType(long cType) {
        this.cType = cType;
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

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }

    public String getcAnswer() {
        return cAnswer;
    }

    public void setcAnswer(String cAnswer) {
        this.cAnswer = cAnswer;
    }

    public String getcNote() {
        return cNote;
    }

    public void setcNote(String cNote) {
        this.cNote = cNote;
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
        Choice choice = (Choice) o;
        return cId == choice.cId &&
                cType == choice.cType &&
                Objects.equals(cSubject, choice.cSubject) &&
                Objects.equals(optionA, choice.optionA) &&
                Objects.equals(optionB, choice.optionB) &&
                Objects.equals(optionC, choice.optionC) &&
                Objects.equals(optionD, choice.optionD) &&
                Objects.equals(cAnswer, choice.cAnswer) &&
                Objects.equals(cNote, choice.cNote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cId, cSubject, cType, optionA, optionB, optionC, optionD, cAnswer, cNote);
    }
}
