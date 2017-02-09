
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peraa0837
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Creates kitchener as a city
        City kitchener = new City();
        
        //Creating karel the robot
        Robot karel = new Robot(kitchener, 0, 0, Direction.SOUTH);
        //Creating bob the robot
        Robot bob = new Robot(kitchener, 0, 1, Direction.SOUTH);
        
        //Creates the walls in kitchener
        new Wall(kitchener, 0, 1, Direction.WEST);
        new Wall(kitchener, 1, 1, Direction.WEST);
        new Wall(kitchener, 1, 1, Direction.SOUTH);
        
        /**Alternating karel and bob's commands so that they arrive at 
         * approximately the same time
         */
       karel.move();
       bob.move();
       karel.move();
       bob.turnLeft();
       karel.turnLeft();
       bob.move();
       bob.turnLeft();
       bob.turnLeft();
       bob.turnLeft();
       bob.move();
       bob.turnLeft();
       karel.move();
       bob.turnLeft();
       bob.turnLeft();
       bob.move();
        
    }
}
