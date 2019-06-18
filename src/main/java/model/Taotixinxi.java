package model;

import java.sql.Timestamp;
import java.util.Objects;
import java.util.Set;

public class Taotixinxi {
    private long taotiId;
    private String taotiName;
    private long taotiLessonId;
    private Timestamp taotiJoinTime;
    private long taotiStuId;
    private Student students;

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

    public long getTaotiLessonId() {
        return taotiLessonId;
    }

    public void setTaotiLessonId(long taotiLessonId) {
        this.taotiLessonId = taotiLessonId;
    }

    public Timestamp getTaotiJoinTime() {
        return taotiJoinTime;
    }

    public void setTaotiJoinTime(Timestamp taotiJoinTime) {
        this.taotiJoinTime = taotiJoinTime;
    }

    public long getTaotiStuId() {
        return taotiStuId;
    }

    public void setTaotiStuId(long taotiStuId) {
        this.taotiStuId = taotiStuId;
    }

    public Student getStudents() {
        return students;
    }

    public void setStudents(Student students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Taotixinxi that = (Taotixinxi) o;
        return taotiId == that.taotiId &&
                taotiLessonId == that.taotiLessonId &&
                taotiStuId == that.taotiStuId &&
                Objects.equals(taotiName, that.taotiName) &&
                Objects.equals(taotiJoinTime, that.taotiJoinTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taotiId, taotiName, taotiLessonId, taotiJoinTime, taotiStuId);
    }
}
