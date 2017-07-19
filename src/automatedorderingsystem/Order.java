/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatedorderingsystem;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Order {
    protected int order_id;
    public int table_id;
    public int[] quantity;
    public String[] drink;
    
    //Constructor start
    public Order() {
        System.out.println("Order did construct");
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

    public int[] getQuantity() {
        return quantity;
    }

    public void setQuantity(int[] quantity) {
        this.quantity = quantity;
    }

    public String[] getDrink() {
        return drink;
    }

    public void setDrink(String[] drink) {
        this.drink = drink;
    }
    //Getter Setter end
    
    //Other functions
    public void takeOrder() {
        int i = 0; 
        
        System.out.println("Would you like me to take your order? Yes or No");
        
        Scanner scanner = new Scanner(System.in);
        String decision =  scanner.next();
        
        while("yes".equals(decision)) {
            System.out.println("Choose a drink: Martini, Manhattan, Gin And Tonic");
            
            Scanner drinkScanner = new Scanner(System.in);
            String drinkName = drinkScanner.next();
            
            if("Martini".equals(drinkName) || "Manhattan".equals(drinkName) || "Gin And Tonic".equals(drinkName)){
                drink[i] = drinkName;
                
                Scanner quantityScanner = new Scanner(System.in);
                int drinkQuantity = quantityScanner.nextInt();
                quantity[i] = drinkQuantity;
            } else {
                System.out.println("Please choose from the list above");
            }
        }
    }
}
