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
        for(String ingredient : ingredients){
            System.out.println("Mixing " + ingredient);
        }
    }

    //Constructor start
    public Martini(int drinkId, String drinkName, String[] ingredients) {
        super(drinkId, drinkName, ingredients);
        this.ingredients = new String[]{"3 oz. gin", "1/2 oz. dry vermouth", "Olive"};
    }
    //Constructor end 
}
