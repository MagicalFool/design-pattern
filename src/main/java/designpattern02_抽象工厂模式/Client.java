package designpattern02_抽象工厂模式;

public class Client {

    public static CatFactory getFactory(String name){
        if ("light".equals(name)){
            return new CreateLightFactory();
        }else if ("wheel".equals(name)){
            return new CreateWheelFactory();
        }
        return null;
    }
}
