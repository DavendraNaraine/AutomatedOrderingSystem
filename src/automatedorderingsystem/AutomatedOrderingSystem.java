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
        Order emptyOrder = new Order(1, 1, new ArrayList(), new ArrayList());
        Order filledOrder = emptyOrder.takeOrder();
    }
    
}
