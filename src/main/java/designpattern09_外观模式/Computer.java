package designpattern09_外观模式;

public class Computer {

    private Cpu cpu;

    private Disk disk;

    private Memory memory;


    public Computer(Cpu cpu, Disk disk, Memory memory) {
        this.cpu = cpu;
        this.disk = disk;
        this.memory = memory;
    }

    public void start(){
        cpu.start();
        disk.start();
        memory.start();
    }

    public void stop(){
        cpu.stop();
        disk.stop();
        memory.stop();
    }
}
