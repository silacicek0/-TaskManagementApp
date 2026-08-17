 
package taskmanagementapp;
import java.time.LocalDate;

public class GeneralTask extends Task{
    
    public GeneralTask(String title, String description, LocalDate deadline, Priority priority){
        super(title, description, deadline, priority);
    }
    
}
