package DesignPattern.factory.SimpleFactory;

public class GreekPizza extends AbsPizza{

    @Override
    void prepare() {
        System.out.println("Greek Pizza");
    }
}
