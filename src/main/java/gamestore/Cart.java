package gamestore;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Game> games = new ArrayList<>();

    public void addGame(Game game) {
        games.add(game);
    }

    public void removeGame(Game game) {
        games.remove(game);
    }

    public double getTotal() {
        double total = 0;
        for (Game game : games) {
            total += game.getPrice();
            }
        return total;
    }

    public List<Game> getGames() {
        return games;
    }
}