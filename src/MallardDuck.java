public class MallardDuck extends Duck implements Quackable, Flyable{
    public void display(){
        System.out.println("I'm a Mallard Duck");
    }
    public void swim(){
        System.out.println("I, the Mallard Duck, am swimming");
    }

    public void quack() {
        System.out.println("I, the Mallard Duck, said quack, quack");
    }
    public void fly() {
        System.out.println("I, the Mallard Duck, fly");
    }

}
