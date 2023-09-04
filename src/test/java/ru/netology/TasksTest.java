package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TasksTest {
    @Test
    public void shouldFindQueryInMeetingTrue() {
        Task meeting = new Meeting(9, "Поиск нового платья", "Планировщик задач", "В среду в 11:00");

        boolean expected = false;
        boolean actual = meeting.matches(" В ");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindQueryInMeetingFalse() {
        Task meeting = new Meeting(9, "Поиск нового платья", "Планировщик задач", "В среду в 11:00");

        boolean expected = false;
        boolean actual = meeting.matches("среду");

        Assertions.assertEquals(expected, actual);
    }
}
