package ru.job4j.search;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

class PhoneDictionaryTest {

    @Test
    void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Andrew", "Golub", "336703891", "Gomel"));
        ArrayList<Person> persons = phones.find("Andrew");
        assertThat(persons.get(0).getSurname()).isEqualTo("Golub");
    }

    @Test
    void whenNotFound() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Andrew", "Golub", "336703891", "Gomel"));
        ArrayList<Person> persons = phones.find("Ivan");
        assertThat(persons.isEmpty());
    }
}