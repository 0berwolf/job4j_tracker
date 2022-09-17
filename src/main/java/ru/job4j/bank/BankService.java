package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if ((null != user) && !(users.get(user).contains(account))) {
            users.get(user).add(account);
        }
    }

    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
            if (user != null) {
                for (Account account : users.get(user)) {
                    if (account.getRequisite().equals(requisite)) {
                        return account;
                    }
                }
            }
            return null;
        }

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