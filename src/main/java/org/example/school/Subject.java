package org.example.school;

import java.util.Objects;

public class Subject {
    private String subjectName;
    private Teacher teacher;
    private Student student;

    public Subject(String subjectName, Teacher teacher, Student student) {
        this.subjectName = subjectName;
        this.teacher = teacher;
        this.student = student;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return Objects.equals(subjectName, subject.subjectName) && Objects.equals(teacher, subject.teacher) && Objects.equals(student, subject.student);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subjectName, teacher, student);
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectName='" + subjectName + '\'' +
                ", teacher=" + teacher +
                ", student=" + student +
                '}';
    }
}
