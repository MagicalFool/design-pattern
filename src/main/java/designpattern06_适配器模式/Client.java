package designpattern06_适配器模式;

public class Client {

    public static void main(String[] args) {

        // 具体原理
        Targetable target = new Adapter();
        target.method1();
        target.method2();
    }
}
