 
package taskmanagementapp;
import java.time.LocalDate;

public class SchoolTask extends Task {
    
    private String courseName;
    
    public SchoolTask(String title, String description, LocalDate deadline, Priority priority, String courseName){
        super(title, description, deadline, priority);
        this.courseName = courseName;
    }
    
    public String getCourseName(){
        return this.courseName;
    }
    
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\n    Course: " + courseName;
    }
}
