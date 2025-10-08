import java.util.List;

public class Checkout {
    private static final double APPLE_PRICE = 0.60;
    private static final double ORANGE_PRICE = 0.25;

    public String calculateFruits(List<String> items){
        if (items == null || items.isEmpty()) {
            return "£0.00";
        }
        double total = 0.0;

        for(int i = 0; i < items.size(); i++){
            items.set(i, items.get(i).toLowerCase());
            if(items.get(i).equals("apple")){
                total += APPLE_PRICE;
            }else if(items.get(i).equals("orange")){
                total += ORANGE_PRICE;
            }
        }
        String price = "£"+String.format("%.2f", total);
        return price;
    }
}
