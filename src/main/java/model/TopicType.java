package model;

import javassist.bytecode.CodeIterator;

import java.util.*;

public class TopicType {
    private long id;
    private String value;
    private Set<Choice> choiceSet = new HashSet<Choice>();
    private Set<GapFilling> GapFillingSet = new HashSet<GapFilling>();
    private Set<Judje> JudieSet = new HashSet<Judje>();
    private Set<Programme> ProgrammeSet = new HashSet<Programme>();


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Set<Choice> getChoiceSet() {
        return choiceSet;
    }

    public void setChoiceSet(Set<Choice> choiceSet) {
        this.choiceSet = choiceSet;
    }

    public Set<GapFilling> getGapFillingSet() {
        return GapFillingSet;
    }

    public void setGapFillingSet(Set<GapFilling> gapFillingSet) {
        GapFillingSet = gapFillingSet;
    }

    public Set<Judje> getJudieSet() {
        return JudieSet;
    }

    public void setJudieSet(Set<Judje> judieSet) {
        JudieSet = judieSet;
    }

    public Set<Programme> getProgrammeSet() {
        return ProgrammeSet;
    }

    public void setProgrammeSet(Set<Programme> programmeSet) {
        ProgrammeSet = programmeSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TopicType topicType = (TopicType) o;
        return id == topicType.id &&
                Objects.equals(value, topicType.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, value);
    }
}
