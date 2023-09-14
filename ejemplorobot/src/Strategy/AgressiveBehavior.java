package Strategy;

public class AgressiveBehavior implements RobotBehavior{

    @Override
    public int moveCommand() {

        return 1;
    }

    @Override
    public String toString() {
        return "AgressiveBehavior: " + "If you find another robot attack it";
    }
    
    
}
