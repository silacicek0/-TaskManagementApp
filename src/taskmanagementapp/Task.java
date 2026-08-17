 
package taskmanagementapp;
import java.time.LocalDate;
public class Task {
    
    private int id;
    private static int idCounter = 1;
    private String title;
    private String description;
    private LocalDate deadline;   
    private Status status;
    private Priority priority;
    
    public Task(String title, String description, LocalDate deadline, Priority priority){
        this.id = idCounter++;
        this.title = title;
        this.description = description;
        this.deadline = deadline;
        this.status = Status.TODO;
        this.priority = priority;
    }
    
    public int getId(){
        return this.id;
    }
    public String getTitle(){
        return this.title;
    }
    public String getDescription(){
        return this.description;
    }
    public LocalDate getDeadline(){
        return this.deadline;
    }
    public Status getStatus(){
        return this.status;
    }
    public Priority getPriority(){
        return this.priority;
    }
    
    public void setStatus(Status status) {
        this.status = status;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }
    
    public void setPriority(Priority priority) {
        this.priority = priority;
    }
    
    @Override
    public String toString() {
        return "[" + id + "] " + title + 
               " | Status: " + status + 
               " | Priority: " + priority + 
               " | Deadline: " + deadline + 
               "\n    Description: " + description;
    }
    
}
