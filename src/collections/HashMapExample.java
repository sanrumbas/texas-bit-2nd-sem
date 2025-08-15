package collections;
import java.util.*;
public class HashMapExample {
    public static void main(String[] args) {
        //Create
        HashMap<String,Integer> fruitPrices = new HashMap<>();
        fruitPrices.put("Apple", 120);
        fruitPrices.put("Banana", 60);
        fruitPrices.put("Mango", 150);
        System.out.println("Initial Fruits prices: "+ fruitPrices);
        //Retrieve
        String fruitToRetrieve = "Banana";
        Integer price = fruitPrices.get(fruitToRetrieve);
        System.out.println("Price of " + fruitToRetrieve + "is: " + price);
        //Update
        fruitPrices.put("Mango", 180);
        System.out.println("After Updating Mango Price: "+ fruitPrices);
        //Delete
        fruitPrices.remove("Apple");
        System.out.println(" After Removing Apple: " + fruitPrices);
    }
}
