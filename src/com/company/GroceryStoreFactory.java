package com.company;

public class GroceryStoreFactory {
    public GroceryStore getGrocery(GroceryStore.StoreType type){
        GroceryStore toReturn = null;
        switch (type) {
            case MEAT:
                toReturn = new MeatStore();
                break;
            case FISH:
                toReturn = new FishStore();
                break;
            case SWEETS:
                toReturn = new SweetStore();
                break;
            case VEGETABLES:
                toReturn = new VegetableStore();
                break;
            default:
                throw new IllegalArgumentException("Wrong GroceryStore type:" + type);
        }
        return toReturn;
    }
    
}
