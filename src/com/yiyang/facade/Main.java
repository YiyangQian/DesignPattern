package com.yiyang.facade;

public class Main {
    public static void main(String[] args) {
        ComputerFacade facade = new ComputerFacade();
        facade.start();
    }

}

class CPU {
    public void freeze() {};
    public void jump(long position) {};
    public void execute() {};
}

class HardDrive {
    public byte[] read() {
        return new byte[]{};
    };
}

class Memory {
    public void load() {};
}

/* Facade */
class ComputerFacade {
    private final CPU processor;
    private final Memory ram;
    private final HardDrive hd;

    public ComputerFacade() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();
    }

    public void start() {
        processor.freeze();
        ram.load();
        processor.jump(100);
        processor.execute();
    }
}
