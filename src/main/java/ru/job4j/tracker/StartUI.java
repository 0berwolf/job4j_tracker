package ru.job4j.tracker;

import java.util.List;

public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public void init(Input input, Tracker tracker, List<UserAction> userActions) {
        boolean run = true;
        while (run) {
            this.showMenu(userActions);
            int select = input.askInt("Select:");
            if (select < 0 || select >= userActions.size()) {
                out.println("Wrong input, you can select: 0 .. " + (userActions.size() - 1));
                continue;
            }
            UserAction action = userActions.get(select);
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(List<UserAction> userActions) {
        out.println("Menu:");
        for (int index = 0; index < userActions.size(); index++) {
           out.println(index + ". " + userActions.get(index).name());
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ValidateInput(output, new ConsoleInput());
        Tracker tracker = new Tracker();
        List<UserAction> userActions = List.of(
                new CreateAction(output), new ShowItemsAction(output),
                new ReplaceAction(output),
                new DeleteAction(output), new FindAction(output),
                new FindNameAction(output), new ExitAction(output));
        new StartUI(output).init(input, tracker, userActions);
    }
}

