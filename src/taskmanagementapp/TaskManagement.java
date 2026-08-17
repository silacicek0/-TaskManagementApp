
package taskmanagementapp;
import java.util.*;
public class TaskManagement {
    private List<Task> tasks = new ArrayList<>();
    
    public void addTask(Task task){
        tasks.add(task);
    }
    
    public void deleteTask(int id) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == id) {
                tasks.remove(i);
                System.out.println("Task deleted successfully.");
                return;
            }
        }
        System.out.println("Task with ID " + id + " not found.");
    }
    
    public void filterByStatus(Status status) {
        boolean found = false;
        for (Task task : tasks) {
            if (task.getStatus() == status) {
                System.out.println(task);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No tasks found with status: " + status);
        }
    }
    
    public void showAllTask() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found.");
            return;
        }
        for (Task task : tasks) {
            System.out.println(task);
        }
    }
    
    public Task findTaskById(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }
    
    public void updateTaskStatus(int id, Status newStatus) {
        Task task = findTaskById(id);
        if (task != null) {
            task.setStatus(newStatus);
            System.out.println("Task status updated successfully.");
        } else {
            System.out.println("Task with ID " + id + " not found.");
        }
    }
    
    public boolean hasTasks() {
        return !tasks.isEmpty();
    }
}
