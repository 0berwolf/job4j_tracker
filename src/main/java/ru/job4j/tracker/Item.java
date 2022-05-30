package ru.job4j.tracker;

public class Item {
    private int id;
    private String name;

    public Item() {
    }

    public Item(String name) {
        this.name = name;
    }

    public Item(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void getInfo() {
        System.out.println("enter your name : " + name);
        System.out.println();
    }

    public void getInfo1() {
        System.out.println("enter your name : " + name);
        System.out.println("enter your id : " + id);
    }

    public static void main(String[] args) {
        Item item = new Item();
        item.getInfo();
        Item second = new Item("Andrei");
        second.getInfo();
        Item third = new Item("Andrei", 2948188);
        third.getInfo1();
    }
}