package wissen.deckOfCards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private final List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        initializeDeck();
        shuffle();
    }

    private void initializeDeck() {
        //Calling suit Enums:  HEARTS, DIAMONDS, CLUBS, SPADES
        for (Suit suit : Suit.values()) {
            //Calling rank enums:  ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
            for (Rank rank : Rank.values()) {
                //This one we created from Deck class
                cards.add(new Card(suit, rank));
            }
        }
    }

    private void shuffle() {
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        if (cards.isEmpty()) {
            throw new IllegalStateException("The deck is empty");
        } else {
            return cards.remove(cards.size() - 1);
        }
    }

    public int size() {
        return cards.size();
    }
}
