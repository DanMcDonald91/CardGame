import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;


public class CardTest{

  Card seven;
  Card hearts;
  Card king;
}

// Card Tests

@Before 
public void before(){
  seven = new Card("Seven", 7);
  hearts = new Card("Hearts" , 6)
  king = new Card("King" , 10)
}

@Test
public void testGetCardValue() {
  assertEquals(7, seven.getCardValue());
}