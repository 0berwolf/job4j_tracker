package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11");
        boolean turn = true;
        int count = 11;

        while (count > 0) {
            String player = turn ? "Первый игрок " : "Второй игрок ";
            System.out.println(player + "Введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            turn = !turn;
            for (int i = 1; i < 2; i++) {
                System.out.println("На столе спичек: " + count + ", количество спичек, которое надо убрать: " + matches);
                count = count - matches;
                if (count <= 0) {
                    turn = true;
                    break;
                }
            } if (count > 0) {
                System.out.println("Сделайте свой ход.");
                matches = parseInt(1, 3);
                if (matches < 1 || matches > 3) {
                    System.out.println("Введённое число должно быть в пределах от " + 1 + " до " + 3);
                    System.out.println("Введите число ещё раз: ");
                }
            }

        }
                if (!turn) {
                    System.out.println("Выиграл первый игрок");
                } else {
                    System.out.println("Выиграл второй игрок");
                }
            }

            public static int parseInt(int min, int max) {
                Scanner scanner = new Scanner(System.in);
                int nbr = 0;
                if (scanner.hasNextInt()) {
                    nbr = scanner.nextInt();
                    if (nbr < min || nbr > max) {
                        System.out.println("Введённое число должно быть в пределах от " + min + " до " + max);
                        System.out.println("Введите число ещё раз: ");
                        nbr = parseInt(min, max);
                    }
                }
                return nbr;
        }
    }



