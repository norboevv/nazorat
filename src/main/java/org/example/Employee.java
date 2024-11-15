package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
    private String name;
    private String role;
    private List<Task> tasks;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
        this.tasks = new ArrayList<>();
    }

    public void assignTask(Task task) {
        tasks.add(task);
    }

    public List<Task> getPendingTasks() {
        return tasks.stream()
                .filter(task -> !task.isCompleted())
                .collect(Collectors.toList());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public void displayInfo() {
        System.out.println("Ismi: " + name);
        System.out.println("Roli: " + role);
        System.out.println("Vaziasi:");
        tasks.forEach(System.out::println);


    }
}
