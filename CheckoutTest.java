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
    
}
