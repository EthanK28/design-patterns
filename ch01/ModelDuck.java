package strategy;

public class ModelDuck extends Duck {
    public ModelDck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        system.put.println("I'm  a model duck");
    }
}
