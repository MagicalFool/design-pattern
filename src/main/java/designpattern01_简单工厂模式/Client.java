package designpattern01_简单工厂模式;

/**
 * 客户端
 */
public class Client {
    // 传入相应的参数拿相应车轮
    public static Wheel get(String name){
        if ("BWN".equals(name)){
           return CreateWheelFactory.getBMWWheel();
        }else if ("Benz".equals(name)){
           return CreateWheelFactory.getBenzWheel();
        }else if ("Audi".equals(name)){
           return CreateWheelFactory.getAudiWheel();
        }

        return null;
    }
    // 问题如果又来了个客户要比亚迪的轮子怎么办？
    // 1.重新改代码重新加一个轮子，
    // 2.重新写一个创建轮子方法，
    // 3.客户端添加比亚迪判断
}
