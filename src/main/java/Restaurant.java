
import java.util.ArrayList;

public class Restaurant {
    private ArrayList<Item> breakFast;
    private ArrayList<Item> lunch;
    private ArrayList<Drink> drinks;
    private ArrayList<Salad> salads;
    private ArrayList<Order> orders;

    public Restaurant() {
        this.breakFast = new ArrayList<>();
        this.lunch = new ArrayList<>();
        this.drinks = new ArrayList<>();
        this.salads = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public ArrayList<Drink> getDrinks() {
        return drinks;
    }

    public void showMenu() {
        System.out.println("1 - Breakfast");
        System.out.println("2 - Lunch");
        String option = ScannerWrapper.getInstance().next();
        if (option.equals("1")) {
            showBreakFastMenu();
        } else if (option.equals("2")) {
            showLunchMenu();
        } else {
            System.out.println("incorrect Input");
            showMenu();
        }
    }

    public void showBreakFastMenu() {
        for (Item i : breakFast) {
            System.out.println(i);
        }
    }

    public void showLunchMenu() {
        System.out.println("1 - Food");
        System.out.println("2 - Salad");
        System.out.println("3 - Drink");
        String option = ScannerWrapper.getInstance().next();
        switch (option) {
            case "1":
                showFoodMenu();
                break;
            case "2":
                showSaladMenu();
                break;
            case "3":
                showDrinkMenu();
                break;
            default:
                System.out.println("Incorrect Input");
                showLunchMenu();
                break;
        }
    }

    public void showFoodMenu() {
        for (Item i : lunch) {
            System.out.println(i);
        }
    }

    public void showSaladMenu() {
        for (Item i : salads) {
            System.out.println(i);
        }
    }

    public void showDrinkMenu() {
        for (Item i : drinks) {
            System.out.println(i);
        }
    }

    public void order(Item item, Student student, String time, String place) {
        orders.add(new Order(item, student, time, place));
    }
}
