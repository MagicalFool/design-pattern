package designpattern07_代理模式;

public class Proxy implements Eventable{

    private Eventable able;

    Proxy(Eventable able){
        this.able = able;
    }


    public void sender() {
        before();
        able.sender();
        after();
    }

    public void before(){
        System.out.println("拿花");
    }

    public void after(){
        System.out.println("签字");
    }
}
