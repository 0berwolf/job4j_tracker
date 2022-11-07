package ru.job4j.search;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PhoneDictionaryTest {

    @Test
    void whenFindByName() {
        var phones = new PhoneDictionary();
        phones.add(new Person("Andrew", "Golub", "336703891", "Gomel"));
        var persons = phones.find("Andrew");
        assertThat(persons.get(0).getSurname()).isEqualTo("Golub");
    }

    @Test
    void whenNotFound() {
        var phones = new PhoneDictionary();
        phones.add(new Person("Andrew", "Golub", "336703891", "Gomel"));
        var persons = phones.find("Ivan");
        assertThat(persons.isEmpty());
    }
}