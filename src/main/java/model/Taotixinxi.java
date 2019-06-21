package model;

import java.sql.Timestamp;
import java.util.Objects;

public class Taotixinxi {
    private long taotiId;
    private String taotiName;
    private Timestamp taotiJoinTime;
    private String taotiCId;
    private String taotiJId;
    private String taotiGapId;
    private String taotiPId;
    private Sturesult sturesultByTaotiId;
    private Student studentByTaotiStuId;

    public long getTaotiId() {
        return taotiId;
    }

    public void setTaotiId(long taotiId) {
        this.taotiId = taotiId;
    }

    public String getTaotiName() {
        return taotiName;
    }

    public void setTaotiName(String taotiName) {
        this.taotiName = taotiName;
    }

    public Timestamp getTaotiJoinTime() {
        return taotiJoinTime;
    }

    public void setTaotiJoinTime(Timestamp taotiJoinTime) {
        this.taotiJoinTime = taotiJoinTime;
    }

    public String getTaotiCId() {
        return taotiCId;
    }

    public void setTaotiCId(String taotiCId) {
        this.taotiCId = taotiCId;
    }

    public String getTaotiJId() {
        return taotiJId;
    }

    public void setTaotiJId(String taotiJId) {
        this.taotiJId = taotiJId;
    }

    public String getTaotiGapId() {
        return taotiGapId;
    }

    public void setTaotiGapId(String taotiGapId) {
        this.taotiGapId = taotiGapId;
    }

    public String getTaotiPId() {
        return taotiPId;
    }

    public void setTaotiPId(String taotiPId) {
        this.taotiPId = taotiPId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Taotixinxi that = (Taotixinxi) o;
        return taotiId == that.taotiId &&
                Objects.equals(taotiName, that.taotiName) &&
                Objects.equals(taotiJoinTime, that.taotiJoinTime) &&
                Objects.equals(taotiCId, that.taotiCId) &&
                Objects.equals(taotiJId, that.taotiJId) &&
                Objects.equals(taotiGapId, that.taotiGapId) &&
                Objects.equals(taotiPId, that.taotiPId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taotiId, taotiName, taotiJoinTime, taotiCId, taotiJId, taotiGapId, taotiPId);
    }

    public Sturesult getSturesultByTaotiId() {
        return sturesultByTaotiId;
    }

    public void setSturesultByTaotiId(Sturesult sturesultByTaotiId) {
        this.sturesultByTaotiId = sturesultByTaotiId;
    }

    public Student getStudentByTaotiStuId() {
        return studentByTaotiStuId;
    }

    public void setStudentByTaotiStuId(Student studentByTaotiStuId) {
        this.studentByTaotiStuId = studentByTaotiStuId;
    }
}
