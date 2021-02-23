package DesignPattern.factory.SimpleFactory;

public abstract class AbsPizza {
    protected String name;

    abstract void prepare();

    void bake() {
        System.out.println(name + "baking");
    }

    void cut() {
        System.out.println(name + "cutting");
    }

    void setName(String name) {
        this.name = name;
    }
}
