package designpattern08_装饰模式;

public class Decorator implements Sourceable {

    private Sourceable able;

    public Decorator(Sourceable able) {
        super();
        this.able = able;
    }

    public void method() {
        before();
        able.method();
        after();
    }

    public void before(){
        System.out.println("before");
    }

    public void after(){
        System.out.println("after");
    }
}
