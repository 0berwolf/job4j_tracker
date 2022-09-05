package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class NotifyAccountTest {

    @Test
    void whenTwoAccountsAddSent() {
        NotifyAccount notifyAccount = new NotifyAccount();
        List<Account> accounts = Arrays.asList(
                new Account("123", "Andrei Golub", "esR8922Qwm"),
                new Account("999", "Andrei Golub", "8888888883"));
        HashSet<Account> expect = new HashSet<>(Arrays.asList(
                new Account("123", "Andrei Golub", "esR8922Qwm"),
                new Account("999", "Andrei Golub", "8888888883")));
        assertThat(notifyAccount.sent(accounts)).containsAll(expect);
    }

    @Test
    void whenDuplicateAccountsAddSent() {
        NotifyAccount notifyAccount = new NotifyAccount();
        List<Account> accounts = Arrays.asList(
                new Account("123", "Andrei Golub", "esR8922Qwm"),
                new Account("999", "Andrei Golub", "8888888883"),
                new Account("999", "Andrei Golub", "8888888883"));
        HashSet<Account> expect = new HashSet<>(Arrays.asList(
                new Account("123", "Andrei Golub", "esR8922Qwm"),
                new Account("999", "Andrei Golub", "8888888883")));
        assertThat(notifyAccount.sent(accounts)).containsAll(expect);
    }
}