package designpattern03_单例模式;

/**
 * 恶汉式
 */
public class Singleton_m2 {

    private static Singleton_m2 instance = new Singleton_m2();

    private Singleton_m2() {
    }

    public static Object getInstance(){
        return instance;
    }

}
