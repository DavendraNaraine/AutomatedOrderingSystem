/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatedorderingsystem;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class AutomatedOrderingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Robot robot = new Robot(1);
        Order emptyOrder = new Order(1, 1, new ArrayList(), new ArrayList());
        Order filledOrder = emptyOrder.takeOrder();

        int quantityC = 0;
        for (String drinkC : filledOrder.drink) {
            if ("Martini".equals(drinkC)) {
                Martini martini = new Martini(1, "Martini", new String[3]);
                martini.makeDrink("Martini", filledOrder.quantity.get(quantityC));
            } 
            else if ("Manhattan".equals(drinkC)) {
                Manhattan manhattan = new Manhattan(2, "Manhattan", new String[3]);
                manhattan.makeDrink("Manhattan", filledOrder.quantity.get(quantityC));
            } 
            else if("Gin".equals(drinkC)) {
                Gin gin = new Gin(3, "Gin", new String[3]);
                gin.makeDrink("Gin", filledOrder.quantity.get(quantityC));
            } 
            else {
                System.out.println("Error in making drink.");
            } 
        }
    }

}
