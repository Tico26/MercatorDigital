import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class CheckoutTest {
    @Test
    public void testReturnIfZero(){
        //Arrange
        Checkout checkout = new Checkout();
        List<String> items = new ArrayList<>();
        //Act
        String result = checkout.calculateFruits(items);
        //Assert
        assertEquals("£0.00", result);
    }
    @Test
    public void testReturnIfNull(){
        //Arrange
        Checkout checkout = new Checkout();
        List<String> items = null;
        //Act
        String result = checkout.calculateFruits(items);
        //Assert
        assertEquals("£0.00", result);
    }
    @Test
    public void testInvalidItems(){
        //arrange
        Checkout checkout = new Checkout();
        List<String> items = new ArrayList<>();
        items.add("banana");

        //act
        String result = checkout.calculateFruits(items);
        //assert
        assertEquals("£0.00", result);
    }

    @Test
    public void testReturnPriceIfOneApple(){
        //arrange
        Checkout checkout = new Checkout();
        List<String> items = new ArrayList<>();
        items.add("Apple");
        //act
        String result = checkout.calculateFruits(items);
        //assert
        assertEquals("£0.60", result);
    }

    @Test
    public void testReturnPriceIfOneOrange(){
        //arrange
        Checkout checkout = new Checkout();
        List<String> items = new ArrayList<>();
        items.add("Orange");
        //act
        String result = checkout.calculateFruits(items);
        //assert
        assertEquals("£0.25", result);
    }

    @Test
    public void testReturnPriceIfApplesAndOranges(){
        //arrange
        Checkout checkout = new Checkout();
        List<String> items = new ArrayList<>();
        items.add("Orange");
        items.add("Apple");
        items.add("Apple");
        items.add("Apple");
        //act
        String result = checkout.calculateFruits(items);
        //assert
        assertEquals("£2.05", result);
    }
}
