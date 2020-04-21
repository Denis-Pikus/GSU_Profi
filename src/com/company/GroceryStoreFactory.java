package com.company;

import com.store.*;

import java.util.Scanner;

public class GroceryStoreFactory {

        Scanner sc = new Scanner(System.in);
        public GroceryStore createGrocery(){
            System.out.println("1 - create meat store");
            System.out.println("2 - create fish store");
            System.out.println("3 - create sweet store");
            System.out.println("4 - create vegetable store");
            int type = sc.nextInt();
            GroceryStore result = null;
                switch (type) {
                    case 1:
                    result = new MeatStore();
                    break;
                case 2:
                    result = new FishStore();
                    break;
                case 3:
                    result = new SweetStore();
                    break;
                case 4:
                    result = new VegetableStore();
                    break;
                default:
                    throw new IllegalArgumentException("Wrong GroceryStore type:" + type);
            }
            System.out.println("Enter square store:");
            result.setSquareStore(sc.nextDouble());
            System.out.println("Enter food:");
            System.out.println("When finished typing \"end\"");
            String input = "";
            while (!(input = sc.nextLine()).equals("end")){
                result.setFoods(input);
            }
        return result;
        }

}
