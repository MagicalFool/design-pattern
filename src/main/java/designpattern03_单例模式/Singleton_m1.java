package designpattern03_单例模式;

/**
 * 懒汉式
 */
public class Singleton_m1{

    private static Singleton_m1 instance = null;

    private Singleton_m1() {
    }

    public static Singleton_m1 getInstance(){

        if (instance == null){
            synchronized (instance){
                if (instance == null){
                    instance =  new Singleton_m1();
                }
            }

        }

        return instance;
    }
}
