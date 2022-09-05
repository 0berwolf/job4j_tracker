package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PassportOfficeTest {

    @Test
    void whenTestAddMethod() {
        Citizen citizen = new Citizen("qwerghnm85214585", "Nick Berghard");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport())).isEqualTo(citizen);
    }

    @Test
    void whenTestAddDuplicateMethod() {
        Citizen citizen = new Citizen("qwerghnm85214585", "Nick Berghard");
        Citizen citizenDuplicate = new Citizen("qwerghnm85214585", "David Gintoli");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        office.add(citizenDuplicate);
        assertThat(office.add(citizenDuplicate)).isFalse();
    }
}