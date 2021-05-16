package com.company;

public class Student implements Comparable<Student> {
    private int course;
    private int group;
    private String surname;

    public Student(int course, int group, String surname) {
        this.course = course;
        this.group = group;
        this.surname = surname;
    }

    @Override
    public int compareTo( Student o) {

        int result = Integer.valueOf(course).compareTo(o.course);
        if(result==0) {
            return Integer.valueOf(group).compareTo(o.group) | String.valueOf(surname).compareTo(o.surname);
        }
        else {
            return result;
        }
    }


    public int getCourse() {
        return course;
    }

    public int getGroup() {
        return group;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "course=" + course +
                ", group=" + group +
                ", surname='" + surname + '\'' +
                '}' + '\n';
    }
}

