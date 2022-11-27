package ru.job4j.encapsulation;

import java.util.Date;

public class Police {
    public static void main(String[] args) {
        License license = new License();
        license.setOwner("Andrei Golub");
        license.setModel("Volkswagen Golf mk7");
        license.setCode("7354 KI-3");
        license.setCreated(new Date());

        System.out.println(license.getOwner() + " has a car - " + license.getModel() + " : " + license.getCode());
    }
}

