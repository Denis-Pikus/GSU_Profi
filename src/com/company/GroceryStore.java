package com.company;

import java.util.ArrayList;
import java.util.Objects;

public abstract class GroceryStore {
    private ArrayList<Foods> foods;
    private double squareStore;

    public enum StoreType {
        FISH,
        MEAT,
        BREAD,
        HEALTHY_FOODS,
        VEGETABLES,
        SWEETS;
    }

    public GroceryStore() { }

    public GroceryStore(ArrayList<Foods> foods, double squareStore) {
        this.foods = foods;
        this.squareStore = squareStore;
    }

    public ArrayList<Foods> getFoods() {
        return foods;
    }

    public void setFoods(ArrayList<Foods> foods) {
        this.foods = foods;
    }

    public double getSquareStore() {
        return squareStore;
    }

    public void setSquareStore(double squareStore) {
       try{
           if(squareStore > 0)
               this.squareStore = squareStore;
       }catch (IllegalArgumentException e){
           System.out.println("The store area cannot be less than or equal to zero!");
       }

    }

    public abstract void sale();

    @Override
    public int hashCode() {
        return Objects.hash(getFoods(), getSquareStore());
    }

    //Метод который формирует "правильный" формат вывода на экран списка товаров
    private String showList(){
        StringBuilder sb = new StringBuilder();
        for (Foods food: foods) {
            sb.append(food.toString());
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return  this.getClass().getSimpleName() +
                ", square shop: " + squareStore + "m2\n" +
                "On sale today:\n" + showList();
    }
}
