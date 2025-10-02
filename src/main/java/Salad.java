
public class Salad extends Item {
    public Salad(String name, double price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "Salad) Name: " + getName() + "\tPrice: " + getPrice();
    }
}
