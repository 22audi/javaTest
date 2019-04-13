
/**
 * Write a description of class Robot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Robot
{
   String robotName;
   int robotSize;
    public Robot()
    {
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void moveForward(int y)
    {
        System.out.println("Robot move forward" + y + "spaces");
    
    }
    
    public boolean equals(Robot compare){
        if(compare.robotName == this.robotName && compare.robotSize == this.robotSize){
            return true;
        }
        else{
            return false;
        }
    }    
   
}