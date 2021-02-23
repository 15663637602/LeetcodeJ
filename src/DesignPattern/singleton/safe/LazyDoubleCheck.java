package DesignPattern.singleton.safe;

public class LazyDoubleCheck {
    private static volatile LazyDoubleCheck lazyDoubleCheck;
    private LazyDoubleCheck(){}
    public static LazyDoubleCheck getInstance() {
        if (lazyDoubleCheck == null) {
            synchronized (LazyDoubleCheck.class) {
                if (lazyDoubleCheck == null) {
                    lazyDoubleCheck = new LazyDoubleCheck();
                }
            }
        }
        return lazyDoubleCheck;
    }
}
