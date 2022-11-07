package ru.job4j.map;

import java.util.Objects;

public class Subject1 {
    private String name;
    private int score;

    public Subject1(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Subject1 subject1 = (Subject1) o;
        return Objects.equals(name, subject1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
