package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {

    private LinkedList<Task> tasks = new LinkedList<>();

    public void put(Task task) {
        var index = 0;
        for (var element : tasks) {
            int elementPriority = element.getPriority();
            if (elementPriority <= task.getPriority()) {
                index++;
            } else {
                break;
            }
        }
        this.tasks.add(index, task);
    }

    public Task take() {
        return tasks.poll();
    }
}
