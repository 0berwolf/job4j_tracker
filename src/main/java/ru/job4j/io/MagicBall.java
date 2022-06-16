package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Кто ты? ");
        String name = input.nextLine();
        System.out.println(name + ", и что ты хотел?");
        System.out.println("загадать число от 0 до 3 ");
        System.out.print("Ответ при выборе числа: ");
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
