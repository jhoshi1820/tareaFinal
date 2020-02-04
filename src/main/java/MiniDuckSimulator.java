public class MiniDuckSimulator {

    public static void main(String[] args) {
        MallarDuck mallarDuck = new MallarDuck();
        mallarDuck.display();
        mallarDuck.performFly();
        mallarDuck.performQuack();

        Duck model = new ModelDuck();
        model.display();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.performFly();
        decoyDuck.performQuack();

        ReadHeadDuck readHeadDuck = new ReadHeadDuck();
        readHeadDuck.display();
        readHeadDuck.performFly();
        readHeadDuck.performQuack();

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
    }
}
