package DesignPattern.singleton.unsafe;

public class Lazy {
    private static Lazy lazy;
    private Lazy(){}
    public static Lazy getInstance() {
        if (lazy == null) {
            lazy = new Lazy();
        }
        return lazy;
    }
}
