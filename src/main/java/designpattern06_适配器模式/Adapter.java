package designpattern06_适配器模式;

public class Adapter extends Source implements Targetable {

    public void method2() {
        System.out.println("method2");
    }
}
