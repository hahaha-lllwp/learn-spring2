package org.lwp.aopPackage;

public class Performance2 implements Performance{

    public void perform() {
        System.out.println("I am a performance,I'm performing");
//        throw new RuntimeException();
    }

    public void perform2() {
        System.out.println("I am a performance,I'm performing again");
    }

    public void perform3(int i) {
        System.out.println("I am a performance,I'm performing again" + i + "----------------");
    }
}
