 
package taskmanagementapp;
 
import java.time.LocalDate;

public class WorkTask extends Task{
    private String projectName;
    private String department;
    
    public WorkTask(String title, String description, LocalDate deadline, Priority priority, String projectName, String department){
        super(title, description, deadline, priority);
        this.projectName = projectName;
        this.department = department;
    }
    
    public String getProjectName(){
        return this.projectName;
    }
    
    public String getDepartment(){
        return this.department;
    }
    
    public void setProjectName(String projectName){
        this.projectName = projectName;
    }
    
    public void setDepartment(String department){
        this.department = department;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\n    Project: " + projectName + " | Dept: " + department;
    }
}
