package Turn;

import Card.Card;

public class Turn {
    public static String guess;
    public static Card card;

    public Turn(final String guess, final Card card){
        this.guess = guess;
        this.card = card;
        System.out.println("Taking a turn!");
    }

    public static boolean correct(){
        if (Turn.guess.equals(Card.answer)){
        return true;
        } else {
            return false;
        }
    }

    public String feedback(){
        if (correct() == true) {
            return "Correct!";
        } else {
            return "Incorrect.";
        }

    }


}
