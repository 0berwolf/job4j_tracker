package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Андрей Алексеевич Голуб");
        student.setGroup(" МЭ-11 ");
        student.setStarting(new Date());

        System.out.println(student.getFio() + student.getGroup() + student.getStarting());
    }
}
