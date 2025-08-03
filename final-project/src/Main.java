import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /**
     * Grocery Shop
     * @calculate the total of grocery items chosen depending on the unit price and quantity.
     * add item to cart
     * get the price after adding the item to cart
     * */
        try {
            Scanner scanner = new Scanner(System.in);

            String[] groceryItems =  {"Apple", "Banana", "Grapes", "Orange", "Papaya", "Mango", "Dragon-Fruit", "Santol", "Pears", "Avocado", "Watermelon", "Melon", "Star-apple", "Durian", "Strawberry"};
            double[] unitPrice =    {12.0, 11.40, 25.5, 45.0, 22.5, 6.50, 10.40,12.50,200.50,85.25,55.50,155.25,2.25,100.50,233.25 };
            int[] stocks = {12,10,5,6,10,12,24,20,1,21,9,5,12,5,5};

            int option = 0;
            int complete = 0;

            ArrayList<Integer> quantity = new ArrayList<>();
            ArrayList<String> cart = new ArrayList<>();
            ArrayList<Double> price = new ArrayList<>();
            ArrayList<Double> itemTotalPrice = new ArrayList<>();

            while(option != 5 ) {
                System.out.println("\nWelcome to shopping mall! ");
                System.out.print("""
                        [0] Buy in the Grocery
                        [1] Search Item
                        [2] Calculate Average Price
                        [3] Filtered By Price
                        [4] Show all your Products!
                        [5] Exit
                        Choose Option:""");
                option = Integer.parseInt(scanner.nextLine());

                if (option > 5 || option < 0) {
                    System.out.println("Invalid Options!");
                }

                switch (option) {
                    case 0: {
                        while (complete != 1) {

                            boolean isFound = false;
                            boolean isAdded = false;
                            int i = 0;
                            int productCount = 0;

                            // Show the list of all Products
                            System.out.println("PRICE LIST");
                            showInventory(groceryItems,stocks,unitPrice);
                            // Client choose a product
                            System.out.println("CHOOSE IN THE PRODUCT LIST: ");
                            i = Integer.parseInt(scanner.nextLine());
                            //Search if the item is in the list
                            String item = groceryItems[i];
                            System.out.println("You choose: " + item);

                            int foundItem = searchItem(item, groceryItems);

                            if(foundItem != -1) {
                                if (stocks[foundItem] != 0) {
                                    do {
                                        System.out.printf("""
                                    DISCOUNT PROMO:
                                        If you buy %d pcs of this you get 20 percent discount.
                                        If you buy %d pcs of this you get 10 percent discount.
                                    """,stocks[foundItem], stocks[foundItem]/2 );
                                        System.out.println("HOW MANY (type 0 to cancel)? : ");
                                        productCount = Integer.parseInt(scanner.nextLine());
                                        if (productCount > stocks[foundItem]) {
                                            System.out.println("stocks out of range!");
                                        }
                                        else if (productCount == 0) {
                                            break;
                                        }
                                    }
                                    while (productCount > stocks[foundItem]);

                                    if(productCount != 0) {
                                        // Check if the cart is empty
                                        // Get the index of item/product
                                        int cartIndex = cart.indexOf(item);

                                        // if index is -1 means not in cart
                                        if (cartIndex == -1) {

                                            // make a new item and add to cart
                                            price.add(unitPrice[foundItem]);
                                            cart.add(item);
                                            quantity.add(cart.size() - 1, productCount);
                                            stocks[foundItem] -= productCount;
                                            isAdded = true;

                                        } else {
                                            // product is in the card, iterate the current quantity to new quantity
                                            quantity.add(cartIndex, quantity.get(cartIndex) + productCount);
                                            isAdded = true;
                                        }
                                    }
                                } else {
                                    // If not return out of stocks!
                                    System.out.println("Out of stocks!");
                                }
                            } else {
                                System.out.println("Product not found!");
                            }

                            // if added display this
                            if (isAdded) {
                                System.out.println("Successfully added " + item);
                                System.out.println("YOUR CART: ");
                                displayCart(cart, price, quantity, itemTotalPrice, groceryItems, stocks);
                            }

                            // then ask again if wanted to add more item or complete to exit
                            do {
                                System.out.print("""
                                        [0] Add item
                                        [1] Complete Transaction
                                        Choose Transaction:
                                        """);
                                complete = Integer.parseInt(scanner.nextLine());
                                if(complete < 0 || complete > 2) {
                                    System.out.println("Invalid option!");
                                }
                            } while (complete < 0 || complete > 2);

                        } // End of while loop

                        // Add all the price and store to total variable
                        double total = 0;
                        for (double n : itemTotalPrice) {
                            total += n;
                        }
                        System.out.println("YOUR CART: ");
                        displayCart(cart, price, quantity, itemTotalPrice, groceryItems, stocks);
                        // Print total
                        System.out.println("TOTAL: P" + total);
                        break;
                    }
                    case 1: {
                        String itemSearch = "";
                        System.out.println("Search for: ");
                        itemSearch = scanner.nextLine();
                        int result = searchItem(itemSearch, groceryItems);
                        if(result != -1) {
                            System.out.println("RESULT: " + itemSearch + " found in index " + result);
                        } else {
                            System.out.println("RESULT: " + itemSearch + "not found!");
                        }
                        break;
                    }
                    case 2: {
                        System.out.println("Average Price: P" + calcAveragePrice(unitPrice));
                        break;
                    }
                    case 3: {
                        System.out.println("Filter by Price of: ");
                        double filterPrice = Double.parseDouble(scanner.nextLine());
                        System.out.println(filterPrice);
                        ArrayList<String> test = filterByPrice(filterPrice, groceryItems, unitPrice);
                        for(String i: test) {
                            int x = searchItem(i,groceryItems);
                            System.out.println(i + " --- P" + unitPrice[x]);
                        }
                        break;
                    }
                    case 4: {
                        System.out.println("Inventory Item/s: ");
                        showInventory(groceryItems,stocks,unitPrice);
                        break;
                    }
                    case 5: {
                        System.out.println("Thank you for using our shop!");
                        break;
                    }
                    default: {
                        break;
                    }
                }
            }
            System.out.println("Thank you for shopping!");
        }
        catch (IndexOutOfBoundsException ioobe) {
                System.out.println(ioobe.getMessage());
        }
        catch (NumberFormatException nfe) {
            System.out.println("Improper format: " + nfe.getMessage());
        }
    }

    public static int searchItem(String item, String[] products) {
        for (int i = 0; i< products.length; i++) {
            if(products[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    public static double calcAveragePrice(double[] price) {
        double average = 0;
        for(double n : price) {
            average += n;
        }

        return average/price.length;
    }

    public static ArrayList<String> filterByPrice(double price, String[] products, double[] itemPrice) {
        ArrayList<String> filteredItem = new ArrayList<>();

        for (int i= 0; i < products.length; i++ ) {
            if(itemPrice[i] < price) {
                filteredItem.add(products[i]);
            }
        }
        return filteredItem;
    }
    public static void displayCart(ArrayList<String> cart, ArrayList<Double> price, ArrayList<Integer> quantity,ArrayList<Double> itemTotalPrice, String[] product, int[] stocks ) {
        System.out.println("####################\nCART ITEM\n--------------------");
        if (cart.isEmpty()) {
            System.out.println("No item in the cart.");
        } else {
            itemTotalPrice.clear();
            for (int i = 0; i < cart.size(); i++) {
                double priceWithDiscount = computeDiscount(cart.get(i), quantity.get(i), price.get(i), i, product, stocks );
                System.out.println(cart.get(i) + " --- P" + price.get(i) + "  X " + quantity.get(i) + " -- P" + priceWithDiscount );
                itemTotalPrice.add(i, priceWithDiscount);
            }
        }
        System.out.println("####################");
    }

    public static void showInventory(String[] product, int[] stocks, double[] price ) {
        System.out.println("STOCKS\t PRICE\t PRODUCT");
        for (int i = 0; i < product.length; i++) {
            System.out.println("[" + i + "] " + stocks[i] + " pcs\t" + "P" + price[i] + "\t" + product[i]) ;
        }
    }

    public static double computeDiscount(String item, int quantity, double price, int index, String[] products, int[] stocks ) {
        //check if stocks == 0; buy all the products
        // check if stocks == 6 lefts, buy half of it
        int i = searchItem(item,products);
        //Check the stocks,
        if (stocks[i] == 0) {
            //if zero they buy all the product item.
            return (price * quantity) * 0.20;
        } else if (stocks[i] <= quantity) {
            // if half or more of the stocks
            return (price * quantity) * 0.10;
        } else {
            // else return the price
            return price * quantity;
        }

    }
}

