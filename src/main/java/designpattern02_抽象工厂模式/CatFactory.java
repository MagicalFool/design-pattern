package designpattern02_抽象工厂模式;

public abstract class CatFactory {

    public abstract Light getLight(String name);

    public abstract  Wheel getWheel(String name);

}
