
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peraa0837
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Creates kitchener as a city
        City kitchener = new City();
        
        //Creating karel the robot
        Robot karel = new Robot(kitchener, 3, 3, Direction.EAST);
        //Creating bob the robot
        Robot maria = new Robot(kitchener, 0, 1, Direction.WEST);
    }
}
