package ru.job4j.tracker;

public class SingleTracker {

    private static SingleTracker instance = null;

    private SingleTracker() {
    }

    public static SingleTracker getInstance() {
        if (instance == null) {
            instance = new SingleTracker();
        }
        return instance;
    }

    private Tracker tracker = new Tracker();

    public Item add(Item item) {
        return tracker.add(item);
    }

    public Item showAllItems() {
        return null;
    }

    public Item replace() {
        return null;
    }

    public Item findById() {
        return null;
    }

    public Item findByName(String name) {
        return null;
    }

    public Item delete() {
        return null;
    }

    public Item exit() {
        return null;
    }

    public static void main(String[] args) {
        SingleTracker singleTracker = SingleTracker.getInstance();
        singleTracker.add(new Item());
        singleTracker.showAllItems();
        singleTracker.replace();
        singleTracker.findById();
        singleTracker.findByName(" ");
        singleTracker.delete();
        singleTracker.exit();
    }
}
