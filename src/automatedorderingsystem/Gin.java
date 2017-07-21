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
public class Gin extends Drink implements MakeDrink {

    /*Ingredients: 2 oz. gin, 4 oz. tonic, 1 lime wedge*/

    /**
     *
     * @param drinkName
     * @param drinkQuantity
     */
    @Override
    public void makeDrink(String drinkName, int drinkQuantity) {
        for (int i = 0; i < drinkQuantity; i++) {
            for (String ingredient : ingredients) {
                System.out.print("Shaking " + ingredient + " ");
            }
            System.out.println("Here is your" + drinkName);
        }
        System.out.println();
    }

    //Constructor start
    public Gin(int drinkId, String drinkName, String[] ingredients) {
        super(drinkId, drinkName, ingredients);
        this.ingredients = new String[]{"2 oz. gin", "4 oz. tonic", "1 lime wedge"};
    }
    //Constructor end 
}
