package DesignPattern.singleton.safe;

public class LazyInnerCls {
    private LazyInnerCls(){}
    private static class LazySingletonIns {
        private static final LazyInnerCls INSTANCE = new LazyInnerCls();
    }
    public static LazyInnerCls getInstance() {
        return LazySingletonIns.INSTANCE;
    }
}
