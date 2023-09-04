package ru.netology;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Epic;
import ru.netology.Meeting;
import ru.netology.SimpleTask;
import ru.netology.Todos;

public class TodosTest {

    @Test
    public void shouldAddThreeTasksOfDifferentType() {
        SimpleTask simpleTask = new SimpleTask(1, "Иду на ногти");

        String[] subtasks = { "Крем", "Тушь", "Карандаш"};
        Epic epic = new Epic(5, subtasks);

        Meeting meeting = new Meeting(9, "Поиск нового платья", "Планировщик задач", "В среду в 11:00");

        Todos todos = new Todos();

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        Task[] expected = {simpleTask, epic, meeting};
        Task[] actual = todos.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchInTodos() {
        SimpleTask simpleTask = new SimpleTask(1, "Иду на ногти");

        String[] subtasks = { "Крем", "Тушь", "Карандаш"};
        Epic epic = new Epic(5, subtasks);

        Meeting meeting = new Meeting(9, "Поиск нового платья", "Планировщик задач", "В среду в 11:00");

        Todos todos = new Todos();

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        Task[] expected = {simpleTask, epic, meeting};
        Task[] actual = todos.search("");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchInMeetingSecond() {
        SimpleTask simpleTask = new SimpleTask(1, "Иду на ногти");

        String[] subtasks = { "Крем", "Тушь", "Карандаш"};
        Epic epic = new Epic(5, subtasks);

        Meeting meeting = new Meeting(9, "Поиск нового платья", "Планировщик задач", "В среду в 11:00");

        Todos todos = new Todos();

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        Task[] expected = {meeting};
        Task[] actual = todos.search(meeting.getProject());

        Assertions.assertArrayEquals(expected, actual);
    }
    }


