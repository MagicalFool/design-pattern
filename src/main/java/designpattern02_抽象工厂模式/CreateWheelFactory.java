package designpattern02_抽象工厂模式;


import designpattern02_抽象工厂模式.wheel.AudiWheel;
import designpattern02_抽象工厂模式.wheel.BMWWheel;
import designpattern02_抽象工厂模式.wheel.BenzWheel;

public class CreateWheelFactory extends CatFactory{


    public CreateWheelFactory() {
    }

    @Override
    public Light getLight(String name) {
        return null;
    }

    public Wheel getWheel(String name){
        if ("BMW".equals(name)){
            return new BMWWheel();
        }else if ("Benz".equals(name)){
            return new BenzWheel();
        }else if ("Audi".equals(name)){
            return new AudiWheel();
        }else {

            return null;
        }

    }
//    // 创造奥迪车轮方法
//    public static Konghu23.zhaoshi1_工厂方法模式.Wheel getAudiWheel(){
//        return new AudiWheel();
//    }
//
//    // 创造宝马车轮方法
//    public static Konghu23.zhaoshi1_工厂方法模式.Wheel getBMWWheel(){
//        return new AudiWheel();
//    }
//
//    // 创造奔驰车轮方法
//    public static Wheel getBenzWheel(){
//        return new BenzWheel();
//    }
}
