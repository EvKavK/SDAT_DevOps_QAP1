package gamestore;

public class Store {
    public String purchase(Cart cart) {
        double total = cart.getTotal();
        if (total <= 0) {
            return "Cart is empty.";
        }
        return "Purchase successful. Total: $" + String.format("%.2f", total);
    }
}