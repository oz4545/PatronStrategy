import Strategy.AgressiveBehavior;
import Strategy.DefenseBehavior;
import Strategy.Robot;

public class App {
    public static void main(String[] args) throws Exception {
        Robot Wally = new Robot();
        Wally.setName("Wally");
        Wally.setBehavior
            (new AgressiveBehavior());
            System.out.println(Wally.getName());
        Wally.move();

        Robot Bender = new Robot();
        Bender.setName("Bender");
        Bender.setBehavior
            (new DefenseBehavior());
            System.out.println(Bender.getName());
        Bender.move();

    }
}
