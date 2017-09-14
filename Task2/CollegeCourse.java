/**
 * Created by jc428352 on 15/09/17.
 */
public class CollegeCourse {
    private String courseID;
    private int creditHours;
    private String grade;

    public void CollegeCourse(){
        this.courseID = "Not specified";
        this.creditHours = 0;
        this.grade = "F";
    }

    public void CollegeCourse(String ID, int creditHours, String grade){
        this.courseID = ID;
        this.creditHours = creditHours;
        this.grade = grade;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public String getCourseID() {
        return courseID;
    }

    public String getGrade() {
        return grade;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
