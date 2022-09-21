package ru.job4j.collection;

import org.junit.jupiter.api.Test;
import java.util.Comparator;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class JobTest {
    @Test
    void whenNameAscending() {
        List<Job> rsl = Arrays.asList(
                new Job("Task", 1),
                new Job("Fix", 2),
                new Job("Bug", 3));
        rsl.sort(new JobByNameAscending());
        List<Job> expected = Arrays.asList(
                new Job("Bug", 3),
                new Job("Fix", 2),
                new Job("Task", 1));
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenNameDescending() {
        List<Job> rsl = Arrays.asList(
                new Job("Fix", 2),
                new Job("Task", 1),
                new Job("Bug", 3));
        rsl.sort(new JobByNameDescending());
        List<Job> expected = Arrays.asList(
                new Job("Task", 1),
                new Job("Fix", 2),
                new Job("Bug", 3));
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenPriorityAscending() {
        List<Job> rsl = Arrays.asList(
                new Job("Bug", 3),
                new Job("Fix", 2),
                new Job("Task", 1));
        rsl.sort(new JobByPriorityAscending());
        List<Job> expected = Arrays.asList(
                new Job("Task", 1),
                new Job("Fix", 2),
                new Job("Bug", 3));
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenPriorityDescending() {
        List<Job> rsl = Arrays.asList(
                new Job("Bug", 3),
                new Job("Fix", 2),
                new Job("Task", 1));
        rsl.sort(new JobByPriorityDescending());
        List<Job> expected = Arrays.asList(
                new Job("Bug", 3),
                new Job("Fix", 2),
                new Job("Task", 1));
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobByNameDescending().thenComparing(new JobByPriorityDescending());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    void whenComparatorByPriorityAndName() {
        Comparator<Job> cmpPriorityName = new JobByPriorityAscending().thenComparing(new JobByNameAscending());
        int rsl = cmpPriorityName.compare(
                new Job("Fix bug", 1),
                new Job("Impl task", 1));
        assertThat(rsl).isLessThan(0);
    }
}