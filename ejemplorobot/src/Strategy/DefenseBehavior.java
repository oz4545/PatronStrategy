package Strategy;

public class DefenseBehavior implements RobotBehavior {

    @Override
    public int moveCommand() {

        return -1;
    }
    

    @Override
    public String toString() {
        return "DefenseBehavior: " + "if you find another robot run from it";
        
    }
}
