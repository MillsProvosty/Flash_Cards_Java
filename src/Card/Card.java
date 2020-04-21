package Card;

public class Card {
    public final String question;
    public final String answer;
    public final String category;

    public Card(final String question, final String answer, final String category) {
        this.question = question;
        this.answer = answer;
        this.category = category;
    System.out.println("Making a Card!");
    }

}
