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
public class Manhattan extends Drink implements MakeDrink {
    /**
     *
     * @param drinkName
     * @param drinkQuantity
     */
    @Override
    public void makeDrink(String drinkName, int drinkQuantity) {
       for (int i = 0; i < drinkQuantity; i++) {
            for (String ingredient : ingredients) {
                System.out.print("Blending " + ingredient + " ");
            }
            System.out.println();
        }
       System.out.println();
    }

    //Constructor start
    public Manhattan(int drinkId, String drinkName, String[] ingredients) {
        super(drinkId, drinkName, ingredients);
        this.ingredients = new String[]{"2 oz. bourbon", "1 oz. Carpano Antica sweet vermouth", "2 dashes Angostura bitters"};
    }
    //Constructor end

}
