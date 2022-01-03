package ir.ac.kntu;

import java.util.ArrayList;

public class PrimitiveInitializer {
    public static Management managementInitializer(){
        ArrayList<Admin> adminsList = new ArrayList<>();
        ArrayList<Student> studentList = new ArrayList<>();
        ArrayList<Professor> professorList = new ArrayList<>();
        ArrayList<Course> courseList = new ArrayList<>();
        ArrayList<Course> passedCourses = new ArrayList<>();
        ArrayList<Course> prerequisites = new ArrayList<>();

        Course course1 = new Course("Data Structure");
        Course course2 = new Course("Computer Structure");
        Course course3 = new Course("math");
        Course course4 = new Course("AP");

        courseList.add(course1);
        courseList.add(course4);
        passedCourses.add(course2);
        prerequisites.add(course3);


        adminsList.add(new Admin("NBB","nahal"));
        studentList.add(new Student("HBB","9922823"));
        professorList.add(new Professor("SBB","100200"));


        AdminManager adminManager = new AdminManager(adminsList);
        StudentManager studentManager = new StudentManager(studentList);
        ProfessorManager professorManager = new ProfessorManager(professorList);
        CourseManager courseManager= new CourseManager(courseList, studentList, professorList);
        Restaurant restaurantManager = new Restaurant();

        adminManager.setAdminList(adminsList);
        studentManager.setStudentList(studentList);
        professorManager.setProfessorList(professorList);
        courseManager.setCourseList(courseList);


        return new Management(adminManager, studentManager, professorManager, courseManager, restaurantManager);
    }
}
