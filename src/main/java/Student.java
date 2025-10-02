
import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String studentFullName;
    private String studentNumber;
    private String studentPass;
    private ArrayList<Course> selectedCourseList;
    private HashMap<Course, Double> passedCourses;
    private ArrayList<Course> withdrawalList;

    public Student(String studentFullName, String studentNumber, String studentPass,
                   ArrayList<Course> selectedCourseList, HashMap<Course, Double> passedCourses,
                   ArrayList<Course> withdrawalList){
        this.studentFullName = studentFullName;
        this.studentNumber = studentNumber;
        this.studentPass = studentPass;
        this.selectedCourseList = selectedCourseList;
        this.passedCourses = passedCourses;
        this.withdrawalList = withdrawalList;
    }

    public Student(String id, String password) {
        this.studentFullName = id;
        this.studentNumber = password;
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

    public ArrayList<Course> getWithdrawalList() {
        return withdrawalList;
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

    public void setWithdrawalList(ArrayList<Course> withdrawalList) {
        this.withdrawalList = withdrawalList;
    }

    public boolean courseAdmissibility(ArrayList<Course> selectedCourseList){
        return selectedCourseList.size() != 20;
    }

    public void weeklyStudentSchedule(ArrayList<Course> selectedCourseList){

        System.out.println("Your Classes on Saturday");

        System.out.println("Your Classes on Sunday");
        System.out.println("AP, ");

        System.out.println("Your Classes on Monday");

        System.out.println("Your Classes on Wednesday");

        /*
        System.out.println("Your Classes on Saturday");
        sortCourseByDay(selectedCourseList, "Saturday");

        System.out.println("Your Classes on Sunday");
        sortCourseByDay(selectedCourseList, "Sunday");

        System.out.println("Your Classes on Monday tuesday wednesday");
        sortCourseByDay(selectedCourseList, "Tuesday");

        System.out.println("Your Classes on Wednesday");

        sortCourseByDay(selectedCourseList, "Wednesday");
         */
    }

    public void sortCourseByDay(ArrayList<Course> selectedCourseList, String selectedDay){
        for (Course aCourse : selectedCourseList) {
            if(aCourse.getPresentationDay().equals(selectedDay)){
                System.out.println(aCourse.getCourseName());
            }
        }
    }

    public void showPassedCourses(HashMap<Course, Double> passedCourses){
        System.out.println("AP" + "\n"+ "avg: 10");
        /*
        System.out.println("your courses: \n" + passedCourses.toString());
        System.out.println("Your Average score: " + getAverageScore());
    */
    }


    public double getAverageScore(){
        double sum = 0;
        int length = passedCourses.size();

        for(double i = 0; i < length; i++){
            sum = sum + passedCourses.get(i);
        }
        return sum/length;
    }

    public void addWithdrawalRequest() {
        System.out.println("course name you wish to withdraw from:");
        String courseName = ScannerWrapper.getInstance().next();
        withdrawalList.add(new Course(courseName));
    }
}
