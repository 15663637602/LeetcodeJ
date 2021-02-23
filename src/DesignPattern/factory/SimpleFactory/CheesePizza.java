package DesignPattern.factory.SimpleFactory;

public class CheesePizza extends AbsPizza{
    @Override
    void prepare() {
        System.out.println("Cheese Pizza");
    }
}
