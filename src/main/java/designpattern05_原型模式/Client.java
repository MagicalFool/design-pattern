package designpattern05_原型模式;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototype = new Prototype();

        prototype.setName("aaa");

        // 此刻牵扯到深克隆与浅克隆
        Prototype prototype1 = (Prototype) prototype.clone();

        System.out.println(prototype1.getName());

    }
}
