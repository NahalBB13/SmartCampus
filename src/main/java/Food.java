
public class Food extends Item {
    public Food(String name, double price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "Food) Name: " + getName() + "\tPrice: " + getPrice();
    }
}
