package ir.ac.kntu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Professor {
    private String professorName;
    private String professorNumber;
    private String professorPass;
    private ArrayList<Course> professorCourseList;

    public Professor(String professorName, String professorNumber, String professorPass, ArrayList<Course> professorCourseList) {
        this.professorName = professorName;
        this.professorNumber = professorNumber;
        this.professorPass = professorPass;
        this.professorCourseList = professorCourseList;
    }

    public Professor(String id, String password) {
        this.professorName = id;
        this.professorNumber = password;
    }

    public String getProfessorName() {
        return professorName;
    }

    public String getProfessorNumber() {
        return professorNumber;
    }

    public String getProfessorPass() {
        return professorPass;
    }

    public ArrayList<Course> getProfessorCourseList() {
        return professorCourseList;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public void setProfessorNumber(String professorNumber) {
        this.professorNumber = professorNumber;
    }

    public void setProfessorPass(String professorPass) {
        this.professorPass = professorPass;
    }

    public void setProfessorCourseList(ArrayList<Course> professorCourseList) {
        this.professorCourseList = professorCourseList;
    }

    public void weeklyProfessorSchedule(ArrayList<Course> professorCourseList){
        System.out.println("Your Classes on Saturday");
        sortCourseByDay(professorCourseList, "Saturday");

        System.out.println("Your Classes on Sunday");
        sortCourseByDay(professorCourseList, "Sunday");

        System.out.println("Your Classes on Monday tuesday wednesday");
        sortCourseByDay(professorCourseList, "Tuesday");

        System.out.println("Your Classes on Wednesday");
        sortCourseByDay(professorCourseList, "Wednesday");
    }

    private void sortCourseByDay(ArrayList<Course> professorCourseList, String selectedDay){
        for (Course aCourse : professorCourseList) {
            if(aCourse.getPresentationDay().equals(selectedDay)){
                System.out.println(aCourse.getCourseName());
            }
        }
    }

    public void setStudentScore(ArrayList<Course> professorCourseList){
        System.out.println("Enter Student Name");
        String studentName  = ScannerWrapper.getInstance().next();
        System.out.println("Enter Course Name");
        String courseName = ScannerWrapper.getInstance().next();
        System.out.println("Enter score");
        double score = Double.parseDouble(ScannerWrapper.getInstance().next());
        for(Course aCourse : professorCourseList){
            if(courseName.equals(aCourse.getCourseName())){
                setScore(Objects.requireNonNull(searchForStudent(aCourse, studentName)).getPassedCourses(), aCourse.getCourseName(), score);
            }
        }
    }

    private void setScore(HashMap<Course, Double> passedCourses, String courseName, double score) {
        for (Course aCourse : passedCourses.keySet()) {
            if(aCourse.getCourseName().equals(courseName)){
                passedCourses.remove(aCourse);
                passedCourses.put(aCourse, score);
            }
        }
    }

    private Student searchForStudent(Course aCourse, String studentName) {
        for (Student aStudent : aCourse.getCourseStudentList()) {
            if(aStudent.getStudentFullName().equals(studentName)){
                return aStudent;
            }
        }
        return null;
    }

    public void viewStudents() {
        for (Course course:getProfessorCourseList()) {
            System.out.println(course + " = " + course.getCourseStudentList() + "\n");
        }
    }
}
