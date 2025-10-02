
public class Admin {
    private final String id;
    private final String password;

    public Admin(String id, String password){
        this.id = id;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    // todo what if there are a lot of students would like to withdrawal? how to handle this?

    public void withdrawalApproval(Student student, Course course){
        if(student.getAverageScore() > 17){
            student.getSelectedCourseList().remove(course);
            System.out.println("course " +  course.getCourseName() + " was removed");
        } else{
            System.out.println("course cannot be removed");
        }
    }
}
