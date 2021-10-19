package com.buu.text01;

/**
 * @author wei junbin
 * @create 2021-10-19 14:19
 */
public class Test {
    public static void main(String[] args) {
        CPU cpu = new CPU(2200);
        HardDisk disk = new HardDisk(200);
        PC pc = new PC();
        pc.setCpu(cpu);
        pc.setHD(disk);
        pc.show();
    }
}
class PC{
    private CPU cpu;
    private HardDisk HD;
    protected  void show(){
        System.out.println("cpu速度"+cpu.getSpeed()+'\t'+"硬盘速度"+HD.getAmount());
    }
    public PC() {
    }
    public PC(CPU cpu, HardDisk HD) {
        this.cpu = cpu;
        this.HD = HD;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setHD(HardDisk HD) {
        this.HD = HD;
    }

    public CPU getCpu() {
        return cpu;
    }

    public HardDisk getHD() {
        return HD;
    }
}
class CPU{
    private int speed;
    public CPU() {
    }

    public CPU(int speed) {
        this.speed = speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}
class HardDisk{
    private int amount;

    public HardDisk() {
    }

    public HardDisk(int amount) {
        this.amount = amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}