package CardGame;

public class Card{

  private String suit;
  private int value;
  private String rank;

  public Card(String suit, int value, String rank) {
    this.suit = suit;
    this.value = value;
    this.rank = rank;
  }

  // Card Methods

public String getSuit(){
  return this.suit;
  }


  public int getCardValue(){
    return this.value;
  }

  public String getCardRank() {
    return this.rank;
  }


}