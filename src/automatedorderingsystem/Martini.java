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
    /**
     *
     * @param drinkName
     * @param drinkQuantity
     */
    @Override
    public void makeDrink(String drinkName, int drinkQuantity) {
        for (int i = 0; i  < drinkQuantity; i ++) {
            for (String ingredient : ingredients) {
                System.out.print("Mixing " + ingredient + " ");
            }
            System.out.println("Here is your" + drinkName);
        }
        System.out.println();
    }

    //Constructor start
    public Martini(int drinkId, String drinkName, String[] ingredients) {
        super(drinkId, drinkName, ingredients);
        this.ingredients = new String[]{"3 oz. rum", "1/2 oz. dry vermouth", "Olive"};
    }
    //Constructor end 
}
