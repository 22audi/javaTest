import java.util.Scanner;
/**
 * test 
 *
 * @author George
 * @version 1.0
 */
public class Test
{
   

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main(String [] args)
    {
        System.out.println("Hello World!");
        
        int x = 4;
        double y = 2.7;
        String z = "Hello";
        char a = 'r';
        
        System.out.println(x + ' ' + y + ' ' + z + ' ' + a);
        System.out.println(x);
        System.out.println(x + ' ');
        System.out.println(y);
        System.out.println(x + ' ' + y);
        System.out.println(x + " " + y + " " + z + " " + a);
        System.out.println(a + 1);
        String [] strings = new String [5];
        strings[0] = Integer.toString(x);
        strings[1] = Double.toString(y);
        strings[2] = z;
        strings[3] = Character.toString(a);
        System.out.println("--------");
        for (int i=0; i<=4; i+=1){
            System.out.println(i);
            System.out.println(strings[i]);
        }
        System.out.println("--------");
        int i = 0;
        while (i<=4){
        System.out.println(strings[i]);
        i += 1;
        }
        i = 0;
        do {
        System.out.println(strings[i]);
        i += 1;
        }while (i <= 4);
        
       
       Car car1 = new Car();
       
       car1.carModel = "Tesla";
       car1.carSpeed = 70;
       car1.color = "Red";
       car1.hasSunRoof = true;
       
       Car [] cars = new Car [1];
          
       cars[0] = car1;
       
       System.out.println("the car model is " + cars[0].carModel);
       cars[0].Drive(5);
       cars[0].Speed(70);
       
       Robot robot1 = new Robot();
       
       robot1.robotName = "Rob";
        robot1.robotSize = 6;
        
        Robot robot2 = new Robot();
        
        robot2.robotName = "Bob";
        robot2.robotSize = 2;
        
        Robot [] robots = new Robot [2];
        
        robots[0] = robot1;
        robots[1] = robot2;
        
        for (i = 0; i<=1; i++){
            System.out.println("index:" + i);
            System.out.println("Name:" + robots[i].robotName);
            System.out.println("Size:" + robots[i].robotSize);
            robots[i].moveForward(7);
        }

System.out.println("Model:" + robots[0].robotName);
       System.out.println("Speed:" + robots[0].robotSize);
       
       /*Scanner sc = new Scanner(System.in);
       System.out.println("enter new string");
       String input = sc.nextLine();
       System.out.println(input);*/
       
       String myStr = "Bob";
       String myOtherStr = "Bob";
       
       System.out.println(myStr==myOtherStr);
       
       Robot robot3 = new Robot();
       
       robot3.robotName = "Bob";
       robot3.robotSize = 2;
       
       System.out.println(robot2 == robot3);
       
       Robot robot4 = robot3;
       
       System.out.println(robot4 == robot3);
       
       robot4.robotName = "Bob";
       
       System.out.println(robot4.robotName);
       System.out.println(robot3.robotName);
       System.out.println("robot4:" + robot4);
       System.out.println("robot2:" + robot2);
       System.out.println("robot3:" +robot3);
       
       System.out.println(robot2 == robot3);
       System.out.println(robot3.equals(robot2));
    }
}
