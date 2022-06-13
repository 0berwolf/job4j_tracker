package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Кто ты? ");
        String name = input.nextLine();
        System.out.println(name + ", и что ты хотел?");
        String name1 = input.nextLine();
        System.out.println(name1 + " от 0 до 3");
        System.out.print("Твой ответ: ");
        int answer = new Random().nextInt(3);
        if (answer == 0) {
            System.out.println("Да");
        } else if (answer == 1) {
            System.out.println("Нет");
        } else {
            System.out.println("Может быть");
        }
    }
}
