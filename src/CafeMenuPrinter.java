class BeachCafeMenu {
    String item;
    double price;
    boolean isVegetarian;

    BeachCafeMenu(String item, double price, boolean isVegetarian) {
        this.item = item;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }
}

public class CafeMenuPrinter {
    public static void main(String[] args) {
        BeachCafeMenu[] menu = {
                new BeachCafeMenu("Salad", 5.99, true),
                new BeachCafeMenu("Burger", 8.99, false),
                new BeachCafeMenu("Pasta", 6.99, true)
        };

        for (BeachCafeMenu item : menu) {
            if (item.isVegetarian) {
                System.out.println(item.item + " (Veg) - $" + item.price);
            }
        }
    }
}
