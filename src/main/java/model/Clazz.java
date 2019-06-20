package model;

import java.util.Objects;
import java.util.Set;

public class Clazz {
    private long classId;
    private String classValue;
    private Set<Student> students;

    public long getClassId() {
        return classId;
    }

    public void setClassId(long classId) {
        this.classId = classId;
    }

    public String getClassValue() {
        return classValue;
    }

    public void setClassValue(String classValue) {
        this.classValue = classValue;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clazz clazz = (Clazz) o;
        return classId == clazz.classId &&
                Objects.equals(classValue, clazz.classValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classId, classValue);
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "classId=" + classId +
                ", classValue='" + classValue + '\'' +
                '}';
    }
}
