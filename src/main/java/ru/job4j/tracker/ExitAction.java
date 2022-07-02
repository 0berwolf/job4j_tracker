package ru.job4j.tracker;

public class ExitAction implements UserAction {

    @Override
    public String name() {
        return "Exit";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            int select = input.askInt("Select: ");
            if (select != 5) {
                System.out.println("Пользователь выбрал: " + select);
            } else {
                run = false;
            }
        }
        return run;
    }
}

