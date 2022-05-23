package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("I can sign a song : " + "Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("I can sign a song : " + "Спокойной ночи");
        } else {
            System.out.println("I can't sign a song : " + "Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox funy = new Jukebox();
        funy.music(1);
        funy.music(2);
        funy.music(3);
    }
}
