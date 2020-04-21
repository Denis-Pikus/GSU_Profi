package com.company;

import com.store.GroceryStore;

import java.util.Arrays;
import java.util.Scanner;

public class StoreContainer<T> {
    private T[] array = (T[]) new Object[10];
    private GroceryStoreFactory factory = new GroceryStoreFactory();
    Scanner sc = new Scanner(System.in);
    private int count = 0;

    public void add(){
        if (count >= array.length) {
            T[] array1 = (T[]) new GroceryStore[array.length + array.length / 2 + 1];
            array1 = Arrays.copyOf(array, array1.length);
            array = array1;
        }
        array[count++] = (T) factory.createGrocery();
    }

    public void update(){
        System.out.println("Input element number");
        int element = sc.nextInt();
        System.out.println("Current element " + array[element]);
        array[element] = (T) factory.createGrocery();
    }

    public void delete(){
        System.out.println("Input element number");
        int element = sc.nextInt();
        System.out.println("Current element " + array[element]);
        for (int i = element; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        count--;
    }

    public T[] getArray() {return array;}

    public int size() {return count;}

    public void printAll() {
        Arrays.stream(array).filter(a -> a != null).forEach(System.out::println);
    }
}
