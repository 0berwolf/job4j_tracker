package ru.job4j.ooa;

public final class Airbus extends Aircraft {

    private static final int COUNT_ENGINE = 2;

    private String name;

    public Airbus(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printModel() {
        System.out.println("Модель самолёта: " + name);
    }

    public void printCountEngine() {
        int otherCountEngine = COUNT_ENGINE + 2;
        String answer = (getName().equals("A380")) ? "Количество двигателей равно: " + otherCountEngine
               : "Количество двигателей равно: " + COUNT_ENGINE;
       System.out.println(answer);
    }

    @Override
    public String toString() {
        return "Airbus{"
                + "name" + name + '\''
                + '}';
    }
}
