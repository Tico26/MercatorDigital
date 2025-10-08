import java.util.List;

public class Checkout {

    public String calculateFruits(List<String> items){
        if (items == null || items.isEmpty()) {
            return "£0.00";
        }
        for(int i = 0; i < items.size(); i++){
            if(items.get(i).equals("Apple")){
                return "£0.60";
            }else if(items.get(i).equals("Orange")){
                return "£0.25";
            }
        }
        return "£0.00";
    }
}
