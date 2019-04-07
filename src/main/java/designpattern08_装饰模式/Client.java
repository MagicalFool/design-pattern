package designpattern08_装饰模式;

public class Client {

    public static void main(String[] args) {
        Sourceable able = new Source();

        Sourceable obj = new Decorator(able);

        obj.method();
    }
}
