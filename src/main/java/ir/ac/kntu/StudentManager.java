package ir.ac.kntu;

import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> studentList;

    public StudentManager(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public Student studentChecker(Student student) {
        for (Student aStudent : studentList) {
            if(aStudent.getStudentFullName().equals(student.getStudentFullName()) && aStudent.getStudentNumber().equals(student.getStudentNumber())){
                return aStudent;
            }
        }
        return null;
    }

    public Student viewWithdrawals() {
        System.out.println("Enter student name");
        String studentName = ScannerWrapper.getInstance().next();
        System.out.println("Enter Student number");
        String studentNumber = ScannerWrapper.getInstance().next();
        return new Student(studentName, studentNumber);
    }

    public Student searchForStudent(String studentName){
        for (Student student : studentList) {
            if(student.getStudentFullName().equals(studentName)){
                return student;
            }
        }
        return null;
    }

    public void changeStudentName() {
        System.out.println("Enter student name");
        String name = ScannerWrapper.getInstance().next();
        if(searchForStudent(name) != null){
            System.out.println("Enter student's new name");
            String newName = ScannerWrapper.getInstance().next();
            searchForStudent(name).setStudentFullName(newName);
            System.out.println("Changes were successfully made");
        }
    }

    public void changeStudentNumber() {
        System.out.println("Enter student name");
        String name = ScannerWrapper.getInstance().next();
        if(searchForStudent(name) != null){
            System.out.println("Enter student's new number");
            String number = ScannerWrapper.getInstance().next();
            searchForStudent(name).setStudentNumber(number);
            System.out.println("Changes were successfully made");
        }
    }
}
