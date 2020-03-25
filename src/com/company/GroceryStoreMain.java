package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroceryStoreMain {
    public static void main(String[] args) {
        GroceryStoreFactory groceryStoreFactory = new GroceryStoreFactory();
        GroceryStore fishStore = groceryStoreFactory.getGrocery(GroceryStore.StoreType.FISH);
        GroceryStore meatStore = groceryStoreFactory.getGrocery(GroceryStore.StoreType.MEAT);
        GroceryStore vegetableStore = groceryStoreFactory.getGrocery(GroceryStore.StoreType.VEGETABLES);
        GroceryStore sweetStore = groceryStoreFactory.getGrocery(GroceryStore.StoreType.SWEETS);

        List<GroceryStore> storeList = new ArrayList<>();
        storeList.add(fishStore);
        storeList.add(meatStore);
        storeList.add(vegetableStore);
        storeList.add(sweetStore);

        fishStore.setFoods(new ArrayList<>(Arrays.asList(
                new Foods("Seabass", 6.5, 50),
                new Foods("Salmon", 8,100),
                new Foods("Dorado", 7.5, 150))));
        fishStore.setSquareStore(55.5);
        //System.out.println(fishStore);

        vegetableStore.setFoods(new ArrayList<>(Arrays.asList(
                new Foods("Greens", 1.5, 10),
                new Foods("Potatoes", 2,100),
                new Foods("Oranges", 3.5, 150),
                new Foods("Apples", 2.0, 150))));
        vegetableStore.setSquareStore(100);
        //System.out.println(vegetableStore);

        meatStore.setFoods(new ArrayList<>(Arrays.asList(
                new Foods("Poultry", 2, 150),
                new Foods("Pork", 2.5,500),
                new Foods("Beef", 3.5, 550))));
        meatStore.setSquareStore(90);

        sweetStore.setFoods(new ArrayList<>(Arrays.asList(
                new Foods("Snickers", 5, 50),
                new Foods("Mars", 5.5,60),
                new Foods("Kit-Kat", 4.5, 70))));
        sweetStore.setSquareStore(-40);

        storeList.forEach(a -> {
            a.sale();
            System.out.println(a);
        });
    }
}
