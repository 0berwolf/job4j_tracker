package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает принцип банковских переводов.
 * Для работы используются аккаунт пользователя и паспортные данные.
 * @author ANDREI GOLUB
 * @version 1.0
 */

public class BankService {

    /**
     * Поле содержит пользователя или пользователей с их счетами.
     * Вся информация хранится в коллекции HashMap.
     */

    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод принимает пользователя на вход,
     * и создаёт нового пользователя.
     * @param user пользователь добавляется в систему.
     */

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод создаёт новый аккаунт для пользователя
     * и проверяет есть ли у пользователя уже аккаунт.
     *
     * @param passport добавляются данные паспорта пользователя.
     * @param account добавляется аккаунт с необходимыми данными (создаётся счёт для пользователя).
     */

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if ((null != user) && !(users.get(user).contains(account))) {
            users.get(user).add(account);
        }
    }

    /**
     * Метод производит поиск пользователя по паспорту.
     * @param passport используются данные паспорта.
     * @return возвращает пользователя если пользователь с данными паспорта уже существует в системе
     * или возвращает null если пользователя с данными паспорта ещё нет в системе.
     */

    public User findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(u -> u.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    /**
     * Метод производит поиск пользователя по реквизитам (аккаунту).
     * @param passport используются данные паспорта пользователя.
     * @param requisite используются реквизиты (аккаунт) пользователя.
     * @return возвращает реквизиты пользователя если они есть в системе
     * или возвращает null если реквизитов пользователя в системе нет
     */

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
            if (user != null) {
                return users.get(user)
                        .stream()
                        .filter(u -> u.getRequisite().equals(requisite))
                        .findFirst()
                        .orElse(null);
            }
            return null;
    }

    /**
     * Метод использует перевод денег с одного аккаунта на другой
     * @param srcPassport Данные паспорта пользователя с аккаунта которого будет производиться перевод.
     * @param srcRequisite Реквизиты (аккаунт) пользователя с которого деньги будут переводиться.
     * @param destPassport Данные паспорта пользователя на аккаунт которого будет производиться перевод.
     * @param destRequisite Реквизиты (аккаунт) пользователя на который деньги будут переводиться.
     * @param amount Вводится необходимая сумма для перевода.
     * @return Возвращается true или false в зависимости выполнены ли все условия для перевода денег.
     */

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                    String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
            Account srcAccount = findByRequisite(srcPassport, srcRequisite);
            Account dstAccount = findByRequisite(destPassport, destRequisite);
            if (srcAccount != null && dstAccount != null && srcAccount.getBalance() >= amount) {
                srcAccount.setBalance(srcAccount.getBalance() - amount);
                dstAccount.setBalance(dstAccount.getBalance() + amount);
                rsl = true;
            }
            return rsl;
    }

    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
