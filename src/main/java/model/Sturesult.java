package model;

import java.sql.Timestamp;
import java.util.Objects;

public class Sturesult {
    private long id;
    private Integer resChoice;
    private Integer resCriterion;
    private Integer resGapFilling;
    private Integer resProgramme;
    private Integer resTotal;
    private Timestamp joinTime;
    private Student studentByStuId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getResChoice() {
        return resChoice;
    }

    public void setResChoice(Integer resChoice) {
        this.resChoice = resChoice;
    }

    public Integer getResCriterion() {
        return resCriterion;
    }

    public void setResCriterion(Integer resCriterion) {
        this.resCriterion = resCriterion;
    }

    public Integer getResGapFilling() {
        return resGapFilling;
    }

    public void setResGapFilling(Integer resGapFilling) {
        this.resGapFilling = resGapFilling;
    }

    public Integer getResProgramme() {
        return resProgramme;
    }

    public void setResProgramme(Integer resProgramme) {
        this.resProgramme = resProgramme;
    }

    public Integer getResTotal() {
        return resTotal;
    }

    public void setResTotal(Integer resTotal) {
        this.resTotal = resTotal;
    }

    public Timestamp getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(Timestamp joinTime) {
        this.joinTime = joinTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sturesult sturesult = (Sturesult) o;
        return id == sturesult.id &&
                Objects.equals(resChoice, sturesult.resChoice) &&
                Objects.equals(resCriterion, sturesult.resCriterion) &&
                Objects.equals(resGapFilling, sturesult.resGapFilling) &&
                Objects.equals(resProgramme, sturesult.resProgramme) &&
                Objects.equals(resTotal, sturesult.resTotal) &&
                Objects.equals(joinTime, sturesult.joinTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, resChoice, resCriterion, resGapFilling, resProgramme, resTotal, joinTime);
    }

    public Student getStudentByStuId() {
        return studentByStuId;
    }

    public void setStudentByStuId(Student studentByStuId) {
        this.studentByStuId = studentByStuId;
    }
}
