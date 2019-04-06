package designpattern02_抽象工厂模式;


import designpattern02_抽象工厂模式.light.AudiLight;
import designpattern02_抽象工厂模式.light.BMWLight;
import designpattern02_抽象工厂模式.light.BenzLight;

public class CreateLightFactory extends CatFactory{

    CreateLightFactory(){}

    public Light getLight(String name){
        if ("BMW".equals(name)){
            return new BMWLight();
        }else if ("Benz".equals(name)){
            return new BenzLight();
        }else if ("Audi".equals(name)){
            return new AudiLight();
        }else {

            return null;
        }

    }

    @Override
    public Wheel getWheel(String name) {
        return null;
    }


    public static Light getAudiLight(){
       return new AudiLight();
    }

    public static Light getBMWLight(){
        return new BMWLight();
    }

    public static Light getBenzLight(){
        return new BenzLight();
    }


}
