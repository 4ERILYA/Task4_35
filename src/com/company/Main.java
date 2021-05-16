package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        Student student1 = new Student(1, 2, "Ivanov");
        Student student2 = new Student(2, 1, "Chizhikov");
        Student student3 = new Student(1, 2, "Portnov");
        Student student4 = new Student(1, 1, "Chopkin");
        Student student5 = new Student(3, 2, "Nesterova");
        Student student6 = new Student(4, 2, "Sinicin");
        Student student7 = new Student(2, 2, "Kotikov");
        Student student8 = new Student(3, 1, "Kiselev");
        Student student9 = new Student(1, 1, "Batrakova");
        Student student10 = new Student(1, 2, "Shevelev");
        Student student11 = new Student(2, 1, "Chuprina");
        Student student12 = new Student(4, 2, "Bazukina");
        Student student13 = new Student(3, 1, "Sderzhikov");


        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);
        students.add(student11);
        students.add(student12);
        students.add(student13);

        System.out.println("-------до сортировки--------");
        for (Student u : students) {
            System.out.println(u);
        }
        System.out.println("-------после сортировки-----");
        Collections.sort(students);
        for (Student u : students) {
            System.out.println(u);
        }
    }
}