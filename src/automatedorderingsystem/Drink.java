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
public class Drink {
    protected int drinkId; 
    public String drinkName;
    protected String[] ingredients;

    //Constructor start
    public Drink(int drinkId, String drinkName, String[] ingredients) {    
        this.drinkId = drinkId;
        this.drinkName = drinkName;
        this.ingredients = ingredients;
    }
    //Constructor end
    
    //Getter Setter start
    public int getDrinkId() {
        return drinkId;
    }

    public void setDrinkId(int drinkId) {
        this.drinkId = drinkId;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }
    //Getter Setter end
}
