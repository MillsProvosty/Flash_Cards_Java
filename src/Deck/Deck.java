package Deck;

import Card.Card;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Deck {

    ArrayList cards;

    public Deck(final ArrayList cards) {
        this.cards = cards;
        System.out.println(cards);
        System.out.println("Making a Deck!");

    }

}
