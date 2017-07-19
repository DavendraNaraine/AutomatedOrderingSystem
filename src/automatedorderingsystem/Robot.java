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
public class Robot {
    protected int robot_id;

    //Constructor start
    public Robot(int robot_id) {
        this.robot_id = robot_id;
        System.out.println("Robot did construct");
    }
    //Constructor end
    
    //Getter Setter start
    public int getRobot_id() {
        return robot_id;
    }

    public void setRobot_id(int robot_id) {
        this.robot_id = robot_id;
    }
    //Getter Setter end
}
