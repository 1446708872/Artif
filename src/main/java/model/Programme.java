package model;

import java.util.Arrays;
import java.util.Objects;

public class Programme {
    private byte[] pId;
    private String pSubject;
    private long pType;
    private String pAnswer;
    private String pNote;
    private TopicType topicType;

    public TopicType getTopicType() {
        return topicType;
    }

    public void setTopicType(TopicType topicType) {
        this.topicType = topicType;
    }

    public byte[] getpId() {
        return pId;
    }

    public void setpId(byte[] pId) {
        this.pId = pId;
    }

    public String getpSubject() {
        return pSubject;
    }

    public void setpSubject(String pSubject) {
        this.pSubject = pSubject;
    }

    public long getpType() {
        return pType;
    }

    public void setpType(long pType) {
        this.pType = pType;
    }

    public String getpAnswer() {
        return pAnswer;
    }

    public void setpAnswer(String pAnswer) {
        this.pAnswer = pAnswer;
    }

    public String getpNote() {
        return pNote;
    }

    public void setpNote(String pNote) {
        this.pNote = pNote;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Programme programme = (Programme) o;
        return pType == programme.pType &&
                Arrays.equals(pId, programme.pId) &&
                Objects.equals(pSubject, programme.pSubject) &&
                Objects.equals(pAnswer, programme.pAnswer) &&
                Objects.equals(pNote, programme.pNote);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(pSubject, pType, pAnswer, pNote);
        result = 31 * result + Arrays.hashCode(pId);
        return result;
    }
}
