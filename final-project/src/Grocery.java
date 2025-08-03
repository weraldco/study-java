import java.awt.*;
import java.util.ArrayList;

public class Grocery {

    int size = 0;
    private final ArrayList<String> groceryItems ;
    private final ArrayList<Double> unitPrice;
    public  Grocery(int size, ArrayList<String> groceryItems, ArrayList<Double> unitPrice) {
        this.size = size;
        this.groceryItems = groceryItems;
        this.unitPrice = unitPrice;
    }

    void showProductList() {
        System.out.println("""
                ##########
                PRODUCTS
                ##########
                ----------""");
        for (int i = 0; i < groceryItems.size(); i++) {
            System.out.println(groceryItems.get(i) + " --- P" + unitPrice.get(i));
        }

    }
}
