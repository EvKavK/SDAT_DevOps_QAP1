package gamestore;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

// Unit tests for the Game Store system.
// This tests the functionality of the cart and purchase process.

public class StoreTest {

    // Verifies that the cart correctly updates its size and total price.

    @Test
    void testAddGameToCart() {
        Cart cart = new Cart();
        Game game = new Game("Minecraft", 24.99);
        cart.addGame(game);
        assertEquals(1, cart.getGames().size());
        assertEquals(24.99, cart.getTotal(), 0.01);
    }

    // Ensures the game is no longer in the cart and the cart is empty.

    @Test
    void testRemoveGameFromCart() {
        Cart cart = new Cart();
        Game game = new Game("The Legend of Zelda: Breath of the Wild", 79.99);
        cart.addGame(game);
        cart.removeGame(game);
        assertEquals(0, cart.getGames().size());
    }

    // Confirms that the store returns the correct message when trying to purchase nothing.

    @Test
    void testPurchaseEmptyCart() {
        Store store = new Store();
        Cart cart = new Cart();
        String result = store.purchase(cart);
        assertEquals("Cart is empty.", result);
    }

    // Verifies that the store returns a success message when the cart has at least one game.

    @Test
    void testSuccessfulPurchase() {
        Store store = new Store();
        Cart cart = new Cart();
        cart.addGame(new Game("Super Mario Odyssey", 79.99));
        String result = store.purchase(cart);
        assertTrue(result.contains("Purchase successful"));
    }
}