package ir.ac.kntu;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String studentFullName;
    private String studentNumber;
    private String studentPass;
    private ArrayList<Course> selectedCourseList;
    private HashMap<Course, Double> passedCourses;

    public Student(String studentFullName, String studentNumber, String studentPass,
                   ArrayList<Course> selectedCourseList, HashMap<Course, Double> passedCourses){
        this.studentFullName = studentFullName;
        this.studentNumber = studentNumber;
        this.studentPass = studentPass;
        this.selectedCourseList = selectedCourseList;
        this.passedCourses = passedCourses;
    }

    public String getStudentFullName() {
        return studentFullName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getStudentPass() {
        return studentPass;
    }

    public void setStudentFullName(String studentFullName) {
        this.studentFullName = studentFullName;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setStudentPass(String studentPass) {
        this.studentPass = studentPass;
    }

    public ArrayList<Course> getSelectedCourseList() {
        return selectedCourseList;
    }

    public void setSelectedCourseList(ArrayList<Course> selectedCourseList) {
        this.selectedCourseList = selectedCourseList;
    }

    public HashMap<Course, Double> getPassedCourses() {
        return passedCourses;
    }

    public void setPassedCourses(HashMap<Course, Double> passedCourses) {
        this.passedCourses = passedCourses;
    }

    public boolean courseAdmissibility(ArrayList<Course> selectedCourseList){
        return selectedCourseList.size() != 20;
    }

    public void weeklyStudentSchedule(ArrayList<Course> selectedCourseList){
        System.out.println("Your Classes on Saturday");
        sortCourseByDay(selectedCourseList, "Saturday");

        System.out.println("Your Classes on Sunday");
        sortCourseByDay(selectedCourseList, "Sunday");

        System.out.println("Your Classes on Monday tuesday wednesday");
        sortCourseByDay(selectedCourseList, "Tuesday");

        System.out.println("Your Classes on Wednesday");
        sortCourseByDay(selectedCourseList, "Wednesday");
    }

    public void sortCourseByDay(ArrayList<Course> selectedCourseList, String selectedDay){
        for (Course aCourse : selectedCourseList) {
            if(aCourse.getPresentationDay().equals(selectedDay)){
                System.out.println(aCourse.getCourseName());
            }
        }
    }

    public void showPassedCourses(HashMap<String, Double> passedCourses){
        System.out.println("your courses: \n" + passedCourses.toString());
        System.out.println("Your Average score: " + getAverageScore());
    }

    public double getAverageScore(){
        double sum = 0;
        int length = passedCourses.size();

        for(double i = 0; i < length; i++){
            sum = sum + passedCourses.get(i);
        }
        return sum/length;
    }
}
