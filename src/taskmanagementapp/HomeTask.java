 
package taskmanagementapp;
 
import java.time.LocalDate;

public class HomeTask extends Task{
    
    public HomeTask(String title, String description, LocalDate deadline, Priority priority){
        super(title, description, deadline, priority);
    }
    
}
