package wissen.deckOfCards;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();

        System.out.println("Deck size: " + deck.size());

        for (int i = 0; i < 5; i++) {
            Card card = deck.drawCard();
            System.out.println("Drawn card: " + card);
        }

        System.out.println("Deck size after drawing 5 cards: " + deck.size());
    }
}
