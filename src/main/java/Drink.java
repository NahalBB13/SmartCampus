
public class Drink extends Item {
    public Drink(String name, double price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "Drink) Name: " + getName() + "\tPrice: " + getPrice();
    }
}
