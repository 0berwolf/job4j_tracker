package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return "Неизвестное слово : " + eng;
    }

    public static void main(String[] args) {
        DummyDic ex = new DummyDic();
        ex.engToRus("discord");
        System.out.println(ex.engToRus("discord"));
    }
}
