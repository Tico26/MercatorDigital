import java.util.List;

public class CheckoutOffer {
    private static final double APPLE_PRICE = 0.60;
    private static final double ORANGE_PRICE = 0.25;

    public String calculateFruits(List<String> items) {
        if (items == null || items.isEmpty()) {
            return "£0.00";
        }

        int appleCount = 0;
        int orangeCount = 0;

        for (int i = 0; i < items.size(); i++) {
            items.set(i, items.get(i).toLowerCase());
            if (items.get(i).equals("apple")) {
                appleCount++;
            } else if (items.get(i).equals("orange")) {
                orangeCount++;
            }
        }

        // Apply 2-for-1 offer on apples
        int payableApples = (appleCount / 2) + (appleCount % 2);

        double total = (payableApples * APPLE_PRICE) + (orangeCount * ORANGE_PRICE);

        return "£" + String.format("%.2f", total);
    }
}
