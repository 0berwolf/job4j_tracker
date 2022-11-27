package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void info() {
        System.out.println("Ошибка в системе: " + active);
        System.out.println("Статус ошибки: " + status);
        System.out.println("Сообщение об ошибке: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error(true, 404, "ошибка системы");
        error.info();
        Error secondError = new Error();
        secondError.info();
    }
}
