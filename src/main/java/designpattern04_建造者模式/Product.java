package designpattern04_建造者模式;

public class Product {

    private String partA;

    private String partB;

    private String partC;

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }

    public void show(){
        System.out.println(partA + ":" +partB +" "+partC);
    }
}
