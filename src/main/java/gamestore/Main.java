package gamestore;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();

        Game game1 = new Game("Minecraft", 24.99);
        Game game2 = new Game("Super Mario Odyssey", 79.99);

        cart.addGame(game1);
        cart.addGame(game2);

        System.out.println("Games in cart:");
        for (Game game : cart.getGames()) {
            System.out.println("- " + game);
        }

        System.out.println("Total price: $" + String.format("%.2f", cart.getTotal()));

        Store store = new Store();
        String purchaseResult = store.purchase(cart);
        System.out.println(purchaseResult);
    }
}