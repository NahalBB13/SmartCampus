package ir.ac.kntu;

import java.util.ArrayList;

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
}
