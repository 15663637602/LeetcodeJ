package DesignPattern.singleton.safe;

enum SingletonEnum {
    INSTANCE;
}
public class LazyEnum {
    public static void main(String[] args) {
        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
        SingletonEnum singletonEnum2 = SingletonEnum.INSTANCE;
        System.out.println(singletonEnum == singletonEnum2);
    }

}
