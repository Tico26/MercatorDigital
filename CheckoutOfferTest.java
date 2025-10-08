
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class CheckoutOfferTest {
    @Test
    public void testReturnZeroForEmptyList(){
        // arrange
        CheckoutOffer checkout = new CheckoutOffer();
        List<String> items = new ArrayList<>();

        // act
        String result = checkout.calculateFruits(items);

        // assert
        assertEquals("£0.00", result);
    }

    @Test
    public void testReturnZeroForNullList(){
        // arrange
        CheckoutOffer checkout = new CheckoutOffer();
        List<String> items = null;

        // act
        String result = checkout.calculateFruits(items);

        // assert
        assertEquals("£0.00", result);
    }

    @Test
    public void testSingleApple_NoOfferApplied(){
        // arrange
        CheckoutOffer checkout = new CheckoutOffer();
        List<String> items = new ArrayList<>();
        items.add("Apple");

        // act
        String result = checkout.calculateFruits(items);

        // assert
        assertEquals("£0.60", result);
    }

    @Test
    public void testTwoApples_TwoForOneOfferApplied(){
        // arrange
        CheckoutOffer checkout = new CheckoutOffer();
        List<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Apple");

        // act
        String result = checkout.calculateFruits(items);

        // assert
        assertEquals("£0.60", result);
    }

    @Test
    public void TestThreeApples_PayForTwo(){
        //arrange
        CheckoutOffer checkout = new CheckoutOffer();
        List<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Apple");
        items.add("Apple");
        // act
        String result = checkout.calculateFruits(items);

        // assert
        assertEquals("£1.20", result);
    }

    @Test
    public void testSingleOrange_NoOfferApplied(){
        // arrange
        CheckoutOffer checkout = new CheckoutOffer();
        List<String> items = new ArrayList<>();
        items.add("Orange");

        // act
        String result = checkout.calculateFruits(items);

        // assert
        assertEquals("£0.25", result);
    }

}
