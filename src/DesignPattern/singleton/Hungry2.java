package DesignPattern.singleton;

public class Hungry2 {
    private final static Hungry2 hungry;
    static {
        hungry = new Hungry2();
    }
    private Hungry2(){}
    public static Hungry2 getInstance() {
        return hungry;
    }
}
