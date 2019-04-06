package designpattern02_抽象工厂模式;

public class Demo {

    public static void main(String[] args) {
        CatFactory factory = Client.getFactory("light");

        System.out.println(factory);
        System.out.println(  factory.getLight("BMW"));

    }
}
