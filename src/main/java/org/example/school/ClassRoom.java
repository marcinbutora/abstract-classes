package org.example.school;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom {
    private final List<Student> studentList = new ArrayList<>();
    private final List<Teacher> teachersList = new ArrayList<>();

    public void enter(Student student) {
        studentList.add(student);
        System.out.println("Enter " + student.getFirstname() + " " + student.getLastname());
    }

    public void leave(Student student) {
        studentList.remove(student);
        System.out.println("Leaving  " + student.getFirstname() + " " + student.getLastname());
    }

    public void showStudentDetail(int i, Student student) {
        System.out.println(studentList.get(i).getLastname());
    }

    public void getNumberOfStudents() {
        int count = 0;
        while (count < studentList.size()) {
            count += 1;
        }
        System.out.println("In classroom are " + count + " students");
    }

    public void getStudentsList() {
        for (Student student : studentList) {
            System.out.println(student.getFirstname() + " " + student.getLastname());
        }
    }

    public void isPresent(Student student) {
        for (Student value : studentList) {
            if (student.getFirstname().equals(value.getFirstname())) {
                if (student.getLastname().equals(value.getLastname())) {
                    System.out.println("Student " + student.getLastname() + " is present");
                }
            }
        }
        System.out.println("Student " + student.getLastname() + " is absent.");
    }
}
