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
public class Gin extends Drink implements MakeDrink{
    /*Ingredients: 2 oz. gin, 4 oz. tonic, 1 lime wedge*/
    
    /**
     *
     * @param drinkName
     * @param drinkQuantity
     */

    @Override
    public void makeDrink(String drinkName, int drinkQuantity) {
        
    }

    //Constructor start
    public Gin() {
        System.out.println("Gin did construct");
    }
    //Constructor end 
}
