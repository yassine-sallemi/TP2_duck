public class RubberDuck extends Duck implements Quackable{
    public void display(){
        System.out.println("I'm a Rubber Duck");
    }
    public void swim(){
        System.out.println("I, the Rubber Duck, am swimming");
    }
    public void quack() {
        System.out.println("I, the Rubber Duck, kinda said quack, quack");
    }

}
