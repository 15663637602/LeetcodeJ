package DesignPattern.singleton.safe;

public class Lazy {
    private static Lazy lazy;
    private Lazy(){}
    public static synchronized Lazy getInstance() {
        if (lazy == null) {
            lazy = new Lazy();
        }
        return lazy;
    }
}
