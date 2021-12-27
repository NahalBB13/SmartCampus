package ir.ac.kntu;

public class Menu {

    public static void initialMenu(){
        System.out.println("***********************************");
        System.out.println("Welcome to Online Restaurant:");
        System.out.println("1-Login to system.");
        System.out.println("2-Exit the program");
        System.out.println("***********************************");
        System.out.print("\r\nPlease select your choice: ");
    }

    public static void adminMenu(){
        System.out.println("***********************************");
        System.out.println("1-Make adjustments to a specific student");
        System.out.println("2-Make adjustments to a specific professor.");
        System.out.println("3-Make adjustments to a specific course");
        System.out.println("4-View all courses");
        System.out.println("5-View withdrawal requests");
        System.out.println("6-Exit admin menu");
        System.out.println("***********************************");
        System.out.print("\r\nPlease select your choice: ");
    }

    public static void studentMenu(String storeType){
        System.out.println("***********************************");
        System.out.println("1-Add courses for the new semester");
        System.out.println("2-view you last year's courses and average score");
        System.out.println("3-Make a withdrawal request.");
        System.out.println("4-View your weekly schedule for the new semester.");
        System.out.println("5-make meal reservations.");
        System.out.println("6-Exit student Menu.");
        System.out.println("***********************************");
        System.out.print("\r\nPlease select your choice: ");
    }

    public static void professorMenu(){
        System.out.println("***********************************");
        System.out.println("1-View this semester's courses");
        System.out.println("2-View each courses students.");
        System.out.println("3-View your weekly schedule");
        System.out.println("4-Make adjustments to student scores.");
        System.out.println("5-Exit professor menu");
        System.out.println("***********************************");
        System.out.print("\r\nPlease select your choice: ");
    }

    public static void adjustmentsMenu(String storeType){
        System.out.println("***********************************");
        System.out.println("1-Add a " + storeType);
        System.out.println("2-Remove a " + storeType);
        System.out.println("3-Make changes to a " + storeType);
        System.out.println("4-Exit adjustments menu");
        System.out.println("***********************************");
        System.out.print("\r\nPlease select your choice: ");
    }


    public static void fieldAdjustments(String storeType) {
        System.out.println("***********************************");
        System.out.println("1-change " + storeType + "'s name");
        System.out.println("2-change " + storeType + "'s address");
        System.out.println("3-change " + storeType + "'s rate");
        System.out.println("4-change " + storeType + "'s score");
        System.out.println("5-Exit field adjustment menu");
        System.out.println("***********************************");
        System.out.print("\r\nPlease select your choice: ");
    }

    public static int getOption() {
        return Integer.parseInt(ScannerWrapper.getInstance().next());
    }
}
