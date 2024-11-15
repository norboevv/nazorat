package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class TaskManager {
    private List<Employee> employees;
    private List<Task> tasks;

    public TaskManager() {
        this.employees = new ArrayList<>();
        this.tasks = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void assignTaskToEmployee(int employeeId, Task task) {
        if (employeeId >= 0 && employeeId < employees.size()) {
            employees.get(employeeId).assignTask(task);
        } else {
            System.out.println("Xato employe idsi .");
        }
    }

    public List<Task> getOverdueTasks() {
        return tasks.stream()
                .filter(Task::isOverdue)
                .collect(Collectors.toList());
    }

    public void displayAllEmployees() {
        employees.forEach(Employee::displayInfo);
    }

    public Map<String, Long> countTasksByRole() {
        return employees.stream()
                .flatMap(e -> e.getPendingTasks().stream().map(task -> e.getRole()))
                .collect(Collectors.groupingBy(role -> role, Collectors.counting()));
    }
}
