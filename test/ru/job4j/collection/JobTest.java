package ru.job4j.collection;

import org.junit.Test;
import java.util.Comparator;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenCompByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompAscByName() {
        Comparator<Job> cmpAscName = new JobAscByName();
        int rsl = cmpAscName.compare(
                new Job("A", 0),
                new Job("B", 1)
        );
        assertThat(rsl, equalTo(-1));
    }

    @Test
    public void whenCompDescByName() {
        Comparator<Job> cmpDescName = new JobDescByName();
        int rsl = cmpDescName.compare(
                new Job("A", 0),
                new Job("B", 1)
        );
        assertThat(rsl, equalTo(1));
    }

    @Test
    public void whenCompAscByPriority() {
        Comparator<Job> cmpAscPriority = new JobAscByPriority();
        int rsl = cmpAscPriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, equalTo(-1));
    }

    @Test
    public void whenCompDescByPriority() {
        Comparator<Job> cmpDescPriority = new JobDescByPriority();
        int rsl = cmpDescPriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, equalTo(1));
    }

    @Test
    public void whenCompByAscNameAscPriority() {
        Comparator<Job> cmpNamePriority = new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("A", 0),
                new Job("A", 1)
        );
        assertThat(rsl, equalTo(-1));
    }

    @Test
    public void whenCompByAscPriorityDescName() {
        Comparator<Job> cmpNamePriority = new JobAscByPriority().thenComparing(new JobDescByName());
        int rsl = cmpNamePriority.compare(
                new Job("Application work", 100),
                new Job("Burn processor", 100)
        );
        assertThat(rsl, equalTo(1));
    }

    @Test
    public void whenCompByDescPriorityAscName() {
        Comparator<Job> cmpNamePriority = new JobDescByPriority().thenComparing(new JobAscByName());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 1),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, equalTo(3));
    }
}