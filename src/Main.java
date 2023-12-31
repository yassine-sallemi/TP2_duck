public class Main {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        RedheadDuck redheadDuck = new RedheadDuck();
        RubberDuck rubberDuck = new RubberDuck();
        DecoyDuck decoyDuck = new DecoyDuck();

        mallardDuck.display();
        mallardDuck.quack();
        mallardDuck.fly();

        redheadDuck.display();
        rubberDuck.swim();
        redheadDuck.quack();

        rubberDuck.display();
        rubberDuck.quack();

        decoyDuck.display();

    }
}