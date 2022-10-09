package org.example.school;

import java.time.LocalDate;
import java.util.Objects;

class Student {
    private String firstname;
    private String lastname;
    private LocalDate dateOfBirth;

    public Student(String firstname, String lastname, LocalDate dateOfBirth) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstname, student.firstname) && Objects.equals(lastname, student.lastname) && Objects.equals(dateOfBirth, student.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, dateOfBirth);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
