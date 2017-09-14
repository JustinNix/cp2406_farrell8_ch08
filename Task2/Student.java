/**
 * Created by jc428352 on 15/09/17.
 */
public class Student {
    private int studentID;
    private String[] collegeCourses = new String[5];

    public int getStudentID() {
        return studentID;
    }

    public String[] getCollegeCourses() {
        return collegeCourses;
    }

    public void setCollegeCourses(String[] collegeCourses) {
        this.collegeCourses = collegeCourses;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    public String getSpecificCoure(int location){
        return collegeCourses[location];
    }
    public void setSpecificCourse(String course, int location){
        this.collegeCourses[location] = course;
    }
}
