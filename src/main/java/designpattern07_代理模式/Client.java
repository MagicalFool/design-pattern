package designpattern07_代理模式;

public class Client {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new EventSender());
        proxy.sender();
    }
}
