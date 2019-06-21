package model;

import java.util.Objects;

public class GapFilling {
    private long gapId;
    private String gapSubject;
    private long gapType;
    private String gapAnswer;
    private String gapNote;

    private TopicType topicType;

    public long getGapId() {
        return gapId;
    }

    public void setGapId(long gapId) {
        this.gapId = gapId;
    }

    public String getGapSubject() {
        return gapSubject;
    }

    public void setGapSubject(String gapSubject) {
        this.gapSubject = gapSubject;
    }

    public long getGapType() {
        return gapType;
    }

    public void setGapType(long gapType) {
        this.gapType = gapType;
    }

    public String getGapAnswer() {
        return gapAnswer;
    }

    public void setGapAnswer(String gapAnswer) {
        this.gapAnswer = gapAnswer;
    }

    public String getGapNote() {
        return gapNote;
    }

    public void setGapNote(String gapNote) {
        this.gapNote = gapNote;
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
        GapFilling that = (GapFilling) o;
        return gapId == that.gapId &&
                gapType == that.gapType &&
                Objects.equals(gapSubject, that.gapSubject) &&
                Objects.equals(gapAnswer, that.gapAnswer) &&
                Objects.equals(gapNote, that.gapNote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gapId, gapSubject, gapType, gapAnswer, gapNote);
    }
}
