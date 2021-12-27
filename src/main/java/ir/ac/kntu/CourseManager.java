package ir.ac.kntu;

import java.util.ArrayList;
import java.util.Objects;

public class CourseManager {
    private ArrayList<Course> courseList;
    private ArrayList<Student> studentList;
    private ArrayList<Professor> professorList;

    private Course searchForCourse(String courseName){
        for(Course aCourse : courseList){
            if(aCourse.getCourseName().equals(courseName)){
                return aCourse;
            }
        }
        return null;
    }

    private Professor searchForProfessor(String professorName){
        for(Professor aProfessor : professorList){
            if(aProfessor.getProfessorName().equals(professorName)){
                return aProfessor;
            }
        }
        return null;
    }

    private Student searchForStudent(String studentName){
        for(Student aStudent : studentList){
            if(aStudent.getStudentFullName().equals(studentName)){
                return aStudent;
            }
        }
        return null;
    }

    private ArrayList<Course> searchForPrerequisites(String courseName){
        if(searchForCourse(courseName) != null){
            return Objects.requireNonNull(searchForCourse(courseName)).getPrerequisites();
        }
        return null;
    }

    private ArrayList<Student> addStudentToCourses(){
        System.out.println("Enter Student names you wish to add (Type EXIT when finished)");
        String studentName = ScannerWrapper.getInstance().next();
        ArrayList<Student> studentList = new ArrayList<>();
        while(searchForStudent(studentName) != null || studentName.equals("EXIT")){
            studentList.add(searchForStudent(studentName));
            System.out.println("Student "+ studentName + "was added to list");
            System.out.println("add Student names you wish to add (Type EXIT when finished)");
            studentName = ScannerWrapper.getInstance().next();
        }
        return studentList;
    }

    private ArrayList<Course> addCoursePrerequisites(){
        System.out.println("Enter course Name you wish to add");
        String courseName = ScannerWrapper.getInstance().next();
        ArrayList<Course> prerequisitesList = new ArrayList<>();
        if(searchForPrerequisites(courseName) != null){
            return searchForPrerequisites(courseName);
        } else{
            while(searchForCourse(courseName) != null || courseName.equals("EXIT")){
                prerequisitesList.add(searchForCourse(courseName));
                System.out.println("Course " + courseName + " was added as a prerequisite to this course");
                System.out.println("add course names you wish to add (Type EXIT when finished)");
                courseName = ScannerWrapper.getInstance().next();
            }
        }
        return prerequisitesList;
    }

    public void addCourse(ArrayList<Course> courseList){
        System.out.println("Enter course Name");
        String courseName = ScannerWrapper.getInstance().next();
        if(searchForCourse(courseName) != null){
            System.out.println("Enter Course number");
            String courseNumber = ScannerWrapper.getInstance().next();
            System.out.println("Enter course presentation day");
            String presentationDay = ScannerWrapper.getInstance().next();
            System.out.println("Enter Course presentation time (please follow this structure: startTime,finishTime)");
            String presentationTime = ScannerWrapper.getInstance().next();
            System.out.println("Enter professor name for this course");
            String professorName = ScannerWrapper.getInstance().next();
            Professor professor = searchForProfessor(professorName);
            System.out.println("Enter course Students");
            ArrayList<Student> studentList = addStudentToCourses();
            System.out.println("add course prerequisites");
            ArrayList<Course> prerequisitesList = addCoursePrerequisites();
            courseList.add(new Course(courseName, courseNumber, presentationDay, presentationTime, professor, studentList, prerequisitesList));
            System.out.println("Course " + courseName + " Was successfully added");
        }
    }
}
