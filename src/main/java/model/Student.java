package model;

import java.util.Objects;
import java.util.Set;

public class Student {
    private long stuId;
    private String username;
    private String password;
    private String sex;
    private String question;
    private String answer;
    private long stuClassId;
    private Clazz clazz;
    private Set<Taotixinxi> taotixinxis;


    public long getStuId() {
        return stuId;
    }

    public void setStuId(long stuId) {
        this.stuId = stuId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public long getStuClassId() {
        return stuClassId;
    }

    public void setStuClassId(long stuClassId) {
        this.stuClassId = stuClassId;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public Set<Taotixinxi> getTaotixinxis() {
        return taotixinxis;
    }

    public void setTaotixinxis(Set<Taotixinxi> taotixinxis) {
        this.taotixinxis = taotixinxis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return stuId == student.stuId &&
                stuClassId == student.stuClassId &&
                Objects.equals(username, student.username) &&
                Objects.equals(password, student.password) &&
                Objects.equals(sex, student.sex) &&
                Objects.equals(question, student.question) &&
                Objects.equals(answer, student.answer);
    }

    @Override
    public String toString() {
        return "Student{" +
                ", stuId=" + stuId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                ", stuClassId=" + stuClassId +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(stuId, username, password, sex, question, answer, stuClassId);
    }
}
