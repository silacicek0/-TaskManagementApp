
package taskmanagementapp; 
import java.time.LocalDate;
import java.util.Scanner;

public class TaskManagementApp {

    public static void main(String[] args) {
        TaskManagement manager = new TaskManagement();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n========== TASK MANAGEMENT SYSTEM ==========");
            System.out.println("1. Add Task");
            System.out.println("2. Delete Task");
            System.out.println("3. Edit / Update Task");
            System.out.println("4. Show All Tasks");
            System.out.println("5. Filter Tasks by Status");
            System.out.println("0. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("\nSelect Task Type:");
                    System.out.println("1. School Task");
                    System.out.println("2. Work Task");
                    System.out.println("3. Home Task");
                    System.out.println("4. General Task");
                    System.out.print("Choice: ");
                    int typeChoice = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Title: ");
                    String title = scanner.nextLine();

                    System.out.print("Description: ");
                    String description = scanner.nextLine();

                    System.out.println("Deadline:");
                    System.out.print("  Day (1-31): ");
                    int day = scanner.nextInt();
                    System.out.print("  Month (1-12): ");
                    int month = scanner.nextInt();
                    System.out.print("  Year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();

                    LocalDate deadline = LocalDate.of(year, month, day);

                    System.out.println("Priority: 1. LOW | 2. MEDIUM | 3. HIGH");
                    System.out.print("Select Priority: ");
                    int pChoice = scanner.nextInt();
                    scanner.nextLine();

                    Priority priority = Priority.MEDIUM;
                    if (pChoice == 1) priority = Priority.LOW;
                    else if (pChoice == 3) priority = Priority.HIGH;

                    Task newTask;

                    if (typeChoice == 1) {
                        System.out.print("Course Name: ");
                        String courseName = scanner.nextLine();
                        newTask = new SchoolTask(title, description, deadline, priority, courseName);
                    } else if (typeChoice == 2) {
                        System.out.print("Project Name: ");
                        String projectName = scanner.nextLine();
                        System.out.print("Department: ");
                        String department = scanner.nextLine();
                        newTask = new WorkTask(title, description, deadline, priority, projectName, department);
                    } else if (typeChoice == 3) {
                        newTask = new HomeTask(title, description, deadline, priority);
                    } else {
                        newTask = new GeneralTask(title, description, deadline, priority);
                    }

                    manager.addTask(newTask);
                    System.out.println("Task added successfully!");
                    break;

                case 2:
                    System.out.println("\n--- CURRENT TASKS ---");
                    manager.showAllTask();
                    
                    System.out.print("\nEnter Task ID to delete: ");
                    int deleteId = scanner.nextInt();
                    manager.deleteTask(deleteId);
                    break;

                case 3:
                    System.out.println("\n--- CURRENT TASKS ---");
                    manager.showAllTask();

                    System.out.print("\nEnter Task ID to edit: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();

                    Task taskToEdit = manager.findTaskById(updateId);

                    if (taskToEdit != null) {
                        System.out.println("\nWhat would you like to update?");
                        System.out.println("1. Title");
                        System.out.println("2. Description");
                        System.out.println("3. Deadline");
                        System.out.println("4. Status");
                        System.out.println("5. Priority");
                        System.out.print("Choice: ");
                        int editChoice = scanner.nextInt();
                        scanner.nextLine();

                        switch (editChoice) {
                            case 1:
                                System.out.print("Enter new title: ");
                                taskToEdit.setTitle(scanner.nextLine());
                                System.out.println("Title updated successfully!");
                                break;

                            case 2:
                                System.out.print("Enter new description: ");
                                taskToEdit.setDescription(scanner.nextLine());
                                System.out.println("Description updated successfully!");
                                break;

                            case 3:
                                System.out.println("Enter new deadline:");
                                System.out.print("  Day (1-31): ");
                                int newDay = scanner.nextInt();
                                System.out.print("  Month (1-12): ");
                                int newMonth = scanner.nextInt();
                                System.out.print("  Year: ");
                                int newYear = scanner.nextInt();
                                scanner.nextLine();
                                taskToEdit.setDeadline(LocalDate.of(newYear, newMonth, newDay));
                                System.out.println("Deadline updated successfully!");
                                break;

                            case 4:
                                System.out.println("Select Status: 1. TODO | 2. IN_PROGRESS | 3. DONE");
                                System.out.print("Choice: ");
                                int sc = scanner.nextInt();
                                scanner.nextLine();
                                Status ns = (sc == 2) ? Status.IN_PROGRESS : (sc == 3 ? Status.DONE : Status.TODO);
                                taskToEdit.setStatus(ns);
                                System.out.println("Status updated successfully!");
                                break;

                            case 5:
                                System.out.println("Select Priority: 1. LOW | 2. MEDIUM | 3. HIGH");
                                System.out.print("Choice: ");
                                int pc = scanner.nextInt();
                                scanner.nextLine();
                                Priority np = (pc == 1) ? Priority.LOW : (pc == 3 ? Priority.HIGH : Priority.MEDIUM);
                                taskToEdit.setPriority(np);
                                System.out.println("Priority updated successfully!");
                                break;

                            default:
                                System.out.println("Invalid edit option!");
                        }
                    } else {
                        System.out.println("Task with ID " + updateId + " not found.");
                    }
                    break;

                case 4:
                    System.out.println("\n--- ALL TASKS ---");
                    manager.showAllTask();
                    break;

                case 5:
                    System.out.println("Filter Status: 1. TODO | 2. IN_PROGRESS | 3. DONE");
                    System.out.print("Choice: ");
                    int fChoice = scanner.nextInt();

                    Status filterStatus = Status.TODO;
                    if (fChoice == 2) filterStatus = Status.IN_PROGRESS;
                    else if (fChoice == 3) filterStatus = Status.DONE;

                    System.out.println("\n--- FILTERED TASKS ---");
                    manager.filterByStatus(filterStatus);
                    break;

                case 0:
                    System.out.println("Exiting the application. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }
}
