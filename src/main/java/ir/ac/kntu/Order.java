package ir.ac.kntu;

public class Order {
    private Item item;
    private Student student;
    private String time;
    private String place;

    public Order(Item item, Student student, String time, String place) {
        this.item = item;
        this.student = student;
        this.time = time;
        this.place = place;
    }

    public Item getItem() {
        return item;
    }

    public String getPlace() {
        return place;
    }

    public String getTime() {
        return time;
    }

    public Student getStudent() {
        return student;
    }

}
