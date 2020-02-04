public class ReadHeadDuck extends Duck {

    public ReadHeadDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    public void display() {
        System.out.println("I am a read head duck!");
    }
}
