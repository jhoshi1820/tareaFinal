public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {

    }

    public abstract void display();

    public void swim() {
        System.out.println("All ducks float, even decoys");
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior behavior) {
        flyBehavior = behavior;
    }

    public void setQuackBehavior(QuackBehavior behavior) {
        quackBehavior = behavior;
    }
}
