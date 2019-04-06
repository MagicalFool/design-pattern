package designpattern01_简单工厂模式;

/**
 * 造车厂
 */
public class CreateWheelFactory {

    public CreateWheelFactory() {
    }

    // 创造奥迪车轮方法
    public static Wheel getAudiWheel(){
        return new AudiWheel();
    }

    // 创造宝马车轮方法
    public static Wheel getBMWWheel(){
        return new AudiWheel();
    }

    // 创造奔驰车轮方法
    public static Wheel getBenzWheel(){
        return new BenzWheel();
    }
}
