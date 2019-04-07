package designpattern09_外观模式;

public class Client {

    public static void main(String[] args) {
        Computer computer = new Computer(new Cpu(),new Disk(),new Memory());

        computer.start();
        computer.stop();
    }
}
