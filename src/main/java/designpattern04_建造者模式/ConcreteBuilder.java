package designpattern04_建造者模式;

public class ConcreteBuilder extends Builder {
    public void buildPartA() {
        product.setPartA("建造A");
    }

    public void buildPartB() {
        product.setPartB("建造B");
    }

    public void buildPartC() {
        product.setPartC("建造C");
    }
}
