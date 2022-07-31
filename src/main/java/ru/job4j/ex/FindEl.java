package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i] == key) {
                throw new ElementNotFoundException("not found element");
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] value = {"grand", "cake", "max", "bull"};
        try {
            indexOf("cake", "text comeback");
        } catch (ElementNotFoundException k) {
            k.printStackTrace();
        }
    }
}
