/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatedorderingsystem;

/**
 *
 * @author Administrator
 */
public class Martini extends Drink implements MakeDrink {
    /*Ingredients: 3 oz. gin or vodka, 1/2 oz. dry vermouth, Garnish with an olive*/

    /**
     *
     * @param drinkName
     * @param drinkQuantity
     */

    @Override
    public void makeDrink(String drinkName, int drinkQuantity) {
        
    }

    //Constructor start
    public Martini() {
        System.out.println("Martini did construcr");
    }
    //Constructor end 
}
