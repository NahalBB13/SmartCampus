package ir.ac.kntu;

public class Management {

    private final AdminManager adminManager;
    private final StudentManager studentManager;
    private final ProfessorManager professorManager;
    private final CourseManager courseManager;
    private final Restaurant restaurantManager;

    public Management(AdminManager adminManager, StudentManager studentManager, ProfessorManager professorManager, CourseManager courseManager, Restaurant restaurantManager) {
        this.adminManager = adminManager;
        this.studentManager = studentManager;
        this.professorManager = professorManager;
        this.courseManager = courseManager;
        this.restaurantManager = restaurantManager;
    }

    public void handler() {
        int initialOption;
        do {
            Menu.initialMenu();
            initialOption = Menu.getOption();
            switch (initialOption) {
                case 1:
                    loginHandler();
                    break;
                case 2:
                    System.exit(0);
                    break;
                default:
                    if (initialOption != 3) {
                        System.out.println("Invalid Choice!");
                    }
                    break;
            }
        } while (initialOption != 3);
        System.exit(0);
    }

    private void loginHandler() {
        System.out.println("Enter ID: ");
        String id = ScannerWrapper.getInstance().next();
        System.out.println("Enter Password: ");
        String password = ScannerWrapper.getInstance().next();
        Admin admin = new Admin(id, password);
        Student student = new Student(id, password);
        Professor professor = new Professor(id, password);
        if (adminManager.adminChecker(admin) != null) {
            adminHandler(admin);
        } else if (studentManager.studentChecker(student) != null) {
            studentHandler(student);
        } else if (professorManager.professorChecker(professor) != null) {
            professorHandler(professor);
        } else {
            System.out.println("Invalid Login");
            handler();
        }
    }

    private void adminHandler(Admin admin) {
        int adminOption;
        do {
            Menu.adminMenu();
            adminOption = Menu.getOption();
            switch (adminOption) {
                case 1:
                    adjustStudents();
                    break;
                case 2:
                    adjustProfessors();
                    break;
                case 3:
                    adjustCourses();
                    break;
                case 4:
                    courseManager.getCourseList().toString();
                    break;
                case 5:
                    admin.withdrawalApproval(studentManager.viewWithdrawals(), courseManager.viewWithdrawals());
                    break;
                default:
                    if (adminOption != 6) {
                        System.out.println("Invalid Choice!");
                    }
                    break;
            }
        } while (adminOption != 6);
    }

    private void adjustProfessors() {
        int professorOption;
        do {
            Menu.personnelAdjustments("Professor");
            professorOption = Menu.getOption();
            switch (professorOption){
                case 1:
                    professorManager.changeProfessorName();
                    break;
                case 2:
                    professorManager.changeProfessorNumber();
                    break;
                default:
                    if(professorOption != 3){
                        System.out.println("Invalid Choice");
                    }
                    break;
            }

        } while (professorOption != 3);
    }

    private void adjustStudents() {
        int studentOption;
        do {
            Menu.personnelAdjustments("Student");
            studentOption = Menu.getOption();
            switch (studentOption){
                case 1:
                    studentManager.changeStudentName();
                    break;
                case 2:
                    studentManager.changeStudentNumber();
                    break;
                default:
                    if(studentOption != 3){
                        System.out.println("Invalid Choice");
                    }
                    break;
            }

        } while (studentOption != 3);
    }

    private void studentHandler(Student student) {
        int studentOption;
        do {
            Menu.studentMenu();
            studentOption = Menu.getOption();
            switch (studentOption) {
                case 1:
                    courseManager.addCourseForStudent(student);
                    break;
                case 2:
                    studentManager.studentChecker(student).showPassedCourses(studentManager.studentChecker(student).getPassedCourses());
                    break;
                case 3:
                    studentManager.studentChecker(student).addWithdrawalRequest();
                    break;
                case 4:
                    studentManager.studentChecker(student).weeklyStudentSchedule(studentManager.studentChecker(student).getSelectedCourseList());
                    break;
                case 5:
                    restaurantManager.showMenu();
                    break;
                default:
                    if (studentOption != 6) {
                        System.out.println("Invalid Choice!");
                    }
                    break;
            }
        } while (studentOption != 6);
    }

    private void professorHandler(Professor professor) {
        int professorOption;
        do {
            Menu.professorMenu();
            professorOption = Menu.getOption();
            switch (professorOption) {
                case 1:
                    professorManager.professorChecker(professor).getProfessorCourseList();
                    break;
                case 2:
                    professorManager.professorChecker(professor).viewStudents();
                    break;
                case 3:
                    professorManager.professorChecker(professor).weeklyProfessorSchedule(professorManager.professorChecker(professor).getProfessorCourseList());
                    break;
                case 4:
                    professorManager.professorChecker(professor).setStudentScore(professorManager.professorChecker(professor).getProfessorCourseList());
                    break;
                default:
                    if (professorOption != 5) {
                        System.out.println("Invalid Choice!");
                    }
                    break;
            }
        } while (professorOption != 5);
    }

    private void adjustCourses() {
        int adjustmentsOption;
        do {
            Menu.adjustmentsMenu("Course");
            adjustmentsOption = Menu.getOption();
            switch (adjustmentsOption) {
                case 1:
                    courseManager.addCourse(courseManager.getCourseList());
                    break;
                case 2:
                    courseManager.removeCourse(courseManager.getCourseList());
                    break;
                case 3:
                    Menu.courseAdjustments();
                    int index = Menu.getOption();
                    while (index != 4) {
                        courseManager.changeCourseFields(index);
                        Menu.courseAdjustments();
                        index = Menu.getOption();
                    }
                    break;
                default:
                    if (adjustmentsOption != 4) {
                        System.out.println("Invalid Choice!");
                    }
                    break;
            }
        } while (adjustmentsOption != 4);
    }
}