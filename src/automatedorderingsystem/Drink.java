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

    //Constructor start
    public Drink() {
        /*
        *System.out.println("Drink did construct");
        */
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
    //Getter Setter end
}
