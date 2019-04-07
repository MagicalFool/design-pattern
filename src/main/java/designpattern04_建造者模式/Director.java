package designpattern04_建造者模式;

public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    /**
     * 其实是指挥者来建造
     * @return
     */
    public Product construct(){
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();

        return builder.getResult();
    }
}
