/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatedorderingsystem;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Order {
    protected int order_id;
    public int table_id;
    public ArrayList<Integer> quantity = new ArrayList<>();
    public ArrayList<String> drink = new ArrayList<>();

    //Constructor start
    public Order(int order_id, int table_id, ArrayList<Integer> quantity, ArrayList<String> drink) {
        this.order_id = order_id;
        this.table_id = table_id;
        this.quantity = quantity;
        this.drink = drink;
    }
    //Constructor end
    
    //Getter Setter start
    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getTable_id() {
        return table_id;
    }

    public void setTable_id(int table_id) {
        this.table_id = table_id;
    }

    public ArrayList<Integer> getQuantity() {
        return quantity;
    }

    public void setQuantity(ArrayList<Integer> quantity) {
        this.quantity = quantity;
    }

    public ArrayList<String> getDrink() {
        return drink;
    }

    public void setDrink(ArrayList<String> drink) {
        this.drink = drink;
    }
    //Getter Setter end

    //Other Functions
    public Order takeOrder() {
        Scanner decisionScanner = new Scanner(System.in);
        Scanner drinkScanner = new Scanner(System.in);
        Scanner quantityScanner = new Scanner(System.in);
        String decision;
        String drinkName;
        int drinkQuantity;

        do {
            System.out.println("Would you like me to take your order? Yes or No");
            decision = decisionScanner.next();

            if ("yes".equals(decision)) {
                System.out.println("Choose a drink: Martini, Manhattan, Gin");
                drinkName = drinkScanner.next();

                if ("Martini".equals(drinkName) || "Manhattan".equals(drinkName) || "Gin".equals(drinkName)) {
                    drink.add(drinkName);

                    System.out.println("How many " + drinkName + "s would you like?");
                    drinkQuantity = quantityScanner.nextInt();
                    quantity.add(drinkQuantity);
                } 
                else {
                    System.out.println("Please choose from the list.");
                }
            } 
            else {
                System.out.println("Okay thank you.");
            }
        } while (decision.equals("yes"));
        
        return new Order(order_id, table_id, quantity, drink);
    }
}
