
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

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
        karel.setLabel("K");
        //Creating bob the robot
        Robot maria = new Robot(kitchener, 0, 1, Direction.WEST);
        maria.setLabel("M");
        //Creates the things
        new Thing(kitchener, 0, 0);
        new Thing(kitchener, 1, 0);
        new Thing(kitchener, 1, 1);
        new Thing(kitchener, 1, 2);
        new Thing(kitchener, 2, 2);
        
        //Creates walls in kitchener
        new Wall(kitchener, 2, 3, Direction.NORTH);
        new Wall(kitchener, 2, 3, Direction.EAST);
        new Wall(kitchener, 2, 3, Direction.WEST);
        new Wall(kitchener, 3, 3, Direction.EAST);
        new Wall(kitchener, 3, 3, Direction.SOUTH);
        
        //Executes the routine for maria and karel
        
        maria.move();
        maria.turnLeft();
        maria.pickThing();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        maria.move();
        maria.pickThing();
        karel.move();
        karel.pickThing();
        karel.move();
        karel.turnLeft();
        karel.pickThing();
        maria.turnLeft();
        maria.move();
        maria.pickThing();
        
        
        
        
        
    }
}
