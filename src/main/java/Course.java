
import java.util.ArrayList;

public class Course {
    private String courseName;
    private String courseNumber;
    private String presentationDay;
    private String presentationTime;
    private Professor courseProfessor;
    private ArrayList<Student> courseStudentList;
    private ArrayList<Course> prerequisites;

    //todo a function to declare prerequisites of courses with the same name in the courseManagement class

    public Course(String courseName, String courseNumber, String presentationDay, String presentationTime,
                  Professor courseProfessor, ArrayList<Student> courseStudentList, ArrayList<Course> prerequisites){
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.presentationDay = presentationDay;
        this.presentationTime = presentationTime;
        this.courseProfessor = courseProfessor;
        this.courseStudentList = courseStudentList;
        this.prerequisites = prerequisites;
    }

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public String getPresentationDay() {
        return presentationDay;
    }

    public String getPresentationTime() {
        return presentationTime;
    }

    public ArrayList<Student> getCourseStudentList() {
        return courseStudentList;
    }

    public ArrayList<Course> getPrerequisites() {
        return prerequisites;
    }

    public Professor getCourseProfessor() {
        return courseProfessor;
    }

    public void setCourseProfessor(Professor courseProfessor) {
        this.courseProfessor = courseProfessor;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public void setPresentationDay(String presentationDay) {
        this.presentationDay = presentationDay;
    }

    public void setPresentationTime(String presentationTime) {
        this.presentationTime = presentationTime;
    }

    public void setCourseStudentList(ArrayList<Student> courseStudentList) {
        this.courseStudentList = courseStudentList;
    }

    public void setPrerequisites(ArrayList<Course> prerequisites) {
        this.prerequisites = prerequisites;
    }

    public boolean checkProfName(String professorName){
        return professorName.equals(courseProfessor.getProfessorName());
    }

}
