package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        Employee emp1 = new Employee("Saidazim", "Programmist");
        Employee emp2 = new Employee("Elbek", "Frontend programmist");
        Employee emp3 = new Employee("Yusuf", "Dizayner");
        Employee emp4 = new Employee("Durbek", "Neymari shogirti");


        taskManager.addEmployee(emp1);
        taskManager.addEmployee(emp2);
        taskManager.addEmployee(emp3);
        taskManager.addEmployee(emp4);

        Task task1 = new Task("Dasturing back endi", "Serverdagi hatolikni oldini olsh", LocalDate.of(2020, 8, 12));
        Task task2 = new Task("Dasturning front edi", "Front endga javaScriptda animatsiya qohish", LocalDate.of(2020, 8, 6));

        Task task3 = new Task("Dizayn logosi ", "Dastur uchun yangi logo yaratib berish", LocalDate.of(2024, 06, 10));
        Task task4 = new Task("Manager ", "Dasturchlarga vazifa bolib berih", LocalDate.of(2024, 06, 10));
        taskManager.addTask(task1);
        taskManager.addTask(task2);

        taskManager.addTask(task3);
        taskManager.addTask(task4);

        taskManager.assignTaskToEmployee(1, task1);
        taskManager.assignTaskToEmployee(2, task2);

        taskManager.assignTaskToEmployee(3, task3);
        taskManager.assignTaskToEmployee(4, task4);

        System.out.println("Srogi otkan tasklari:");
        taskManager.getOverdueTasks().forEach(System.out::println);

        System.out.println("\nBarcha Employelar:");
        taskManager.displayAllEmployees();

        System.out.println("\nRoli boyicha vaziasi");
        taskManager.countTasksByRole().forEach((role, count) ->
                System.out.println(role + ": " + count));
    }
}
